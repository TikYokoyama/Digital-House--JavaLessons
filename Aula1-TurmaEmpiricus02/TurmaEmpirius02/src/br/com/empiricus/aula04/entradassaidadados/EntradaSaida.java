package br.com.empiricus.aula04.entradassaidadados;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a , b, soma;
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextInt(); //para digitar um valor
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma de A + B: " + soma);
	}
}	
