package model;

public class JavaBeans {
	
	private int id;
	private String nome;
	private String genero;
	private String email;
	
	public JavaBeans() {}

	public JavaBeans(int id, String nome, String genero, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.email = email;
	}

	public JavaBeans(String nome, String genero, String email) {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
