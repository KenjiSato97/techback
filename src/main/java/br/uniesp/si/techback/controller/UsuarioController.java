package br.uniesp.si.techback.controller;


import br.uniesp.si.techback.model.Usuario;
import br.uniesp.si.techback.repository.UsuarioRepository;
import br.uniesp.si.techback.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;


    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    }
    @PostMapping
    public Usuario adicionar(@RequestBody Usuario usuario){
        return service.cadastrar(usuario);
    }
    @GetMapping
    public Usuario buscarPorId(Long id){
        return service.buscarPorId(id);
    }

    @PutMapping
    public  void atualizar(Usuario usuario){
        service.atualizar(usuario);
    }

    @DeleteMapping
    public ResponseEntity excluir(@PathVariable Long id){
        service.remover(id);
        return ResponseEntity.ok().build();
    }
}
