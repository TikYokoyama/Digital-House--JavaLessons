package br.com.empiricus.metodos;

public class MetoroFora {

	public static String metodo07(int i, int f) {
		
		String numeroString = "";
		
			for(int c = i; c<=f; c++) {
				numeroString += c + " | ";
			}
		
		return numeroString;
	}	
	
}
