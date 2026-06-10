package com.andres.aduanasystem.usuarios.service;

import com.andres.aduanasystem.usuarios.dto.UsuarioRequestDTO;
import com.andres.aduanasystem.usuarios.dto.UsuarioResponseDTO;
import com.andres.aduanasystem.usuarios.entity.Usuario;
import com.andres.aduanasystem.usuarios.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioResponseDTO crearUsuario(UsuarioRequestDTO request) {

        Usuario usuario = Usuario.builder()
                .nombre(request.getNombre())
                .email(request.getEmail())
                .cargo(request.getCargo())
                .build();

        Usuario usuarioGuardado = usuarioRepository.save(usuario);

        return UsuarioResponseDTO.builder()
                .id(usuarioGuardado.getId())
                .nombre(usuarioGuardado.getNombre())
                .email(usuarioGuardado.getEmail())
                .cargo(usuarioGuardado.getCargo())
                .build();
    }
}