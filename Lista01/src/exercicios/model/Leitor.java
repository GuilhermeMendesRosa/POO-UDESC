package exercicios.model;

import java.util.Scanner;

public class Leitor {
	private Scanner scan = new Scanner(System.in);
	
    public int lerInteiro() {
        int valor = scan.nextInt();
        return valor;
    }
    
    public String lerPalavra() {
    	String palavra = scan.next();
    	return palavra;
    }
    
}
