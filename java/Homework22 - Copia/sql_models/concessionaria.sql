
CREATE DATABASE bd_concessionaria_hm22;
USE bd_concessionaria_hm22;

CREATE TABLE veiculo(

	ID INT PRIMARY KEY AUTO_INCREMENT,
	MODELO VARCHAR(30) NOT NULL,
	FABRICANTE VARCHAR(30) NOT NULL,
	ANO INT NOT NULL,
	COR VARCHAR (30) NOT NULL,
	PRECO DOUBLE NOT NULL

);