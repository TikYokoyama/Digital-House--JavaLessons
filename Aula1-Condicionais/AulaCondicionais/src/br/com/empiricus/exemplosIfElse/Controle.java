//IF ELSE

package br.com.empiricus.exemplosIfElse;

import java.util.Scanner;

public class Controle {

	//Estrutra de Controle - De DECISÃO
	
	public static void main (String[] args){
		
		int num1 = 10;
		int num2 = 10;
		
		if(num1 < num2){
			System.out.println("menor");
		} else if(num1>num2) {
			System.out.println("maior");
		} else {
			System.out.println("iguais");
		}
	}
	
}
