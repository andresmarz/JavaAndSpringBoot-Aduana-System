package com.andres.aduanasystem.declaraciones.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DeclaracionRequestDTO {

    @NotBlank
    private String numero;

    @NotBlank
    private String estado;

    @NotNull
    private Long usuarioId;
}