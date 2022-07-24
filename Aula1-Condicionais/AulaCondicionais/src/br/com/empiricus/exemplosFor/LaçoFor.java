package br.com.empiricus.exemplosFor;

import java.util.Scanner;

public class LaçoFor {
	
	public static void main(String[] arg) {
		
		//escreva um laco for de 1 a 10, e indique quantos deles sao pares
		Scanner entrada = new Scanner(System.in);
		int n, pares = 0;
		
		for (int i=0; i <= 10; i++) {
			n = entrada.nextInt();
			boolean par = n%2==0 ? true : false;
			
			if(par) {
				pares++;
			}	
		}
		
		System.out.println("Quantidade de pares = " + pares);
	}
}

