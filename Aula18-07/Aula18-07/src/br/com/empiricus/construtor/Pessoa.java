package br.com.empiricus.construtor;

public class Pessoa {

	//Declaracao de Atributos --> caracteristicas, variaveis
	String nome;
	int idade;
	
	//Construtor de Classe
	Pessoa(String n, int i){
		System.out.println( "sou o contrutor da classe pessoa");
		nome = n;
		idade = i;
	}
	
}
