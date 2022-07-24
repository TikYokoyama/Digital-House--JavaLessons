//SWITCH

package br.com.empiricus.exemplosSwitch;

import java.util.Scanner;

public class MesDoAno {

	public static void main(String[] arg) {
		
		Scanner entrada = new Scanner(System.in);
						
		System.out.println("Digite um numero entre 1 e 12");
		int numero = entrada.nextInt();
		
	/*	if(numero == 1) {
			System.out.println(numero + " corresponde a Janeiro");
		} else if(numero == 2) {
			System.out.println(numero + " corresponde a Fevereiro");
		} else if(numero == 3) {
			System.out.println(numero + " corresponde a Março");
		} else if(numero == 4) {
			System.out.println(numero + " corresponde a Abril");
		} else if(numero == 5) {
			System.out.println(numero + " corresponde a Maio");
		} else if(numero == 6) {
			System.out.println(numero + " corresponde a Junho");
		} else if(numero == 7) {
			System.out.println(numero + " corresponde a Julho");
		} else if(numero == 8) {
			System.out.println(numero + " corresponde a Agosto");
		} else if(numero == 9) {
			System.out.println(numero + " corresponde a Setembro");
		} else if(numero == 10) {
			System.out.println(numero + " corresponde a Outubro");
		} else if(numero == 11) {
			System.out.println(numero + " corresponde a Novembro");
		} else if(numero == 12){
			System.out.println(numero + " corresponde a Dezembro");
		}else {
			System.out.println("mes invalido");
		}
	*/
			
		switch(numero) {
			case 1: {
				System.out.println(numero + " corresponde a Janeiro");
				break;
			}
			case 2: {
				System.out.println(numero + " corresponde a Fevereiro");
				break;
			}
			case 3: {
				System.out.println(numero + " corresponde a Março");
				break;
			}
			case 4: {
				System.out.println(numero + " corresponde a Abril");
				break;
			}
			case 5: {
				System.out.println(numero + " corresponde a Maio");
				break;
			}
			case 6: {
				System.out.println(numero + " corresponde a Junho");
				break;
			}
			case 7: {
				System.out.println(numero + " corresponde a Julho");
				break;
			}
			case 8: {
				System.out.println(numero + " corresponde a Agosto");
				break;
			}
			case 9: {
				System.out.println(numero + " corresponde a Setembro");
				break;
			}
			case 10: {
				System.out.println(numero + " corresponde a Outubro");
				break;
			}
			case 11: {
				System.out.println(numero + " corresponde a Novembro");
				break;
			}
			case 12: {
				System.out.println(numero + " corresponde a Dezembro");
				break;
			}
			default: {
				System.out.println("mes invalido");
				break;
			}
			
		}
		
	}
}
