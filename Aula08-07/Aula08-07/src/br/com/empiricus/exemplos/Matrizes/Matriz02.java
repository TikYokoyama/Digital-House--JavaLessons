package br.com.empiricus.exemplos.Matrizes;

import java.util.Scanner;

public class Matriz02 {

	public static void main(String[] args) {
		//Declaracao de Matriz
										   //linha coluna
		double[][] notasAlunos = new double[2][4]; //[0][0]...[1][3]
		Scanner entrada = new Scanner(System.in);
		
		//ADICIONAR VALORES NA MATRIZ
		for(int l = 0; l < notasAlunos.length; l++) { //linhas
			for(int c = 0; c < notasAlunos[l].length; c++) { //colunas
				System.out.printf("Digite as notas: [%d] [%d]: ", l, c);; //printf %d=valores inteiros
				notasAlunos[l][c] = entrada.nextDouble();
			}
			System.out.println();
		}
		
		//MOSTRAR VALORES DA MATRIZ
		for(int l = 0; l < notasAlunos.length; l++) { //linhas
			for(int c = 0; c < notasAlunos[l].length; c++) { //colunas
				System.out.print(notasAlunos[l][c] + " | ");
			}
			System.out.println();
		}
		
		
	}
}

