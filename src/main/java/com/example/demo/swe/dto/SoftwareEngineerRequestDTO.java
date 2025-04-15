package com.example.demo.swe.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SoftwareEngineerRequestDTO {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "techStack is required")
    private String techStack;
}
