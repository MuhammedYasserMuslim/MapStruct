package com.spring.mapstruct;

import com.spring.dto.DeveloperDto;
import com.spring.model.Developer;
import org.mapstruct.Mapper;

@Mapper
public interface DeveloperMapper {

    DeveloperDto map(Developer entity);
    Developer unMap(DeveloperDto dto);
}
