package exercicios.main;

import exercicios.model.Calculadora;
import exercicios.model.Impressora;
import exercicios.model.Leitor;

/*
Exiba no console todos os primos existentes em um intervalo a,b definido pelo
usu´ario.
*/

public class Ex01 {
    public static void main(String[] args) {
        Impressora impresora = new Impressora();
        Calculadora calculadora = new Calculadora();
        Leitor leitor = new Leitor();
        int inicio, fim;

        impresora.imprimirString("Passe dois valores:\n");

        impresora.imprimirString("início: ");
        inicio = leitor.proximoInteiro();

        impresora.imprimirString("fim: ");
        fim = leitor.proximoInteiro();

        int[] vetorDeNumerosPrimos = calculadora.pegarNumerosPrimosEntreIntervalo(inicio, fim);
        impresora.imprimirSequenciaDePrimos(vetorDeNumerosPrimos);
    }
}
