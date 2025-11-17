package com.Rachit.Bonami.hospitalManagement.Controllers;

import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import com.Rachit.Bonami.hospitalManagement.Service.PatientService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospital")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/welcome")
    public String doGreeting(){
        return "Welcome to Hospital";
    }

    @GetMapping("/{id}")
    public Patient getPatientByIdentity(@PathVariable Long id){
        return patientService.getPatientById(id);
    }


}
