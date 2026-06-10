package com.andres.aduanasystem.usuarios.controller;

import com.andres.aduanasystem.usuarios.dto.UsuarioRequestDTO;
import com.andres.aduanasystem.usuarios.dto.UsuarioResponseDTO;
import com.andres.aduanasystem.usuarios.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public UsuarioResponseDTO crearUsuario(
            @Valid @RequestBody UsuarioRequestDTO request
    ) {
        return usuarioService.crearUsuario(request);
    }
}