package com.Rachit.Bonami.hospitalManagement;

import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import com.Rachit.Bonami.hospitalManagement.Repository.PatientRepository;
import com.Rachit.Bonami.hospitalManagement.Service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;



    @Test
    public void testPatientRepository(){
    Patient all = patientService.getPatientById(1L);
    }
}
