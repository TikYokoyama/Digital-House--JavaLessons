//IF ELSE

package br.com.empiricus.exemplosIfElse;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		num3 = entrada.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " é o maior");
		} else if (num1 <num2 && num2>num3) {
			System.out.println(num2 + " é o maior");
		} else{
			System.out.println(num3 + " é o maior");
		}
		
	}
}
