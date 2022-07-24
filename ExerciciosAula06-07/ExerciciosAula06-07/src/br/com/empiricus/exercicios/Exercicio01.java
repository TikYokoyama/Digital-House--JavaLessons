package br.com.empiricus.exercicios;

/* 1.)Um funcionario de uma empresa recebe um aumento salarial anualmente. Sbae-se que:  
 * 	a.) Esse funcionario foi contratado em 1995, com o salario inicial de R$1000,00;
 * 	b.) Em 1996 recebeu um aumento de 1,5% cobre o seu salario inicial;
 * 	c.) A partir de 197 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual dp ano anterior.
 * 
 * Faça um programa que determine o salario atual desse funcinario 	*/
		
public class Exercicio01 {

	
	public static void main(String[] args) {
		
		
		aumentoAnual();
		
		
	}
	
	public static void aumentoAnual(){
		
			for(int ano=1996; ano<=2022; ano++) {
//				System.out.println("Ano: " + ano);
				
				for(double aumento=0.015; aumento<=26; aumento*=2) {
					System.out.println("Ano: " + ano + " Aumento: " + aumento);
				}
				
			}
		
	}
	
	public static void novoSalario() {
		
		
	
	}

}
