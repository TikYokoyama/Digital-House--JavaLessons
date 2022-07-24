package br.com.empiricus.classesExercicio2;

public class TestaAviao {

	public static void main(String[] args) {

		Aviao a1 = new Aviao();
		
		a1.setMarca("Gol");
		a1.setCor("amarelo");
		a1.setAno(2001);
		
		System.out.println("Marca: " + a1.getMarca());
		System.out.println("Cor" + a1.getCor());
		System.out.println("Ano: " + a1.getAno());
	}
}
