package br.com.empiricus.classesExercicio3;

public class ProdutoEletronico {

	private String nome;
	private String descricao;
	private double valor;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	void esgotado() {
		System.out.println("Produto esgotado!");
	}
	
	void emEstoque() {
		System.out.println("Produto em estoque");
	}
	
}
