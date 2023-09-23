package com.spring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "doctors")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name",length = 21,nullable = false,unique = true)
    @NotBlank(message = "name is required")
    private String name;

    @Column(name = "age",nullable = false)
    private float age;



}
