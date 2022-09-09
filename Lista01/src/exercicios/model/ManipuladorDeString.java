package exercicios.model;

import java.util.ArrayList;
import java.util.List;

public class ManipuladorDeString {

	public String removeVogal(String palavra) {
		String palavraModificada = palavra.toLowerCase().replaceAll("[a,e,i,o,u]", "");
		return palavraModificada;
	}
	
	public String removeConsoante(String palavra) {
		String palavraModificada = palavra.toLowerCase().replaceAll("[b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,y,z,]", "");
		return palavraModificada;
	}

}
