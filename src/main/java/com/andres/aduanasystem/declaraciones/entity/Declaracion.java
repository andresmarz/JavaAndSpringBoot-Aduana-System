package com.andres.aduanasystem.declaraciones.entity;

import com.andres.aduanasystem.usuarios.entity.Usuario;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "declaraciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Declaracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}