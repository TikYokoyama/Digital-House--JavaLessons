package br.com.empiricus.metodos;

import java.util.Scanner;

public class MetodoBrinks {

	public static void main(String[] args) {
		
		Scanner valorInput = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num1 = valorInput.nextInt();
				
		System.out.println("Escolha um operador + - * / %: ");
		char operador = valorInput.next().charAt(0);
		
		System.out.println("Digite o segundo valor: ");
		int num2 = valorInput.nextInt();
		
		String operadorValido = calcula(num1, num2, operador)== 0 ? " Entre com numeros validos" : "";
		
		System.out.println("Resultado : " + calcula(num1, num2, operador) + operadorValido);
		
	}	
	
	public static int calcula(int num1, int num2, char operador) {
		
		switch(operador) {
			case '+': {
				return num1 + num2;
			}
			case '-': {
				return num1 - num2;
			}
			case '*': {
				return num1 * num2;
			}
			case '/': {
				return num1 / num2;
			}
			case '%': {
				return num1 % num2;
			}
			default: 
				return 0;
		}
		
	}
	
}
