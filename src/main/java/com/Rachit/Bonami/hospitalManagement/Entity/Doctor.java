package com.Rachit.Bonami.hospitalManagement.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.LifecycleState;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(nullable = false,length = 100)
    private String name;

    @Column(length = 100, nullable = false)
    private String specialization;

    @Column(nullable = false, unique = true,length = 100)
    private String email;

    @OneToMany(mappedBy = "doctor")
    @ToString.Exclude
    private List<Appointment> appointments;

    @ManyToMany(mappedBy = "doctors")
    @ToString.Exclude
    private Set<Department> departments = new HashSet<>();


    @OneToOne(mappedBy = "headDoctor")
    @ToString.Exclude
    private Department department;


}
