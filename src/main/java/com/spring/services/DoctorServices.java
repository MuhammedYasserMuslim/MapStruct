package com.spring.services;

import com.spring.base.BaseServices;
import com.spring.model.Doctor;
import com.spring.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServices extends BaseServices<Doctor,Long> {

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Long count() {
        return doctorRepository.count();
    }

    @Override
    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    @Override
    public Optional<Doctor> findById(Long aLong) {
        return doctorRepository.findById(aLong);
    }

    @Override
    public void insert(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public void update(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public void deleteById(Long aLong) {
        doctorRepository.deleteById(aLong);
    }
}
