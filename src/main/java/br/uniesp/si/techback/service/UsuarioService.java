package br.uniesp.si.techback.service;


import br.uniesp.si.techback.model.Usuario;
import br.uniesp.si.techback.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario cadastrar(Usuario usuario){
        return repository.save(usuario);
    }

    public List<Usuario> listar(){
        return repository.findAll();
    }
    public Usuario buscarPorId(Long id){
        return repository.findById(id).get();
    }
    public void atualizar(Usuario usuario){
        repository.save(usuario);
    }

    public void remover(Long id){
        repository.deleteById(id);
    }


}
