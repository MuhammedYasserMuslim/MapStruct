package com.spring.controller;

import com.spring.model.Doctor;
import com.spring.services.DoctorServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController {


    private final DoctorServices doctorServices;


    @GetMapping("/doctors")
    public List<Doctor> findAll(){
        return doctorServices.findAll();
    }
}
