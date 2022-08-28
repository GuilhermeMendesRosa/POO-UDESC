package exercicios.main;

import exercicios.model.Impressora;
import exercicios.model.PopulaVetor;

public class Ex02 {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        PopulaVetor pv = new PopulaVetor();

        int[] vetorV = new int[10];
        int[] vetorU = new int[10];
        int[] vetorT = null;

        impressora.imprimirString("Populando 1# vetor:\n");
        pv.popularPeloTeclado(vetorV);
        impressora.quebraDeLinha();

        impressora.imprimirString("Populando 2# vetor:\n");
        pv.popularPeloTeclado(vetorU);
        impressora.quebraDeLinha();

        vetorT = pv.populaVetorPelaFormula(vetorV, vetorU);
        impressora.imprimirString("Resultado do Vetor T: \n");
        impressora.imprimirVetorDeInteiros(vetorT);
    }

}
