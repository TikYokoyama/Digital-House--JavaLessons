package br.com.empiricus.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections{
	
	public static void main(String[] args) {
		//Collections --> é um objeto que serve para armazenar muitos elementos
		
		String aula1 = "D - Code - Tank";
		String aula2 = "A - SpringBoot";
		String aula3 = "C - Java - Mobile";
		String aula4 = "B - Java - Redes";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1); // [0]
		aulas.add(aula2); // [1]
		aulas.add(aula3); // [2]
		aulas.add(aula4); // [3]
		
		/*System.out.println(aulas); //[Code - Tank, SpringBoot, Java - Mobile, Java - Redes]
		
		aulas.remove(0);
		System.out.println(aulas); //[SpringBoot, Java - Mobile, Java - Redes]
		
		System.out.println(aulas.get(2)); //Java - Redes */
		
		
		for(String i : aulas) {
			System.out.println(i);
		}
		
		System.out.println("--------------");
		
		for (int i = 0; i <aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}
		System.out.println(aulas.size()); //4
		
		System.out.println("--------------");
		
		Collections.sort(aulas); //coloca a lista em ordem alfabetica ou numerica
		System.out.println(aulas);
		
		System.out.println("--------------");
		
		Collections.shuffle(aulas); //coloca a lista embaralhada
		System.out.println(aulas);
	}
}