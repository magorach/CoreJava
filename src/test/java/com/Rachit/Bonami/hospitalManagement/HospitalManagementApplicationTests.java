package com.Rachit.Bonami.hospitalManagement;

import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import com.Rachit.Bonami.hospitalManagement.Repository.PatientRepository;
import com.Rachit.Bonami.hospitalManagement.Service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HospitalManagementApplicationTests {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientRepository patientRepository;

	@Test
	void testPatientRepository () {
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
	}

    @Test
    void testTransaction(){
        Patient patient = patientService.getPatientById(1L);
        System.out.println(patient);

    }

}
