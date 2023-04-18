package main;

public class Pessoa {
	
	String nome;
	String genero;
	double altura;
	double peso;
	
	
		
	public Pessoa(String nome, String genero, double altura, double peso) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.altura = altura;
		this.peso = peso;
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
