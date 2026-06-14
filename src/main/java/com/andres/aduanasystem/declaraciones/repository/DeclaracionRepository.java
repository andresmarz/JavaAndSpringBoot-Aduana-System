package com.andres.aduanasystem.declaraciones.repository;

import com.andres.aduanasystem.declaraciones.entity.Declaracion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeclaracionRepository
        extends JpaRepository<Declaracion, Long> {
}