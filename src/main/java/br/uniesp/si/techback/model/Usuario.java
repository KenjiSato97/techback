package br.uniesp.si.techback.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String dataNascimento;
}
