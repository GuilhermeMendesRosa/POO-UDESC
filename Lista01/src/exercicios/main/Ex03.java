package exercicios.main;

/*
Faça um programa que mostre os n primeiros termos da séie de Fibonacci e a
soma destes n primeiros termos, onde n é um inteiro fornecido pelo usuário.
*/

import exercicios.model.Calculadora;
import exercicios.model.Impressora;
import exercicios.model.Leitor;

public class Ex03 {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        Leitor input = new Leitor();
        Calculadora calculadora = new Calculadora();

        int tamanhoDaSequencia = 2;

        impressora.imprimirString("Digite os n primeiros números da sequência de Fibonacci: ");
        tamanhoDaSequencia = input.lerInteiro();

        int[] vetorSequanciaDeFibonacci = calculadora.retornaSequenciaDeFibonacci(tamanhoDaSequencia);
        impressora.imprimirSequenciaDeFibonacci(vetorSequanciaDeFibonacci);
    }
}
