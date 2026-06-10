package com.andres.aduanasystem.usuarios.repository;

import com.andres.aduanasystem.usuarios.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}