/*
[M1S05] Ex 2 - Calcular média de notas através de @RequestParam
Disponibilize um recurso REST para cálculo de média de notas,
utilize 3 notas do tipo Double e retorne a média (Double).
 */


package br.com.springaula.exercicio.servicos;

public class Calculos {

    public static Double calcularMedia(Double n1, Double n2, Double n3) {
        Double media = ( n1 + n2 + n3 ) / 3;
        return media;

    }

}
