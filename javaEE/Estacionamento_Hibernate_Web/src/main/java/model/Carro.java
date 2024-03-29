package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carros") // exemplo de como definir o nome na Tabela,
public class Carro {

	@Id // PK
	@GeneratedValue // auto incremento
	int id;

	@Column(length = 20) // coluna da Tabela
	String modelo;

	@Column(length = 4) // se não definir o length, o tamanho padrão é 255
	int ano;

	@Column(length = 15)
	String cor;

	@Column(length = 8, unique = true) // tamanho, unico
	String placa;

	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carro(int id, String modelo, int ano, String cor, String placa) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.placa = placa;
	}

	public Carro(String modelo, int ano, String cor, String placa) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.placa = placa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
