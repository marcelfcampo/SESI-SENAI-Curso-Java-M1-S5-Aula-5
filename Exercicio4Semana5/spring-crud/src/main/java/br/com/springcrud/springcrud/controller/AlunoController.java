/*
[MxSyy] Ex 4 - Criar aplicação Java no IntelliJ e utilizando REST no Insomnia que funcione
 o Get, Post, Put, Delete para criar, consultar, alterar e excluir alunos;
1. Passa a passo do que fazer;
2. Como exportar e enviar o Insomnia;

 */

package br.com.springcrud.springcrud.controller;

//Anotações

import br.com.springcrud.springcrud.modelo.Aluno;
import br.com.springcrud.springcrud.repositorio.AlunoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;


// Anotações que controla a API Rest
@RestController
@RequestMapping("/alunos")

public class AlunoController {

    //Camada que recebe os alunos.

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @GetMapping
    public List<Aluno>listar() {
        Object instant;
        //Aluno aluno = new Aluno
                //(1L, "Marcel", "48999609690", "exemplo@gmail.com", Instant.now());
        return alunoRepositorio.findAll();
    }

    //Incluir
    @PostMapping
    public void incluir(@RequestBody Aluno aluno){

        //Chamada do método save/salvar e passando o objeto via parametro
        //salvar no banco de dados
        alunoRepositorio.save(aluno);
    }

    //Alterar

    @PutMapping
    public void alterar(@RequestBody Aluno aluno) {
        //Pode ter validações aqui
        alunoRepositorio.save(aluno);

    }


    //Deletar

    @DeleteMapping("/{matricula}") //Passar a matricula via parâmetro para deletar
    public void deletar(@PathVariable Long matricula){ //nome do parâmetro
        alunoRepositorio.deleteById(matricula); //Método padrão para deletar pelo ID, passando o paramêtro

    }

    @GetMapping("/{matricula}")
    public Optional<Aluno> ler(@PathVariable Long matricula){
        return alunoRepositorio.findById(matricula); // Método padrão do Java para buscar pelo ID, retornando o objeto (Aluno)
    }

}


