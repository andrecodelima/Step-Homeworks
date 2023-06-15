package model;

public class VendaProduto {
	
	private int id;
	private int idProduto;
	private String nomeProduto;
	private double preco;
	private double quantidade;
	private int idVenda;
	
	public VendaProduto() {}

	public VendaProduto(int id, int idProduto, int idVenda, String nomeProduto, double preco, double quantidade) {
		super();
		this.id = id;
		this.idProduto = idProduto;
		this.idVenda = idVenda;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public VendaProduto(int idProduto, double preco, double quantidade, int idVenda) {
		super();
		this.idProduto = idProduto;
		this.preco = preco;
		this.quantidade = quantidade;
		this.idVenda = idVenda;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	
	
	
}
