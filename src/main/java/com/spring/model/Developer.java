package com.spring.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.enums.Framework;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "developers")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name",length = 21,nullable = false,unique = true)
    @NotBlank(message = "name is required")
    private String name;

    @NotEmpty
    @Column(name = "salary")
    private Double salary;

    @Email
    @Column(name = "email",unique = true)
    private String email;

    @NotEmpty
    @Enumerated(EnumType.STRING)
    private Framework framework;


    @ManyToOne
    @JoinColumn(name = "department_id")
    @JsonIgnore
    private Department department;
}
