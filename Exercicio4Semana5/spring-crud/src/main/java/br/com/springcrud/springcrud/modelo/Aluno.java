package br.com.springcrud.springcrud.modelo;

//@AllArgsConstructor é utilizado para construir o construtor
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

//Anotações
@AllArgsConstructor
@Data
@Entity
//Construtor Vazio
@NoArgsConstructor

//Classe Aluno e atributos declarados
public class Aluno {
    @Id
    // 5 (cinco) variáveis: matricula,nome,telefone, email,dataCadastro
    private Long matricula;

    private String nome, telefone, email;

    private Instant dataCadastro;



}
