package Pessoa;

public class Pessoa {
	
	String nome;
	String genero;
	double peso;
	double altura;
	
		
	public Pessoa(String nome, String genero, double peso, double altura) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Pessoa(){}
	
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double imc(){
		
		double imc = 0;
		imc = this.peso / (this.altura * this.altura);
		
		return imc;
		
		
	}
	
	
	
}
