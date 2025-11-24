package com.Rachit.Bonami.hospitalManagement;

import com.Rachit.Bonami.hospitalManagement.Entity.Appointment;
import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import com.Rachit.Bonami.hospitalManagement.Repository.PatientRepository;
import com.Rachit.Bonami.hospitalManagement.Service.AppointmentService;
import com.Rachit.Bonami.hospitalManagement.Service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class AppointmentTest {

    @Autowired
    private AppointmentService appointmentService;
    
    @Autowired 
    private PatientService patientService;

    @Autowired
    private PatientRepository patientRepository;
    
    @Test
    public void createAppointmentForPatient(){
        Appointment appointment1 = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2025,11,1,14,00,0))
                .reason("Cancer")
                .build();

        Appointment appointment2 = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2025,11,6,14,00,0))
                .reason("Skin")
                .build();

        Appointment appointment3= Appointment.builder()
                .appointmentTime(LocalDateTime.of(2025,11,15,14,00,0))
                .reason("Joint's pain")
                .build();

        var firstAppointmentForPatient = appointmentService.createNewAppointmentForPatient(appointment1, 1L, 1L);
        var secondAppointmentForPatient = appointmentService.createNewAppointmentForPatient(appointment2, 1L, 2L);
        var thirdAppointmentForPatient = appointmentService.createNewAppointmentForPatient(appointment3, 1L, 3L);

        String s = patientService.deletePatient(1L);
        System.out.println("Delete operation done");

//        var newAppointmentForPatient = appointmentService.createNewAppointmentForPatient(appointment, 3L, 2L);
//        System.out.println(newAppointmentForPatient);

        patientRepository.findAll();


//        var appointment1 = appointmentService.reassigningAppointmentToAnotherDoctor(newAppointmentForPatient.getId(), 1L);
//        System.out.println(appointment1);
    }
}
