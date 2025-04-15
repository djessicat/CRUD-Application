package com.example.demo.swe.mapper;

import com.example.demo.swe.dto.SoftwareEngineerRequestDTO;
import com.example.demo.swe.dto.SoftwareEngineerResponseDTO;
import com.example.demo.swe.model.SoftwareEngineer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SoftwareEngineerMapper {

    SoftwareEngineer toEntity(SoftwareEngineerRequestDTO dto);
    SoftwareEngineerResponseDTO toResponseDto(SoftwareEngineer entity);
}
