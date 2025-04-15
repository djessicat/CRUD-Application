package com.example.demo.swe.controller;

import com.example.demo.swe.dto.SoftwareEngineerRequestDTO;
import com.example.demo.swe.dto.SoftwareEngineerResponseDTO;
import com.example.demo.swe.model.SoftwareEngineer;
import com.example.demo.swe.service.SoftwareEngineerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
        return softwareEngineerService.getAllSoftwareEngineers();
    }

    @GetMapping("{id}")
    public ResponseEntity<SoftwareEngineer> getSoftwareEngineerById(@PathVariable Integer id) {
            SoftwareEngineer softwareEngineer = softwareEngineerService.getSoftwareEngineerById(id);
            return ResponseEntity.ok(softwareEngineer);
    }

    @PostMapping
    public ResponseEntity<SoftwareEngineerResponseDTO> addNewSoftwareEngineer(@Valid @RequestBody SoftwareEngineerRequestDTO dto) {
       SoftwareEngineerResponseDTO response = softwareEngineerService.insertSoftwareEngineer(dto);

       return ResponseEntity
               .status(HttpStatus.CREATED)
               .body(response);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteSoftwareEngineer(@PathVariable Integer id) {
            softwareEngineerService.deleteSoftwareEngineerById(id);
            return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<SoftwareEngineerResponseDTO> updateSoftwareEngineerById(@PathVariable Integer id, @Valid @RequestBody SoftwareEngineerRequestDTO dto) {
      SoftwareEngineerResponseDTO response = softwareEngineerService.updateSoftwareEngineerByid(id, dto);

      return ResponseEntity.ok(response);
    }
}
