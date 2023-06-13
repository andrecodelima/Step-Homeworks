package model;

import java.time.LocalDate;

public class Venda {
	
	private int id;
	private LocalDate datahora;
	private boolean entrega;
	
	public Venda() {}

	public Venda(LocalDate data, boolean entrega) {
		super();
		this.datahora = data;
		this.entrega = entrega;
	}

	public Venda(int id, LocalDate data, boolean entrega) {
		super();
		this.id = id;
		this.datahora = data;
		this.entrega = entrega;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getData() {
		return datahora;
	}

	public void setData(LocalDate data) {
		this.datahora = data;
	}

	public boolean isEntrega() {
		return entrega;
	}

	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}
	
	
}
