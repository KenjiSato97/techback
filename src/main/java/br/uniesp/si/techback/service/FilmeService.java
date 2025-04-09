package br.uniesp.si.techback.service;

import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.repository.FilmeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FilmeService {


    private final FilmeRepository repository;

    public Filme cadastrar(Filme filme){
        return repository.save(filme);
    }

    public List<Filme> listar(){
         return repository.findAll();
    }
    public Filme buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    public void remover(Long id){
        repository.deleteById(id);
    }

    public Filme alterar(Filme filme){
        if (filme.getId() == null){
            throw  new EntityNotFoundException("Filme inexistente");
        }
        return repository.save(filme);
    }
    public List<Filme> listarFilmePorTitulo(String titulo) {
        return repository.findByTitulo(titulo);
    }

}
