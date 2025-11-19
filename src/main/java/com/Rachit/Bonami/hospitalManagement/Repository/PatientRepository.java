package com.Rachit.Bonami.hospitalManagement.Repository;
import com.Rachit.Bonami.hospitalManagement.Dto.BloodGroupCountResponseEntity;
import com.Rachit.Bonami.hospitalManagement.Entity.Patient;
import com.Rachit.Bonami.hospitalManagement.Entity.type.BloodGroupType;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.service.annotation.PatchExchange;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {


    Patient findByName(String name);

    boolean existsByName(String name);

    Patient findByBirthDate(LocalDateTime dob);

    @Query("Select p from Patient p where p.name = :name")
    List<Patient> findByNames(@Param("name") String name);

    @Query("Select p from Patient p where p.name = :name AND p.gender = :gender")
    List<Patient> findByNameAndGender(@Param("name") String name, @Param("gender") String gender);

    @Query(value = "Select * from patient_table Where name= :name", nativeQuery = true)
    List<Patient> findByNameNative (@Param("name") String name);

    @Query("Select p from Patient p where p.bloodGroup = :bloodGroup")
    List<Patient> findByBloodGroup(@Param("bloodGroup") BloodGroupType bloodGroup);

    @Query("Select p from Patient p where p.birthDate > :birthDate")
    List<Patient> findByBornAfterDate (@Param("birthDate") LocalDateTime birthDate);

    @Query("Select new com.Rachit.Bonami.hospitalManagement.Dto.BloodGroupCountResponseEntity(p.bloodGroup,Count(p))from Patient p Group By p.bloodGroup")
    List<BloodGroupCountResponseEntity> countEachBloodGroupType();
    //    List<Object[]> countByBloodGroup();

    //native queries
    @Query(value = "Select * from patient_tbl", nativeQuery = true)
    Page<Patient> findAllPatients(Pageable pageable);

    @Transactional
    @Modifying
    @Query("Update Patient p Set p.name = :name Where p.id = :id")
     int updateNameWithId (@Param("name")String name , @Param("id")Long id );

}


