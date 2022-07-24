package br.com.empiricus.exemplosWhile;

public class While {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0;
		
		while(contador <= 10) {
			System.out.println(contador);
			
			contador++;
			
			//mostra a resposta em determinado tempo
			Thread.sleep(500);
		}
		
	}	
	
}
