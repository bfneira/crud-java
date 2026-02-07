package org.example.crudjava.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AutorDto {
    private Long id;
    private Integer rut;
    private String dv;
    private String nombre;
    private String apellido;
    private String nacionalidad;
}
