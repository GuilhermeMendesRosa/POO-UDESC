package exercicios.model;

import java.util.Scanner;

public class Leitor {
    public int proximoInteiro() {
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        return valor;
    }
}
