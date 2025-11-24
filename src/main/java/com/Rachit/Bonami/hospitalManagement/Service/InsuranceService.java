package com.Rachit.Bonami.hospitalManagement.Service;

import com.Rachit.Bonami.hospitalManagement.Entity.Insurance;
import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import com.Rachit.Bonami.hospitalManagement.Repository.InsuranceRepository;
import com.Rachit.Bonami.hospitalManagement.Repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.service.annotation.PatchExchange;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private  final PatientRepository patientRepository;

@Transactional
    public Patient assignInsuranceToPatient(Insurance insurance, Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow(()->new EntityNotFoundException("Patient Not Found with id: "+ patientId));
        patient.setInsurance(insurance);
        insurance.setPatient(patient); // bidirectional consistence maintenance
        return patient;
    }

    @Transactional
    public Patient disassociateInsuranceFromPatient(Long patientId){
        Patient patient = patientRepository.findById(patientId).orElseThrow(()->new EntityNotFoundException("Patient Not Found with id: "+ patientId));
        patient.setInsurance(null);
        return patient;


    }
}
