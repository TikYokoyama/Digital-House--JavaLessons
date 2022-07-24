package br.com.empiricus.sobrecargamento;

public class MinhaCalculadora {

	public static int soma(int numero1, int numero2) {
		System.out.println("inteiros");
		return numero1 + numero2;
	}
	
	public static double soma(double numero1, double numero2) {
		System.out.println("double");
		return numero1 + numero2;
	}
	
	public static double soma(double numero1, double numero2, double numero3) {
		System.out.println("double com 3 numeros");
		return numero1 + numero2 + numero3;
	}
	
}
