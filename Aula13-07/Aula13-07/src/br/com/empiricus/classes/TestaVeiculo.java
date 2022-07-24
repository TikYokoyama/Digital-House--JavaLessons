package br.com.empiricus.classes;

public class TestaVeiculo {

	public static void main(String[] args) throws InterruptedException{

		//Classe - objeto = Construtor...
		Veiculo v1= new Veiculo();
		Veiculo v2= new Veiculo();
		
		v1.setModelo("Corcel -sedan"); //puxando o private
		v1.setMarca("Ford");
		v1.setAno(1978);
		
		System.out.println(v1.getModelo());
		System.out.println(v1.getMarca());
		System.out.println(v1.getAno());
//		System.out.println(v1.velocidade);
		
		v1.acelerar(20);
		v1.freiar(10);
	}

}
