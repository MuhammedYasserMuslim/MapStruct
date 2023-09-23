package com.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class DeveloperDto {

    private Long id;
    private String developerName;
    private double salary;
}
