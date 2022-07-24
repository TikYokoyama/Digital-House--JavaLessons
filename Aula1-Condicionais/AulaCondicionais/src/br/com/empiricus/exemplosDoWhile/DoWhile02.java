package br.com.empiricus.exemplosDoWhile;

import java.util.Scanner;

public class DoWhile02 {
	
	private static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		
		do {
			
			System.out.println("Entre com o numero 1: ");
			int numero1 = entrada.nextInt();
			
			System.out.println("Entre com o numero 2: ");
			int numero2 = entrada.nextInt();
			
			if(numero2 == 0) {
				System.out.println("Nao podemos dividir por zero!");
				continue;
				//break; //funciona como um ponto de parada do loop
			}
			
			System.out.println((i+1) + "o resultado: " + numero1 + " / " + numero2 + "  é: " +(numero1/numero2))  ;
			i++;
			
		}while(i<10);
		
	}
}
