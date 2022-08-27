package exercicio1.main;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, maior, menor;

        System.out.printf("Passe dois valores:");

        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();

        if (numero1 <= numero2) {
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }

        System.out.printf("Intervalo de números primos entre %d e %d:\n", menor, maior);

        for (int i = menor; i < maior; i++) {
            int quantidadeDeDivisores = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    quantidadeDeDivisores++;
                }
            }
            if (quantidadeDeDivisores == 2) {
                System.out.println(i);
            }
        }


    }
}
