package com.andres.aduanasystem.declaraciones.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeclaracionResponseDTO {

    private Long id;

    private String numero;

    private String estado;

    private Long usuarioId;

    private String nombreUsuario;
}