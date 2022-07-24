package br.com.empiricus.collections03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {

		//Ctrol + shift + o
		Scanner sc = new Scanner(System.in);
		//Ctrol + shift + o
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		
		
		System.out.println("Quantos alunos voce deseja add: ");
		int numeroAlunos = sc.nextInt();
		
		for(int i = 0; i < numeroAlunos ; i++) {
			System.out.println("Digite a idade do aluno: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.nextLine();
			
			listaAlunos.add(new Aluno(idade, nome)); //cria novo aluno 
			
		}
		
		for(Aluno i: listaAlunos) {
			System.out.println(i);
		}

	}

}
