package exercicios.model;

public class Calculadora {
    private Impressora impressora = new Impressora();
    public void mostrarNumerosPrimosEntreIntervalo(int numero1, int numero2) {
        int menor, maior;

        if (numero1 <= numero2) {
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }

        impressora.imprimirString("Intervalo de números primos entre " + menor + " e " + maior + "\n");

        for (int i = menor; i < maior; i++) {
            int quantidadeDeDivisores = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    quantidadeDeDivisores++;
                }
            }
            if (quantidadeDeDivisores == 2) {
                impressora.imprimirInteiro(i);
            }
        }
    }

    public void mostrarSequenciaDeFibonacci(int numeroSequencia) {
        if (numeroSequencia < 2) { numeroSequencia = 2; }

        int[] sequenciaDeFibonacci = new int[numeroSequencia];
        sequenciaDeFibonacci[0] = 0;
        sequenciaDeFibonacci[1] = 1;

        for (int i = 2; i < numeroSequencia; i++) {
            sequenciaDeFibonacci[i] = sequenciaDeFibonacci[i-1] + sequenciaDeFibonacci[i-2];
        }

        impressora.imprimirSequencia(sequenciaDeFibonacci);
    }
}
