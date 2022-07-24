package br.com.empiricus.aula08.operadoreslogicos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		// e --> &&
		// ou --> ||
		// ou exclusivo --> ^
		// Not -> !*/
		
		int idade =20;
		boolean precisaVotar = idade >= 18 && idade < 70;
		System.out.println(precisaVotar); //true
		
		
		//false = se ambos n forem verdadeiro
		int nrAmarelo = 2, nrVermelho = 1;
		boolean suspenso = nrAmarelo ==0 || nrVermelho ==1;
		System.out.println(suspenso);	//true
		
		//false = se ambos forem true ou ambos forem false
		int x = 9, y = 11;
		boolean teste = x > 10 ^ y > 10;
		
		int i = 20;
		boolean maiorIdade = !(i >= 18); //nega q 'i; é maior que 18, portanto da false
		System.out.println(maiorIdade); //false
		
		
	}
}
