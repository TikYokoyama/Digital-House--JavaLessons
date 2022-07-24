package br.com.empiricus.collections02;

import java.util.ArrayList;

public class TestaAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Portugues", 60);
		Aula a2 = new Aula("Matematica", 120);
		Aula a3 = new Aula("Historia", 90);
		
		ArrayList<Aula> listaAulas = new ArrayList<>();
		
		listaAulas.add(a1);
		listaAulas.add(a2);
		listaAulas.add(a3);
		
		System.out.println(listaAulas);
	}

}
