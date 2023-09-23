package com.spring.repository;

import com.spring.base.BaseRepository;
import com.spring.model.Doctor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.print.Doc;

@RepositoryRestResource
public interface DoctorRepository extends BaseRepository<Doctor,Long> {
}
