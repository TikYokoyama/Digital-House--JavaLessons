package br.com.empiricus.sobrecargamento;

public class Sobreacarga02 {

	public static void main(String[] args) {

		linha('x', 10);
		linha('x');
		linha();
		
	}
	
	//os metodos podem ter nomes iguais, isso é sobrecarga
	//recebe 2 parametros
	public static void linha(char tipo, int tamanho) {
		System.out.println("1a versao: ");
		
		for(int i=0; i<=tamanho; i++) {
			System.out.printf("%c" , tipo);
		}
		
		System.out.println();
	}
	
	//recebe 1 parametro
	public static void linha(char tipo) {
		System.out.println("2a versao: ");
		
		for(int i=0; i<=20; i++) {
			System.out.printf("%c" , tipo);
		}
		
		System.out.println();
	}
	
	//nao recebe parametro
	public static void linha() {
		System.out.println("3a versao: ");
		
		for(int i=0; i<=30; i++) {
			System.out.printf("x");
		}
		
		System.out.println();
	}
	
}
