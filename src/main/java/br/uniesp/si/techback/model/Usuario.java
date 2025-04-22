package br.uniesp.si.techback.model;


import br.uniesp.si.techback.validator.ApenasIespEmail;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name="tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome é obrigatório")
    private String nome;
    @NotBlank(message = "O e-mail é obrigatório")
    @ApenasIespEmail
    private String email;
    @NotBlank(message = "A data de nascimento é obrigatória")
    private String dataNascimento;
}
