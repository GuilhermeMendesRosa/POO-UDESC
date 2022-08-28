package exercicios.model;

public class Calculadora {
    public void mostrarNumerosPrimosEntreIntervalo(int numero1, int numero2) {
        Impressora impressora = new Impressora();
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
    }

