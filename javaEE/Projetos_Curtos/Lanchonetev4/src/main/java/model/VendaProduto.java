package model;

public class VendaProduto {
	
	private int id;
	private int idVenda;
	private int idProduto;
	private String nomeProduto;
	private Double preco;
	private Double quantidade;
	
	
	public VendaProduto(int id,int idVenda, int idProduto, String nomeProduto, Double preco, Double quantidade) {
		this.id = id;
		this.idVenda = idVenda;
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public VendaProduto(int idVenda,int idProduto, Double preco, Double quantidade) {
		this.idVenda = idVenda;
		this.idProduto = idProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}


	 
	
	
}
