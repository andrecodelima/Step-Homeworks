package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="entrada")
public class Entrada {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="data")
	private Date DataEntrada;
	
	@ManyToOne
	@JoinColumn(name="carro_id", referencedColumnName = "id")private Carro carro;
	
	public Entrada(int id, Date dataEntrada, Carro carro) {
		super();
		this.id = id;
		DataEntrada = dataEntrada;
		this.carro = carro;
	}

	public Entrada(Date dataEntrada, Carro carro) {
		super();
		DataEntrada = dataEntrada;
		this.carro = carro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataEntrada() {
		return DataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		DataEntrada = dataEntrada;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

    
}
