package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.model.Usuario;
import br.uniesp.si.techback.service.FilmeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/filmes")
public class FilmeController {


    private final FilmeService service;

    public List<Filme> listarFilmePorTitulo(@PathVariable String titulo) {
        return service.listarFilmePorTitulo(titulo);
    }

    @GetMapping
    public List<Filme> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Filme buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Filme cadastrar(@RequestBody @Validated Filme filme) {
        return service.cadastrar(filme);

    }

    @DeleteMapping
    public ResponseEntity excluir(@PathVariable Long id) {
        service.remover(id);
        return ResponseEntity.ok().build();
    }

}

