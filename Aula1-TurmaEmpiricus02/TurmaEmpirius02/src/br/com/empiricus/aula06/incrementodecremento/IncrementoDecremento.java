package br.com.empiricus.aula06.incrementodecremento;

public class IncrementoDecremento {
	public static void main(String[] args) {
		
//		Pos-incremento --> variavel++ --> (variavel +1)
//		Pre-incremento --> ++variavel --> (1 + variavel)
		
		int a = 1;
		System.out.println(a++); //1 --> imprime o valor de 'a' e dps soma
		System.out.println(a);	 //2
		
		int b = 1;
		System.out.println(++b); //2
	}
	
}
