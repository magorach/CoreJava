package com.Rachit.Bonami.hospitalManagement.Service;

import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import com.Rachit.Bonami.hospitalManagement.Repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hibernate.procedure.ParameterTypeException;
import org.springframework.stereotype.Service;
import org.springframework.web.service.annotation.PatchExchange;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    @Transactional
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("no patient found"));
    }
    public String checkPatientByName(String name) {
        boolean exists = patientRepository.existsByName(name);
        if (exists) {
            return "Patient exists";
        } else {
            return "Patient does not exist";
        }
    }

    public Patient getPatientInfoFromDb(String dobStr) {
        // Parse string to LocalDate
        LocalDate dob = LocalDate.parse(dobStr); // yyyy-MM-dd format

        // Convert to start of day LocalDateTime if your DB column is LocalDateTime
        LocalDateTime dobDateTime = dob.atStartOfDay();

        return patientRepository.findByBirthDate(dobDateTime);
    }

    public  String deletePatient (Long patientId){
        patientRepository.deleteById(patientId);
        return "Patient deleted successfully";
    }
    
}
