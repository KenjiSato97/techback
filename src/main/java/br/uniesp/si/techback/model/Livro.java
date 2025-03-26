package br.uniesp.si.techback.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="tb_livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private Integer anoPublicacao;

}
