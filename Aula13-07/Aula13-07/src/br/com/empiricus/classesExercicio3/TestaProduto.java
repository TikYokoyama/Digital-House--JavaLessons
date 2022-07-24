package br.com.empiricus.classesExercicio3;

public class TestaProduto {
	
	public void main(String[] args) {
		
		ProdutoEletronico p1 = new ProdutoEletronico();
		
		p1.setNome("computador");
		p1.setDescricao("i7 - 16GB RAM");
		p1.setValor(1500.00);
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Descricao: " + p1.getDescricao());
		System.out.println("valor: " + p1.getValor());
		
		p1.emEstoque();
		
		
	}
	
	
}
