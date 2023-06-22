SQL - LANCHONETE

CREATE TABLE produto(
	id INT PRIMARY KEY auto_increment,
    nome VARCHAR(50) NOT NULL,
    descricacao VARCHAR(100) NOT NULL,
    preco DOUBLE DEFAULT 0
);

CREATE TABLE usuario(
	id INT PRIMARY KEY auto_increment,
    usuario VARCHAR(50) unique NOT NULL,
    password VARCHAR(100) NOT NULL,
);

CREATE TABLE venda(
	id INT PRIMARY KEY auto_increment,
	datahora DATETIME DEFAULT current_timestamp,
    entrega boolean DEFAULT false
);

CREATE TABLE vendaProduto (
    id INT PRIMARY KEY AUTO_INCREMENT,
    idProduto INT NOT NULL,
    quantidade DOUBLE DEFAULT 1,
    preco DOUBLE DEFAULT 0,
    idVenda INT NOT NULL,
    CONSTRAINT FK_VENDAPRODUTO_PRODUTO
        FOREIGN KEY (idProduto)
        REFERENCES produto(id),
    CONSTRAINT FK_VENDAPRODUTO_VENDA
        FOREIGN KEY (idVenda)
        REFERENCES venda(id)
);