package br.com.empiricus.exemplosVetores;

public class Vetor01 {

	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10]; //[0]...[9]
		
		arrayVetor[5] = 250; //atribuindo 250 ao index 5
		
		int x = 633;
		arrayVetor[7] = x;
		
		arrayVetor[2] = 1000;
		

		for(int i = 0; i<=arrayVetor.length; i++){
			System.out.println(i + " - " + arrayVetor[i]); 
		}
	}

}
