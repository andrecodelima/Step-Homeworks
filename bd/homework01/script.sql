
=========================================
             -- INSTRUÇÕES --

-- BANCO: LOJA
-- TABELAS: CLIENTES e PRODUTOS
-- INSERIR 4 REGISTROS EM CADA TABELA
=========================================

-- MODELAGEM CONCEITUAL

-- Banco: LOJA

    -- Tabela: CLIENTES
    -- Atributos:

    -- ID
    -- NOME                     -- VARCHAR   (100)
    -- GENERO                   -- VARCHAR   (10)
    -- NASCIMENTO               -- VARCHAR   (10)
    -- TELEFONE                 -- VARCHAR   (14)
    -- EMAIL                    -- VARCHAR   (50)
    -- ENDERECO                 -- VARCHAR   (100)
    -- CPF                      -- VARCHAR   (14)
    -- ATIVO

    -- Tabela: PRODUTOS
    -- Atributos:

    -- ID
    -- NOME                     -- VARCHAR   (100)
    -- CATEGORIA                -- VARCHAR   (50)
    -- MARCA                    -- VARCHAR   (50)
    -- FABRICANTE               -- VARCHAR   (50)
    -- PRECO                    -- FLOAT     (9) 
    -- PRECO DE CUSTO           -- FLOAT     (9)
    -- QUANTIDADE EM ESTOQUE    -- INT       (9)
    -- ATIVO

-- Criação do Banco
CREATE DATABASE LOJA;
USE LOJA;
 
 -- Criação de tabelas

 -- clientes
CREATE TABLE CLIENTES (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(100) NOT NULL,
    GENERO VARCHAR(10) NOT NULL,
    NASCIMENTO VARCHAR(10) NOT NULL,
    TELEFONE VARCHAR(14) NOT NULL,
    EMAIL VARCHAR(50),
    ENDERECO VARCHAR(100),
    CPF VARCHAR(14),
    ATIVO BINARY

);

-- produtos
CREATE TABLE PRODUTOS(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(100) NOT NULL,
    CATEGORIA VARCHAR(50) NOT NULL,
    MARCA VARCHAR(50) NOT NULL,
    FABRICANTE VARCHAR(50) NOT NULL,
    PRECO FLOAT(9) NOT NULL,
    PRECO_DE_CUSTO FLOAT(9) NOT NULL,
    QTD_EM_ESTOQUE INT(9) NOT NULL,
    ATIVO BINARY
);

-- EXIBINDO TABELAS
SHOW TABLES

==============================
-- INSERINDO DADOS - CLIENTES
INSERT INTO CLIENTES(ID, NOME, GENERO, NASCIMENTO, TELEFONE, EMAIL, ENDERECO, CPF, ATIVO )
VALUES(NULL, 'ROZANA', 'FEMININO', '23/09/1967', '(21)98839-3212','ro@gmail.com', 'Rua Bartolomeu Mitre 1221 - Ap 301 - Leblon - Rio de Janeiro','121.321.234.21',1),
      (NULL, 'ANA JÚLIA', 'FEMININO', '23/11/1978', '(21)98319-8272','julima@gmail.com', 'Rua Prudente de Moarais 220 - Ap 503 - Ipanema - Rio de Janeiro','335.587.407-85',1),
      (NULL, 'JOSÉ FRANCISCO', 'MASCULINO', '02/02/1969', '(21)97719-5475','jfrancis@yahoo.com', 'Rua Nilo Peçanha 120 - Ap 801 - Centro - Rio de Janeiro','956.978.047-92',0),
      (NULL, 'CARLOS FERRAZ', 'MASCULINO', '13/07/1988', '(21)98711-7457','carlos.ferraz2@outlook.com', 'Rua Toneleiros 320 - Ap 704  - Copacabana - Rio de Janeiro','490.159.886-41',1),
      (NULL, 'CAROLINA MATTOS', 'FEMININO', '22/03/1975', '(21)2569-6969', 'c.mattos@outlook.com', 'Rua Figueiredo de Magalhães 456 - Ap 501 - Copacabana - Rio de Janeiro', '221.175.457.427-11',0)

-- EXIBINDO TODOS REGISTROS
SELECT * FROM CLIENTES;

-- EXIBINDO ALGUNS REGISTROS
SELECT NOME FROM CLIENTES WHERE GENERO = 'FEMININO';
SELECT * FROM clientes WHERE ATIVO = 0
==============================

==============================
-- INSERINDO DADOS - PRODUTOS
INSERT INTO PRODUTOS(ID, NOME, CATEGORIA, MARCA, FABRICANTE, PRECO, PRECO_DE_CUSTO, QTD_EM_ESTOQUE, ATIVO)
VALUES(NULL, 'CANETA BIC', 'CANETAS', 'BIC-OFFICE', 'BIC', 3.99, 0.99, 200, 1),
      (NULL, 'CANETA FABERCASTEL', 'CANETAS', 'FABER-OFFICE', 'FABERCASTEL', 4.99, 1.23, 200, 1),
      (NULL, 'ENVELOPE PARDO', 'ENVELOPES', 'POSTBOX', 'POSTMAX', 3.00, 0.1, 2000, 1),
      (NULL, 'CARTUCHO DE IMPRESSORA HP', 'IMPRESSORAS', '662-PRETO', 'HP', 29.00, 10.2, 500, 1),
      (NULL, 'CARTUCHO DE IMPRESSORA EPSON', 'IMPRESSORAS', '194-PRETO', 'EPSON', 25.00, 8.5, 200, 0)



-- EXIBINDO TODOS REGISTROS
SELECT * FROM PRODUTOS;
SELECT * FROM produtos WHERE ATIVO = 0;
==============================
