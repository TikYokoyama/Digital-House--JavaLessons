package br.com.empiricus.exemplosWhile;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		int numero = 0;
		
		while(numero != 10) {
			System.out.println("Digite um numero: ");
			numero = entradaDados.nextInt();
			
			if(numero >= 18 && numero <70) {
				System.out.println("Deve votar!");
			} else if (numero>=16) {
				System.out.println("Voto opcional");
			} else {
				System.out.println("Nao pode votar");
			}
			
		}
		
	}

}
