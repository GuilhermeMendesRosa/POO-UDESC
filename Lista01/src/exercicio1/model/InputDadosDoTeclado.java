package exercicio1.model;

import java.util.Scanner;

public class InputDadosDoTeclado {

    public int proximoInteiro() {
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        return valor;
    }
}
