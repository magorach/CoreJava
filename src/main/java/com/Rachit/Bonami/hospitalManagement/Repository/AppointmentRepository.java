package com.Rachit.Bonami.hospitalManagement.Repository;

import com.Rachit.Bonami.hospitalManagement.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}