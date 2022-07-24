package br.com.empiricus.auula02;

public class ExemploVariavel02 {
	public static void main(String[] args) {
		
		int x = 10;
		
		double d = x; //--> variavel double recebe um valor inteiro
		long l = x; 
		int w = (int) l; //--> tem q arredondar pra dar certo
		
		System.out.println(w);
	}
}
