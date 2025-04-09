package br.uniesp.si.techback.repository;

import br.uniesp.si.techback.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

    List<Filme> findByTitulo(String titulo);

    List<Filme> findByTituloAndAnoLancamento(String titulo, Integer anolancamento);

    @Query("select f from Filme f where f.titulo like %:titulo%")
    List<Filme> listarFilmesPorTitulo(@Param("titulo") String titulo);
}
