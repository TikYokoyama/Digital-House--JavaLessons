package br.com.empiricus.classesExercicios;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Gabriela");
		c1.setEmail("gabriela@gmail.com");
		c1.setIdade(25);		
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Email: " + c1.getEmail());
		System.out.println("Idade: " + c1.getIdade());
		
		c1.bemVindo();
	}

}
