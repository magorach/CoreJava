package com.Rachit.Bonami.hospitalManagement.Repository;

import com.Rachit.Bonami.hospitalManagement.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}