package br.com.springaula.exercicio.recursos;

import br.com.springaula.exercicio.entidades.Aluno;
import br.com.springaula.exercicio.servicos.Calculos;
import br.com.springaula.exercicio.servicos.Validador;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping(value = "/exercicios")
public class ExercicioRecurso {

    //[M1S05] Ex 1 - Validar CPF e CNPJ através de @RequestParam
    //Através dos conhecimentos adquiridos, disponibilize dois recursos REST
    //para validação de CPF e CNPJ.

    @GetMapping("/m1s05/ex1/cpf")
    public ResponseEntity<Boolean> validaCPF(@RequestParam("cpf") String cpf) {
        Boolean resultado = Validador.validarCpf(cpf);
        return ResponseEntity.ok().body(resultado);
    }

   @GetMapping("/m1s05/ex1/cnpj")
    public ResponseEntity<Boolean>validaCNPJ(@RequestParam("cnpj") String cnpj) {
       Boolean resultado = Validador.validarCpf(cnpj);
       return ResponseEntity.ok().body(resultado);
   }

    // [M1S05] Ex 2 - Calcular média de notas através de @RequestParam
    // Disponibilize um recurso REST para cálculo de média de notas,
    // Disponibilize um recurso REST para cálculo de média de notas,
    // utilize 3 notas do tipo Double e retorne a média (Double).

    @GetMapping("/m1s05/ex2")
    public ResponseEntity<Double> calcularMedia(
            @RequestParam("n1") Double n1,
            @RequestParam("n2") Double n2,
            @RequestParam("n3") Double n3) {

        Double media = Calculos.calcularMedia(n1, n2, n3);

       return ResponseEntity.ok().body(media);

    }


    //
    // [M1S05] Ex 3 - Instancie objeto Aluno através de
    // @RequestParam e @RequestBody ( retorne objeto Aluno )
    // Crie uma classe com nome Aluno, os atributos serão :
    // matricula (Long);
    // nome (String);
    // Após disponibilize um recurso REST para instanciar um Aluno
    // através do método POST e retorne Status CREATED juntamente com
    // objeto Aluno instanciado.

    @PutMapping("/m1s05/ex1")
    public ResponseEntity<Aluno> criarAluno(
            @RequestBody Aluno aluno
    ){
       return ResponseEntity.created(URI.create("")).body(aluno);
    }

    @PutMapping("/m1s05/ex3/2")
    public ResponseEntity<Aluno> criarObjetoAluno(
            @RequestParam("matricula") Long matricula,
            @RequestParam("nome") String nome
    ) {
        Aluno aluno = new Aluno(matricula, nome);
        return ResponseEntity.created(URI.create("")).body(aluno);
    }

}





