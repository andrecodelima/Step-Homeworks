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
@Table(name="saida")
public class Saida {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="data")
	private Date DataSaida;
	
    @ManyToOne
    @JoinColumn(name="carro_id", referencedColumnName = "id")
    private Carro carro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataEntrada() {
		return DataSaida;
	}


	public Date getDataSaida() {
		return DataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		DataSaida = dataSaida;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
    
    
    
	
}
