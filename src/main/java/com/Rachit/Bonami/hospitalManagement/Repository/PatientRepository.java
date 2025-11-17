package com.Rachit.Bonami.hospitalManagement.Repository;

import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

}
