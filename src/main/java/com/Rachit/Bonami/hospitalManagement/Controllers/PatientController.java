package com.Rachit.Bonami.hospitalManagement.Controllers;

import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import com.Rachit.Bonami.hospitalManagement.Service.PatientService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospital")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/welcome")
    public String doGreeting() {
        return "Welcome to Hospital";
    }

    @GetMapping("/{id}")
    public Patient getPatientByIdentity(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    @GetMapping("/check")
    public String getPatientInfoFromDb(@RequestParam String name) {
        return patientService.checkPatientByName(name);
    }

    @GetMapping("/checkByDOB")
    public Patient getPatientInfoByDOB(@RequestParam("DOB") String dobStr) {
        return patientService.getPatientInfoFromDb(dobStr);

    }


}
