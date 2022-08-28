package exercicios.model;

import java.util.Scanner;

public class PopulaVetor {
    public void popularPeloTeclado(int[] vetor){
        InputDadosDoTeclado input = new InputDadosDoTeclado();
        Impressora impressora = new Impressora();
        for (int i = 0; i < 10; i++) {
            impressora.imprimirString("#" + i + ": ");
            vetor[i] = input.proximoInteiro();
        }
    }

    public int[] populaVetorPelaFormula(int[] vetorV, int[] vetorU) {
        int[] vetorT = new int[10];
        for (int i = 0; i < 10; i++) {
            if ((vetorV[i] % 2 == 0) && (vetorU[i] % 2 == 0)) {
                vetorT[i] = vetorV[i] + vetorU[i];
            } else if ((vetorV[i] % 2 != 0) && (vetorU[i] % 2 != 0)) {
                vetorT[i] = vetorV[i] - vetorU[i];
            } else {
                vetorT[i] = vetorV[i] * vetorU[i];
            }
        }

        return vetorT;
    }
}
