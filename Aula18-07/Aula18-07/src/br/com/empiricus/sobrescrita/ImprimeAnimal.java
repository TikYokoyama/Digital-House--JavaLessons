package br.com.empiricus.sobrescrita;

public class ImprimeAnimal {

	public static void main(String[] args) {

		TestaAnimal t = new TestaAnimal();
		
		Cachorro cr = new Cachorro();
		t.fazerAnimalComer(cr);
		
		t.fazerAnimalComer(new Tigre());
		
		t.fazerAnimalComer(new Animal());
		
	}

}
