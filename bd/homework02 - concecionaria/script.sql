
=========================================
             -- INSTRUÇÕES --

-- BANCO: bd_concessionaria
-- TABELAS: VEICULOS E CLIENTE
-- INSERIR 5 REGISTROS EM CADA TABELA
-- QUERYS: o cliente mais novo
--         o cliente mais velho
--         o veiculo mais novo
--         o veiculo mais barato
--         o veiculo mais caro
--         o veiculo mais velho
--         os veicúlos do mais velho para o mais novo
=========================================

-- MODELAGEM CONCEITUAL

-- Banco: bd_concessionaria

    -- Tabela: VEÍCULO
    -- Atributos:

    -- ID                   
    -- NOME                         VARCHAR(100)
    -- FABRICANTE                   VARCHAR(100)
    -- MODELO                       VARCHAR(100)
    -- PLACA                        VARCHAR(7)
    -- COR                          VARCHAR(50)
    -- COMBUSTIVEL                  VARCHAR(30)
    -- PRECO DE CUSTO               INT
    -- PRECO DE VENDA               INT
    -- ATIVO                        BINARY


    -- Tabela: CLIENTE
    -- Atributos:

    -- ID
    -- NOME                         VARCHAR(100)
    -- NASCIMENTO                   DATE
    -- GENERO                       VARCHAR(15)
    -- CPF                          VARCHAR(14)
    -- FILIACAO                     VARCHAR(100)
    -- ENDERECO                     VARCHAR(100)
    -- TELEFONE                     VARCHAR(15)
    -- EMAIL                        VARCHAR(50)
    -- ATIVO                        BINARY



-- Criacão do banco
CREATE DATABASE bd_concessionaria
USE bd_concessionaria

-- Criação de tabelas
-- Clientes

CREATE TABLE veiculo (

    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(100) NOT NULL,
    FABRICANTE VARCHAR(100) NOT NULL,
    MODELO VARCHAR(100) NOT NULL,
    COR VARCHAR (50) NOT NULL,
    PLACA VARCHAR(7),
    COMBUSTIVEL (30) NOT NULL,
    PRECO DE CUSTO  NOT NULL,
    PRECO DE VENDA  NOT NULL,
    ATIVO BINARY

);

CREATE TABLE cliente(

    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(100) NOT NULL,
    NASCIMENTO DATE NOT NULL,
    GENERO VARCHAR(15) NOT NULL,
    CPF VARCHAR(14) NOT NULL,
    FILIACAO VARCHAR (100),
    ENDERECO VARCHAR (100) NOT NULL,
    TELEFONE VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(50) NOT NULL,
    ATIVO BINARY
);



