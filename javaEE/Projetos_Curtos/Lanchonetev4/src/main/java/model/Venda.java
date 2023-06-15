package model;

import java.sql.Date;

public class Venda {

	private int id;
	private Date dataHora;
	private boolean entrega;
	
	public Venda() {}

	public Venda(int id, Date dataHora, boolean entrega) {
		super();
		this.id = id;
		this.dataHora = dataHora;
		this.entrega = entrega;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public boolean isEntrega() {
		return entrega;
	}

	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}
	
	
	
}
