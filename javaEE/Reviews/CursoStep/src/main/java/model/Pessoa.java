package model;

public class Pessoa {
	
	private int id;
	private String nome;
	private String genero;
	private int idade;
	private String email;
	private String telefone;
	
	
	public Pessoa() {}


	public Pessoa(String nome, String genero, int idade, String email, String telefone) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
	}


	public Pessoa(int id, String nome, String genero, int idade, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
	}

	
	

	public Pessoa(int id, String nome, String genero, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
