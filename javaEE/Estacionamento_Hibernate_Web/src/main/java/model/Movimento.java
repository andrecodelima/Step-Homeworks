package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Movimento {//Embedded

	@Id
	@GeneratedValue
	private int id;
	
		
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente Cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_carro")
	private Carro Carro;
	
	@Column
	private Date entrada;
	
	@Column
	private Date saida;

	public Movimento() {
		// TODO Auto-generated constructor stub
	}

	public Movimento(model.Cliente cliente, model.Carro carro, Date entrada, Date saida) {
		super();
		Cliente = cliente;
		Carro = carro;
		this.entrada = entrada;
		this.saida = saida;
	}

	public Movimento(int id, model.Cliente cliente, model.Carro carro, Date entrada, Date saida) {
		super();
		this.id = id;
		Cliente = cliente;
		Carro = carro;
		this.entrada = entrada;
		this.saida = saida;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Carro getCarro() {
		return Carro;
	}

	public void setCarro(Carro carro) {
		Carro = carro;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	}
