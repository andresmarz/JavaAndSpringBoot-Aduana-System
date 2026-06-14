package com.andres.aduanasystem.declaraciones.service;

import com.andres.aduanasystem.declaraciones.dto.DeclaracionRequestDTO;
import com.andres.aduanasystem.declaraciones.dto.DeclaracionResponseDTO;
import com.andres.aduanasystem.declaraciones.entity.Declaracion;
import com.andres.aduanasystem.declaraciones.repository.DeclaracionRepository;
import com.andres.aduanasystem.usuarios.entity.Usuario;
import com.andres.aduanasystem.usuarios.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeclaracionService {

    private final DeclaracionRepository declaracionRepository;
    private final UsuarioRepository usuarioRepository;

    public DeclaracionResponseDTO crearDeclaracion(
            DeclaracionRequestDTO request
    ) {

        Usuario usuario = usuarioRepository
                .findById(request.getUsuarioId())
                .orElseThrow();

        Declaracion declaracion = Declaracion.builder()
                .numero(request.getNumero())
                .estado(request.getEstado())
                .usuario(usuario)
                .build();

        Declaracion declaracionGuardada =
                declaracionRepository.save(declaracion);

        return DeclaracionResponseDTO.builder()
                .id(declaracionGuardada.getId())
                .numero(declaracionGuardada.getNumero())
                .estado(declaracionGuardada.getEstado())
                .usuarioId(
                        declaracionGuardada
                                .getUsuario()
                                .getId()
                )
                .nombreUsuario(
                        declaracionGuardada
                                .getUsuario()
                                .getNombre()
                )
                .build();
    }
}