package exercicios.model;

public class Impressora {
    public void imprimirInteiro(int valor) {
        System.out.println(valor);
    }
    public void imprimirString (String str) {
        System.out.print(str);
    }
    public void imprimirVetorDeInteiros(int[] vetor) {
        int indiceDoVetor = 0;
        for (int num : vetor) {
            this.imprimirString(indiceDoVetor + "#: ");
            this.imprimirInteiro(num);
            indiceDoVetor++;
        }
    }
    public void quebraDeLinha() {
        System.out.print("\n");
    }

    public void imprimirSequencia(int[] sequencia) {
        for (int i = 0; i < sequencia.length; i++) {
            if (i != sequencia.length - 1) {
                this.imprimirString(String.valueOf(sequencia[i]) + ", ");
            } else {
                this.imprimirInteiro(sequencia[i]);
            }
        }
    }

    public void imprimirSequenciaDePrimos(int[] vetor) {
        for(int i = 0; i < vetor.length-1; i++) {
            if (vetor[i] != 0) {System.out.printf("%s ", vetor[i]);}
        }
    }
    public void imprimirSequenciaDeFibonacci(int[] vetorSequanciaDeFibonacci) {
        for(int i = 0; i < vetorSequanciaDeFibonacci.length; i++) {
            System.out.printf("%s ", vetorSequanciaDeFibonacci[i]);
        }
    }
}
