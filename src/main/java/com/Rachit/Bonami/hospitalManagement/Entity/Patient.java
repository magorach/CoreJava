package com.Rachit.Bonami.hospitalManagement.Entity;

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
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name= "patient_tbl",
        uniqueConstraints = {
//                @UniqueConstraint(name ="unique_patient_email",columnNames = {"email"}),
                @UniqueConstraint(name = "unique_patient_by_name_birthdate",columnNames = {"name","birthDate"})
        },
        indexes = {
                @Index(name = "idx_patient_birthdate", columnList = "birthDate")
        }

)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient_name",nullable = false )
    private String name;

    private String bloodGroup;

    private LocalDateTime birthDate;

    private String gender;

    @Column( unique = true,nullable = false)
    private String email;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
}

