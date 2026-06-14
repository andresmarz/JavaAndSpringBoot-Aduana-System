package com.andres.aduanasystem.declaraciones.controller;

import com.andres.aduanasystem.declaraciones.dto.DeclaracionRequestDTO;
import com.andres.aduanasystem.declaraciones.dto.DeclaracionResponseDTO;
import com.andres.aduanasystem.declaraciones.service.DeclaracionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/declaraciones")
@RequiredArgsConstructor
public class DeclaracionController {

    private final DeclaracionService declaracionService;

    @PostMapping
    public DeclaracionResponseDTO crearDeclaracion(
            @Valid @RequestBody DeclaracionRequestDTO request
    ) {
        return declaracionService.crearDeclaracion(request);
    }
}