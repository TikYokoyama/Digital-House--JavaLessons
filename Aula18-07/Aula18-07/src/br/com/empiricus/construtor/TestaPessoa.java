package br.com.empiricus.construtor;

public class TestaPessoa {

	public static void main(String[] args) {

		//Classe ---> objetp --> new Construtor....
		Pessoa p1 = new Pessoa("Tik", 24);
		Pessoa p2 = new Pessoa("Lari", 25);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		System.out.println(p2.nome);
		System.out.println(p2.idade);
		
	}

}
