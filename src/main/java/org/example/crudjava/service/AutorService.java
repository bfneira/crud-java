package org.example.crudjava.service;

import org.example.crudjava.dto.AutorDto;
import org.example.crudjava.entities.Autor;

import java.util.List;

public interface AutorService {
    List<AutorDto> getAuthors();

    AutorDto getAuthorById(Long id);

    AutorDto createAuthor(AutorDto autorDto);
}
