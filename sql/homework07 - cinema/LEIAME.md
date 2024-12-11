CREATE DATABASE lojinha;
USE lojinha;

CREATE TABLE cliente (
    idCliente int PRIMARY KEY AUTO_INCREMENT,
    nome varchar(100),
    cpf varchar(15),
    email varchar(50),
    instagram varchar(20)
    )

CREATE TABLE fabricante (
    idFabricante int PRIMARY KEY AUTO_INCREMENT,
    nome varchar(100),
    telefone varchar(14),
    uf varchar(2)
    )

CREATE TABLE produto (
    idProduto int PRIMARY KEY AUTO_INCREMENT,
    nome varchar(100),
    codbarras varchar(15),
    preco float,
    idFabricante int,
    CONSTRAINT FK_produto_fabricante FOREIGN KEY
    (idFabricante) REFERENCES fabricante(idFabricante)
    )

CREATE TABLE venda (
    idVenda int PRIMARY KEY AUTO_INCREMENT,
    idCliente int,
    idProduto int,
    dataHora datetime DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT FK_venda_produto FOREIGN KEY
    (idProduto) REFERENCES produto(idProduto),
    CONSTRAINT FK_venda_cliente FOREIGN KEY
    (idCliente) REFERENCES cliente(idCliente)    
    )


===============================Relacionamento N:N (muitos para muitos)

remover a coluna de relacionamento de venda com produtos

ALTER TABLE venda
DROP CONSTRAINT FK_venda_produto;

ALTER TABLE venda
DROP COLUMN idProduto;

criar tabela de link
CREATE TABLE produtosVenda (
    idVenda int,
    idProduto int,
    CONSTRAINT FK_produtosVenda_venda FOREIGN KEY
    (idVenda) REFERENCES venda(idVenda),
    CONSTRAINT FK_produtosVenda_produto FOREIGN KEY
    (idProduto) REFERENCES produto(idProduto)
    )


///Então, por impossibilidade técnica de ter um relacionamento de n:n (muitos para muitos) é necessário criar uma tabela de link.



//////////////////////////DEVER DE CASA

Crie a modelagem do banco de dados de um cinema. Pense nas tabelas que serão necessárias (o que você precisa guardar) e as relações (a ligação entre os dados).
Julgue se será necessário tabelas link e, caso veja necessidade, crie-as para possibilitar o relacionamento de n:n
