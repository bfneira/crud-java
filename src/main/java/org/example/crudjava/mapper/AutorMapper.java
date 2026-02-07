package org.example.crudjava.mapper;

import org.example.crudjava.dto.AutorDto;
import org.example.crudjava.entities.Autor;

public class AutorMapper {

    private AutorMapper() {
    }

    public static AutorDto toDto(Autor autor) {
        return new AutorDto(
                autor.getId(),
                autor.getRut(),
                autor.getDv(),
                autor.getNombre(),
                autor.getApellido(),
                autor.getNacionalidad()
        );
    }

    public static Autor toEntity(AutorDto dto) {
        Autor autor = new Autor();
        autor.setRut(dto.getRut());
        autor.setDv(dto.getDv());
        autor.setNombre(dto.getNombre());
        autor.setApellido(dto.getApellido());
        autor.setNacionalidad(dto.getNacionalidad());
        return autor;
    }
}