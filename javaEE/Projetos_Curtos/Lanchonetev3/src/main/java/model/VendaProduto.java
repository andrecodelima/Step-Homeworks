package model;

public class VendaProduto {

	private int id;
	private int quantidade;
	private double preco;
	
	public VendaProduto() {}

	
	public VendaProduto(int quantidade, double preco) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
	}


	public VendaProduto(int id, int quantidade, double preco) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.preco = preco;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
