package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carro")
public class Carro {
	
	@Id // PK
	@GeneratedValue // Auto incremento
	int id;
	
	@Column(length = 20)
	String modelo;
	
	@Column
	int ano;
	
	@Column(length = 20)
	String cor;
	
	@Column(length = 8, unique = true)
	String placa;
	
}
