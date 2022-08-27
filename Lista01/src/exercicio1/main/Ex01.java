package exercicio1.main;

import exercicio1.model.Calculadora;
import exercicio1.model.Impressora;
import exercicio1.model.InputDadosDoTeclado;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        InputDadosDoTeclado input = new InputDadosDoTeclado();
        Impressora impresora = new Impressora();
        Calculadora calculadora = new Calculadora();
        int numero1, numero2;

        impresora.imprimirString("Passe dois valores:\n");

        impresora.imprimirString("#1: ");
        numero1 = input.proximaInteiro();

        impresora.imprimirString("#2: ");
        numero2 = input.proximaInteiro();

        calculadora.mostrarNumerosPrimosEntreIntervalo(numero1, numero2);
    }
}
