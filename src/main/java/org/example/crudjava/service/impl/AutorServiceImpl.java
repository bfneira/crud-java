package org.example.crudjava.service.impl;

import lombok.AllArgsConstructor;
import org.example.crudjava.dto.AutorDto;
import org.example.crudjava.entities.Autor;
import org.example.crudjava.exception.AutorException;
import org.example.crudjava.exception.AutorNotFoundException;
import org.example.crudjava.mapper.AutorMapper;
import org.example.crudjava.repository.AutorRepository;
import org.example.crudjava.service.AutorService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AutorServiceImpl implements AutorService {

    private final AutorRepository autorRepository;

    @Override
    public List<AutorDto> getAuthors() {
        try {
            return autorRepository.findAll()
                    .stream()
                    .map(AutorMapper::toDto)
                    .toList();
        } catch (DataAccessException e) {
            throw new AutorException("Error al obtener autores desde la base de datos", e);
        }
    }

    @Override
    public AutorDto getAuthorById(Long id) {
        return autorRepository.findById(id)
                .map(AutorMapper::toDto)
                .orElseThrow(() ->
                        new AutorNotFoundException("Autor no encontrado con id: " + id));
    }

    @Override
    public AutorDto createAuthor(AutorDto autorDto) {

        if (autorRepository.existsByRut(autorDto.getRut())) {
            throw new AutorException(
                    "Ya existe un autor con el RUT: " + autorDto.getRut()
            );
        }

        Autor autorEntity = AutorMapper.toEntity(autorDto);

        Autor savedAutor = autorRepository.save(autorEntity);

        return AutorMapper.toDto(savedAutor);
    }
}
