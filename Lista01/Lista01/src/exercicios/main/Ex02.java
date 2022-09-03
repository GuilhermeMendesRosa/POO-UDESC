package exercicios.main;

import exercicios.model.Impressora;
import exercicios.model.PreencheVetor;
/*
Escreva um programa que leia dois vetores de inteiros de 10 posições V e U,
respectivamente, e crie um terceiro vetor T, onde T é calculado da seguinte forma:
Vi + Ui -> caso Vi e Ui sejam pares
Vi − Ui -> caso Vi e Ui sejam impares
Vi ∗ Ui -> caso nenhuma das opções anteriores
*/

public class Ex02 {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        PreencheVetor pv = new PreencheVetor();

        int[] vetorV = null;
        int[] vetorU = null;
        int[] vetorT = null;

        impressora.imprimirString("Populando vetorV:\n");
        vetorV = pv.preencherPeloTeclado(10);
        impressora.quebraDeLinha();

        impressora.imprimirString("Populando vetorU:\n");
        vetorU = pv.preencherPeloTeclado(10);
        impressora.quebraDeLinha();

        vetorT = pv.preencherVetorPelaFormula(vetorV, vetorU);
        impressora.imprimirString("Resultado do Vetor T: \n");
        impressora.imprimirVetorDeInteiros(vetorT);
    }
}
