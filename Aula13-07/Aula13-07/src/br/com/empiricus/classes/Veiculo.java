package br.com.empiricus.classes;

public class Veiculo {
	
	//Atributos...
	private String modelo;
	private String marca;
	private int ano;
	private int velocidade = 0; 
	
	//Metodo --> servico --> acessar pra modificacao do atributo
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	//Metodo --> servico --> recuperadao dos dados que foram modificados
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getAno() {
		return ano;
	}
	
	//Metodo...
	void acelerar(int aceleracao) throws InterruptedException{
		for(int i = 0; i<aceleracao; i++) {
			velocidade++;
			System.out.println(i);
			Thread.sleep(500);
		}
		
		//velocidade += aceleracao;
	}
	
	void freiar(int reducao) throws InterruptedException{
		for(int i = velocidade; i > reducao; i--) {
			velocidade--;
			System.out.println(i);
			Thread.sleep(500);
		}
	}
	
}
