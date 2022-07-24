package br.com.empiricus.exemplosScanner;

import java.util.Scanner;

public class Scanner1 {

	private static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		//Classe - Objeto -------> Construtor
		
		String nome = entradaDados.next();
		
		System.out.println("Nome do usuario: " + nome);
		
	}
}
