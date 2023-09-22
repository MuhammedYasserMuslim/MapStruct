package com.spring.services;

import com.spring.base.BaseServices;
import com.spring.model.Department;
import com.spring.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServices extends BaseServices<Department,Long> {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Long count() {
        return departmentRepository.count();
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> findById(Long aLong) {
        return departmentRepository.findById(aLong);
    }

    @Override
    public void insert(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void update(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void deleteById(Long aLong) {
        departmentRepository.deleteById(aLong);
    }
}
