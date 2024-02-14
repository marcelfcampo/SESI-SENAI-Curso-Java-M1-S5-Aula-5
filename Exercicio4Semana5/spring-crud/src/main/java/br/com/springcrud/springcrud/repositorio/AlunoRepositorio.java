package br.com.springcrud.springcrud.repositorio;

import br.com.springcrud.springcrud.modelo.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorio extends JpaRepository<Aluno,Long> {



}
