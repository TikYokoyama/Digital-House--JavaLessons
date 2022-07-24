package br.com.empiricus.metodos;

public class TestaMetodo {

	//variaveis globais
	static int numero3=0, numero4, multiplicacao, divisao;
	
	public static void main(String[] args) {
		metodo01(); //chamada de metodo
		metodo02();
		metodo03();
//		metodo04(); chamamos no metodo05
		metodo05();
		metodo06(6,3);
	}
	
	//verbos --> acoes --> ex.: salvas, carregar, calcular, etc
	public static void metodo01() {
		System.out.println("ola eu sou o metodo 01");
	}
	
	public static void metodo02() {
		int numero1 = 10 , numero2 = 20, soma; //variaveis locais
		
		soma = numero1 + numero2;
		System.out.println("soma metodo02: " + soma);
	}
	
	public static void metodo03() {
		int numero1 = 100 , numero2 = 50, subtracao; //variaveis locais
		
		subtracao = numero1 - numero2;
		System.out.println("subtracao metodo03: " + subtracao);
	}
	
	public static void metodo04() {
		numero3 = 8;
		numero4 = 5;
		multiplicacao = numero3 * numero4;
	}
	
	public static void metodo05() {
		metodo04();
		System.out.println("Multiplicacao: metodo05.. recebendo valor do metodo04: " + multiplicacao);
	}
	
	public static void metodo06(int numero5, int numero6) { //parametros
		divisao = numero5 / numero6;
		multiplicacao = numero5 * numero6;
		System.out.println("Divisao metodo06: " + divisao);
		System.out.println("Uma outra multiplicacao metodo06: " + multiplicacao);
	}
	
	
}