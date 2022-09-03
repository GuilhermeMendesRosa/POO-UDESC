package exercicios.model;

public class PreencheVetor {
    public int[] preencherPeloTeclado(int tamanhoDoVetor)
    {
        int[] vetor = new int[tamanhoDoVetor];
        Leitor leitor = new Leitor();
        Impressora impressora = new Impressora();
        for (int i = 0; i < 10; i++) {
            impressora.imprimirString("#" + i + ": ");
            vetor[i] = leitor.proximoInteiro();
        }
    
        return vetor;
    }

    public int[] preencherVetorPelaFormula(int[] vetorV, int[] vetorU) {
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
