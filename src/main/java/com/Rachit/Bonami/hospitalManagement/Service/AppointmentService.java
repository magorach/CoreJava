package com.Rachit.Bonami.hospitalManagement.Service;

import com.Rachit.Bonami.hospitalManagement.Entity.Appointment;
import com.Rachit.Bonami.hospitalManagement.Entity.Doctor;
import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import com.Rachit.Bonami.hospitalManagement.Repository.AppointmentRepository;
import com.Rachit.Bonami.hospitalManagement.Repository.DoctorRepository;
import com.Rachit.Bonami.hospitalManagement.Repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

import javax.print.Doc;

@Service
@RequiredArgsConstructor
@ToString
public class AppointmentService {

    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;
    private final AppointmentRepository appointmentRepository;

    @Transactional
    public Appointment createNewAppointmentForPatient(Appointment appointment, Long patientId, Long doctorId){
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow(()->new EntityNotFoundException("Doctor not found with id"+" "+doctorId));
        Patient patient = patientRepository.findById(patientId).orElseThrow(()-> new EntityNotFoundException(" Patient not found with id :"+ patientId));

        if(appointment.getId() != null) throw  new IllegalArgumentException("Appointment already exists with id: "+ appointment.getId());
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        patient.getAppointments().add(appointment); // bidirectional consistency
         return appointmentRepository.save(appointment);

    }

    @Transactional
    public Appointment reassigningAppointmentToAnotherDoctor(Long appointmentId,Long doctorId){
        Appointment appointment = appointmentRepository.findById(appointmentId).orElseThrow();
        Patient patient = appointment.getPatient();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();
        appointment.setDoctor(doctor); // this will automatically call the updates, because it's dirty
        doctor.getAppointments().add(appointment);  // just for bidirectional consistency
        return appointment;
    }

}
