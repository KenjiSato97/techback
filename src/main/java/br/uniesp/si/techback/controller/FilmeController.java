package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.model.Usuario;
import br.uniesp.si.techback.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService service;

    @GetMapping
    public List<Filme> listar() {
        return service.listar();
    }

    @GetMapping
    public Filme buscarPorId(Integer id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Filme cadastrar(@RequestBody Filme filme) {
        return service.cadastrar(filme);

    }

    @DeleteMapping
    public ResponseEntity excluir(@PathVariable Integer id) {
        service.remover(id);
        return ResponseEntity.ok().build();
    }

}

