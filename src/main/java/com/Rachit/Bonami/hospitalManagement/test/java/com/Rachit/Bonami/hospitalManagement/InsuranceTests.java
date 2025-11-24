package com.Rachit.Bonami.hospitalManagement;

import com.Rachit.Bonami.hospitalManagement.Entity.Insurance;
import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import com.Rachit.Bonami.hospitalManagement.Service.InsuranceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class InsuranceTests {


    @Autowired
    private InsuranceService insuranceService;

    @Test
    public void testInsurance(){

        // this will create instance of insurance by using builder pattern
        Insurance insurance = Insurance.builder()
                .policyNumber("HDFC_1234")
                .provider("HDFC")
                .validUntil(LocalDate.of(2030,12,12))
                .build();

        Patient patient = insuranceService.assignInsuranceToPatient(insurance, 1L);
        System.out.println(patient);

        Patient patient1 = insuranceService.disassociateInsuranceFromPatient(patient.getId());
        System.out.println(patient1);

    }
}
