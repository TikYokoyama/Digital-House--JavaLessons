package br.com.empiricus.sobrescrita;

public class Cachorro extends Animal{

	//sobrescrita - @Override
	public void comer() {
		System.out.println("Cachorro comendo....");
	}
	
	public void somAnimal() {
		System.out.println("Som do Cachorro");
	}
}
