package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {


    @GetMapping
    public List<Filme> listar(){
    }
    @PostMapping
    }
}
