package br.com.empiricus.sobrecargamento;

public class TestaMinhaCalculadora {

	public static void main(String[] args) {

		MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println(calc.soma(10, 20));
		System.out.println(calc.soma(14.5, 20.7));
		System.out.println(calc.soma(10, 20, 49));
		
	}

}
