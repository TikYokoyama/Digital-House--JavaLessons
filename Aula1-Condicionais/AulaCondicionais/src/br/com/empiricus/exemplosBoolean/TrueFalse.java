//TESTE TRUE OR FALSE

package br.com.empiricus.exemplosBoolean;

import java.util.Scanner;

public class TrueFalse {

	public static void main(String[] arg) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o numero1: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("informe o nuemero2: ");
		int numero2 = entrada.nextInt();
		
		int maior = 0;  //valor inicial;
				
				//teste			  //true	//false	
		maior = numero1>numero2 ? numero1 : numero2;
		
		System.out.println("o maior numero é: " + maior);
	}
}
