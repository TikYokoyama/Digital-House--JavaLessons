package br.com.empiricus.heranca;
						 //Heranca --> da Classe Funncionario em relacao a Classe Pessoa
public class Funcionario extends Pessoa {
	
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}