package br.com.empiricus.classes;

public class TestaAluno {

	public static void main(String[] args) {
		
		//Estanciar o objeto --> criar o objeto
		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();
		
		al1.nome = "Tiaki";
		al1.idade = 24;
		al1.curso = "Java - Puro";
		
		System.out.println(al1.nome);
		System.out.println(al1.idade);
		System.out.println(al1.curso);
		al1.estudar();	
		
		System.out.println(); //pula linha
		
		al2.nome = "Larissa";
		al2.idade = 25;
		al2.curso = "Canto Lirico";
		
		System.out.println(al2.nome);
		System.out.println(al2.idade);
		System.out.println(al2.curso);
		al2.estudar();	
		
		
		
	}
}
