
=====================================================
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
=====================================================

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
=====================

-- Criação de tabelas
-- Clientes
=====================
CREATE TABLE veiculo (

    ID INT PRIMARY KEY AUTO_INCREMENT,
    TIPO VARCHAR(30) NOT NULL,
    FABRICANTE VARCHAR(100) NOT NULL,
    MODELO VARCHAR(100) NOT NULL,
    COR VARCHAR (50) NOT NULL,
    PLACA VARCHAR(10),
    ANO INT NOT NULL,
    COMBUSTIVEL VARCHAR(30) NOT NULL,
    PRECO_DE_CUSTO INT  NOT NULL,
    PRECO_DE_VENDA INT NOT NULL,
    ATIVO BINARY

);

-- ALTER TABLE veiculo
-- ADD COLUMN ANO int

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


-- INSERINDO DADOS
===================

-- INSERINDO DADOS - VEÍCULO

INSERT INTO veiculo(ID, TIPO, FABRICANTE, MODELO, COR, PLACA, ANO, COMBUSTIVEL, PRECO_DE_CUSTO, PRECO_DE_VENDA, ATIVO)
VALUE(NULL, 'CARRO', 'Volkswagen', 'Gol', 'Branco', 'HPI-9853', 2014, 'Gasolina', 10000, 25000, 1),
(NULL, 'CARRO', 'Fiat', 'Palio', 'Preto', 'FZF-6859' , 2015, 'Etanol', 15000, 30000, 1),
(NULL, 'CARRO', 'Volkswagen', 'Fox/CrossFox', 'Branco', 'IJR-1758', 2018, 'Gasolina', 13000, 29000, 1),
(NULL, 'CARRO', 'General Motors', 'Onix', 'Vermelho', 'MCN-3446', 2020, 'Gasolina', 20000, 39000, 0),
(NULL, 'CARRO', 'Hyundai ', 'HB20', 'Branco', 'KEO-8288', 2019, 'GNV', 19000, 31000, 0),
(NULL, 'CARRO', 'General Motors ', 'Cobalt', 'Preto', 'CYC-5929', 2021, 'Gasolina', 20000, 40000, 1),
(NULL, 'CARRO', 'Toyota', 'Corolla', 'Preto', 'MND-5423', 2021, 'Gasolina', 30000, 60000, 1)



-- INSERINDO DADOS - CLIENTE

INSERT INTO CLIENTE(ID, NOME, NASCIMENTO, GENERO, CPF, FILIACAO, ENDERECO, TELEFONE, EMAIL, ATIVO )
VALUES(NULL, 'ROZANA', '1967-09-23', 'FEMININO', '121.321.234.21', 'Maria Silva', 'Rua Bartolomeu Mitre 1221 - Ap 301 - Leblon - Rio de Janeiro', '(21)98839-3212', 'ro@gmail.com', 1),
(NULL, 'ANA JÚLIA', '1978-11-23', 'FEMININO', '335.587.407-85', 'Silvio Lima', 'Rua Prudente de Moarais 220 - Ap 503 - Ipanema - Rio de Janeiro', '(21)98319-8272', 'julima@gmail.com', 1),
(NULL, 'JOSÉ FRANCISCO', '1969-02-02', 'MASCULINO', '956.978.047-92', 'Ana Ruth Oliveira', 'Rua Nilo Peçanha 120 - Ap 801 - Centro - Rio de Janeiro', '(21)97719-5475', 'jfrancis@yahoo.com', 0),
(NULL, 'CARLOS FERRAZ', '1988-07-13', 'MASCULINO', '490.159.886-41', 'Inácio Ferraz', 'Rua Toneleiros 320 - Ap 704  - Copacabana - Rio de Janeiro', '(21)98711-7457', 'carlos.ferraz2@outlook.com', 1),
(NULL, 'CAROLINA MATTOS', '1975-03-22', 'FEMININO', '221.175.189-11', 'Joana Mattos', 'Rua Figueiredo de Magalhães 456 - Ap 501 - Copacabana - Rio de Janeiro', '(21)2569-6969', 'c.mattos@outlook.com', 1),
(NULL, 'ROBERTO DA SILVA', '1992-09-17', 'MASCULINO', '125.122.457.25', 'Clarice da Silva', 'Rua Álvaro Ramos 221 - Ap 202 - Botafogo - Rio de Janeiro', '(21)97875-4029', 'roberto_silva13@gmail.com.br', 1)


-- QUERYS
=============

1-- Cliente mais novo

SELECT NOME AS "CLIENTE MAIS NOVO", NASCIMENTO AS "DATA DE NASCIMENTO" FROM cliente
WHERE NASCIMENTO = (SELECT MAX(NASCIMENTO) FROM cliente)
/*Selecione o nome com o apelido cliente mais novo. Nascimento com o apelido data de nascimento 
da tabela cliente.
Onde a coluna nascimento é igual ao valor maximo de nacimento da coluna cliente */

SELECT NOME AS "CLIENTE MAIS NOVO", NASCIMENTO FROM cliente
WHERE NASCIMENTO = (SELECT MAX(NASCIMENTO) FROM cliente)

2-- Cliente mais velho
SELECT NOME AS "CLIENTE MAIS VELHO", NASCIMENTO AS "DATA DE NASCIMENTO" FROM cliente
WHERE NASCIMENTO = (SELECT MIN(NASCIMENTO) FROM cliente)

3-- Veículo mais novo
SELECT MODELO AS "MODELO MAIS NOVO", FABRICANTE AS "FABRICANTE", ANO AS "ANO DO VEÍCULO" FROM veiculo
WHERE ANO = (SELECT MAX(ANO) FROM veiculo)

4-- Veículo mais velho
SELECT MODELO AS "MODELO MAIS ANTIGO", FABRICANTE AS "FABRICANTE", ANO FROM veiculo
WHERE ANO = (SELECT MIN(ANO) FROM veiculo)

5-- Veículo mais barato
SELECT MODELO AS "MODELO MAIS BARATO", FABRICANTE AS "FABRICANTE", PRECO_DE_VENDA AS "R$" FROM veiculo
WHERE PRECO_DE_VENDA = (SELECT MIN(PRECO_DE_VENDA) FROM veiculo)

6-- Veículo mais caro
SELECT MODELO AS "MODELO MAIS CARO", FABRICANTE AS "FABRICANTE", PRECO_DE_VENDA  AS "R$" FROM veiculo
WHERE PRECO_DE_VENDA = (SELECT MAX(PRECO_DE_VENDA) FROM veiculo)

7-- Veículos mais valhos até os mais novos
SELECT MODELO AS "MODELO", FABRICANTE AS "FABRICANTE", ANO FROM veiculo ORDER BY ANO ASC 




