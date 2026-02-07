package org.example.crudjava.controller;


import lombok.AllArgsConstructor;
import org.example.crudjava.dto.AutorDto;
import org.example.crudjava.entities.Autor;
import org.example.crudjava.service.AutorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/authors")
public class AutorController {

    private final AutorService autorService;

    @GetMapping
    public ResponseEntity<List<AutorDto>> getAuthors() {
        List<AutorDto> lstAuthors = autorService.getAuthors();
        return ResponseEntity.ok(lstAuthors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorDto> getAuthorById(@PathVariable Long id) {
        AutorDto author = autorService.getAuthorById(id);
        return ResponseEntity.ok(author);
    }

    @PostMapping
    public ResponseEntity<AutorDto> createAuthor(@RequestBody AutorDto autor) {

        AutorDto createdAuthor = autorService.createAuthor(autor);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdAuthor);
    }
}