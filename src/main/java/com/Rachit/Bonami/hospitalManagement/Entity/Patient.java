package com.Rachit.Bonami.hospitalManagement.Entity;

import com.Rachit.Bonami.hospitalManagement.Entity.type.BloodGroupType;
import com.sun.tools.javac.Main;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Entity
@Table(
        name = "patient_tbl",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "unique_patient_by_name_birthdate",
                        columnNames = {"name", "birth_date"}
                )
        },
        indexes = {
                @Index(name = "idx_patient_birthdate", columnList = "birth_date")
        }
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "blood_group")
    private BloodGroupType bloodGroup;

    @Column(name = "birth_date", nullable = false)
    private LocalDateTime birthDate;

    private String gender;

    @Column(unique = true, nullable = false)
    private String email;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}
