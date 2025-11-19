package com.Rachit.Bonami.hospitalManagement;

import com.Rachit.Bonami.hospitalManagement.Dto.BloodGroupCountResponseEntity;
import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import com.Rachit.Bonami.hospitalManagement.Entity.type.BloodGroupType;
import com.Rachit.Bonami.hospitalManagement.Repository.PatientRepository;
import com.Rachit.Bonami.hospitalManagement.Service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class HospitalManagementApplicationTests {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientRepository patientRepository;

//    @Test
//    void testPatientRepository() {
//        List<Patient> patientList = patientRepository.findAll();
//        System.out.println(patientList);
//    }

    @Test
    void testTransaction() {
//        Patient patient = patientService.getPatientById(1L);
//        System.out.println(patient);
//
//       String result =patientService.checkPatientByName("Vikas Singh");
//        System.out.println(result);
//        List<Patient> patients= patientRepository.findByBloodGroup(BloodGroupType.A_POSITIVE);
//        patients.forEach(System.out::println);

//
//        List<Patient> patients =patientRepository.findByBornAfterDate(LocalDateTime.of(1990, 2, 14, 0, 0));
//        patients.forEach(System.out::println);

//        List<Object[]> bloodGroupList = patientRepository.countByBloodGroup();
//        for (Object[] objects:bloodGroupList){
//            System.out.println(objects[0] +" "+ objects[1]);
//        }
//
//        int updateName = patientRepository.updateNameWithId("Aakash Jain", 6L);
//        System.out.println(updateName);
//        List<BloodGroupCountResponseEntity> bloodGroupCountResponseEntities = patientRepository.countEachBloodGroupType();
//        System.out.println(bloodGroupCountResponseEntities);

        Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(1,3, Sort.by("name")));
        System.out.println(patientList.getContent());

    }
}
