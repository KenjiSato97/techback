package br.uniesp.si.techback.service;

import br.uniesp.si.techback.model.Livro;
import br.uniesp.si.techback.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;


    public Livro salvar(Livro livro) {
        return livroRepository.save(livro);
    }


    public List<Livro> listarTodos() {
        return livroRepository.findAll();
    }


    public Optional<Livro> buscarPorId(Long id) {
        return livroRepository.findById(id);
    }


    public Livro atualizar(Livro livro) {
        return livroRepository.save(livro);
    }


    public void excluir(Long id) {
        livroRepository.deleteById(id);
    }
}
