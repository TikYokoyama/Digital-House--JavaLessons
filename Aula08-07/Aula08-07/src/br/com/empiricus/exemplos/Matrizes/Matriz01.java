package br.com.empiricus.exemplos.Matrizes;

public class Matriz01 {

	public static void main(String[] args) {
		//Declaracao de Matriz
										   //linha coluna
		double[][] notasAlunos = new double[2][4]; //[0][0]...[1][3]
		
		notasAlunos[0][0] = 9.9;
		notasAlunos[0][1] = 8.8;
		//se n tiver nota ele preenche automaticamente zerado //0.0
		notasAlunos[0][3] = 8.8;
		
		notasAlunos[1][0] = 7.8;
		notasAlunos[1][1] = 3.5;
		notasAlunos[1][2] = 5.2;
		notasAlunos[1][3] = 2.8;
		
		for(int l = 0; l < notasAlunos.length; l++) { //linhas
			for(int c = 0; c < notasAlunos[l].length; c++) { //colunas
				System.out.print(notasAlunos[l][c] + " | ");
			}
			System.out.println();
		}
		
		
	}
	
}
