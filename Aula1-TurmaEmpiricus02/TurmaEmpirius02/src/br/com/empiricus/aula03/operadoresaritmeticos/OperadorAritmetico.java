package br.com.empiricus.aula03.operadoresaritmeticos;

public class OperadorAritmetico {
	public static void main(String[] args) {
	
		int x = 5;
		int y= 10;
		int z = 15;
		int resultado;
		
		resultado = x+y;
		System.out.println("Soma: " + resultado);
		
		resultado = x-y;
		System.out.println("Subtracao: " + resultado);
		
		resultado = x*y;
		System.out.println("Multiplicacao: " + resultado);
		
		resultado = x/y;
		System.out.println("Divisao: " + resultado);
		
		resultado = x%y;
		System.out.println("Resto da divisao: " + resultado);
	}
	
}
