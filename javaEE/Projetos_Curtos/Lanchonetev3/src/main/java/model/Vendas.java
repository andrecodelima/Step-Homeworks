package model;

import java.time.LocalDate;

public class Vendas {
	
	private int id;
	private LocalDate data;
	private boolean entrega;
	
	public Vendas() {}

	public Vendas(LocalDate data, boolean entrega) {
		super();
		this.data = data;
		this.entrega = entrega;
	}

	public Vendas(int id, LocalDate data, boolean entrega) {
		super();
		this.id = id;
		this.data = data;
		this.entrega = entrega;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public boolean isEntrega() {
		return entrega;
	}

	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}
	
	
}
