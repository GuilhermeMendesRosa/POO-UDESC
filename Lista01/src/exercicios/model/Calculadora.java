package exercicios.model;

public class Calculadora {
	private Impressora impressora = new Impressora();

	public int[] pegarNumerosPrimosEntreIntervalo(int inicio, int fim) {
		int[] vetorDeNumerosPrimos = new int[fim - inicio - 1];

		impressora.imprimirString("Intervalo de números primos entre " + inicio + " e " + fim + "\n");

		for (int i = inicio; i < fim; i++) {
			int quantidadeDeDivisores = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					quantidadeDeDivisores++;
				}
			}
			if (quantidadeDeDivisores == 2) {
				// impressora.imprimirInteiro(i)
				vetorDeNumerosPrimos[i - inicio - 1] = i;
			}
		}

		return vetorDeNumerosPrimos;
	}

	public int[] retornaSequenciaDeFibonacci(int tamanhoDaSequencia) {
		if (tamanhoDaSequencia < 2) {
			tamanhoDaSequencia = 2;
		}

		int[] sequenciaDeFibonacci = new int[tamanhoDaSequencia];
		sequenciaDeFibonacci[0] = 0;
		sequenciaDeFibonacci[1] = 1;

		for (int i = 2; i < tamanhoDaSequencia; i++) {
			sequenciaDeFibonacci[i] = sequenciaDeFibonacci[i - 1] + sequenciaDeFibonacci[i - 2];
		}

		// impressora.imprimirSequencia(sequenciaDeFibonacci);
		return sequenciaDeFibonacci;
	}
}
