package br.uniesp.si.techback.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="tb_filme")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
}
