package com.example.demo.swe.service;

import com.example.demo.exception.EntityNotFoundException;
import com.example.demo.swe.dto.SoftwareEngineerRequestDTO;
import com.example.demo.swe.dto.SoftwareEngineerResponseDTO;
import com.example.demo.swe.mapper.SoftwareEngineerMapper;
import com.example.demo.swe.model.SoftwareEngineer;
import com.example.demo.swe.repository.SoftwareEngineerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository repository;
    private final SoftwareEngineerMapper mapper;


    public List<SoftwareEngineer> getAllSoftwareEngineers(){
        return repository.findAll();
    }

    public SoftwareEngineerResponseDTO insertSoftwareEngineer(SoftwareEngineerRequestDTO dto) {
        SoftwareEngineer saved = repository.save(mapper.toEntity(dto));

        return mapper.toResponseDto(saved);
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("SoftwareEngineer with id " + id + " not found"));
    }

    public void deleteSoftwareEngineerById(Integer id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("SoftwareEngineer with id " + id + " not found") ;
        }

        repository.deleteById(id);
    }

    public SoftwareEngineerResponseDTO updateSoftwareEngineerByid(Integer id, SoftwareEngineerRequestDTO dto) {
        SoftwareEngineer existing = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("SoftwareEngineer with id " + id + " not found"));

        SoftwareEngineer updated = mapper.toEntity(dto);

        updated.setId(existing.getId());

        SoftwareEngineer saved = repository.save(updated);

        return mapper.toResponseDto(saved);
    }
}
