package com.andres.aduanasystem.usuarios.entity;

import com.andres.aduanasystem.declaraciones.entity.Declaracion;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String cargo;

    @OneToMany(mappedBy = "usuario")
    private List<Declaracion> declaraciones;

}