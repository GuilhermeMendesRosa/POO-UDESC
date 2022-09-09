package exercicios.main;

import exercicios.model.Impressora;
import exercicios.model.Leitor;
import exercicios.model.ManipuladorDeString;

public class Ex04 {
	public static void main(String[] args) {
		Leitor leitor = new Leitor();
		Impressora impressora = new Impressora();
		ManipuladorDeString manipulador = new ManipuladorDeString();
		
		impressora.imprimirString("Digite uma palavra: ");
		String palavra = leitor.lerPalavra();
		

		impressora.imprimirString("Remover: \n[1] Vogais \n[2] Consoantes\n");
		int opcao = leitor.lerInteiro();
		
		if (opcao == 1) {
			String palavraModificada = manipulador.removeVogal(palavra);
			impressora.imprimirString(palavraModificada);
			
		} else if (opcao == 2) {
			String palavraModificada = manipulador.removeConsoante(palavra);
			impressora.imprimirString(palavraModificada);			
		}		
	}

}
