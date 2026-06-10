package com.andres.aduanasystem.usuarios.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuarioRequestDTO {

    @NotBlank
    private String nombre;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String cargo;
}