package com.Rachit.Bonami.hospitalManagement.Repository;

import com.Rachit.Bonami.hospitalManagement.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    
}