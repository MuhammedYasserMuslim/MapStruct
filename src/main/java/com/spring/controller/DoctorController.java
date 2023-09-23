package com.spring.controller;

import com.spring.model.Doctor;
import com.spring.services.DoctorServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController {


    private final DoctorServices doctorServices;

    @GetMapping("/count")
    public Long count() {
        return doctorServices.count();
    }


    @GetMapping("/doctors")
    public List<Doctor> findAll(){
        return doctorServices.findAll();
    }
    @GetMapping("/doctor")
    public Optional<Doctor> findById(@RequestParam Long id) {
        return doctorServices.findById(id);
    }

    @PostMapping("/doctor")
    public Doctor insert(Doctor doctor) {
        doctorServices.insert(doctor);
        return doctor;
    }

    @PutMapping("/doctor")
    public Doctor update(Doctor doctor) {
        doctorServices.update(doctor);
        return doctor;
    }

    @DeleteMapping("/doctors")
    public Optional<Doctor> deleteById(@RequestParam Long id) {
        doctorServices.deleteById(id);
        return findById(id);

    }
}
