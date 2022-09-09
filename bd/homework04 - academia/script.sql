
=====================================================
             -- INSTRUÇÕES --

/*
Crie um banco de academia com as seguintes tabelas:
Aluno (nome, nascimento, genero,peso,altura)
Atividades(nome, turno,preco)
Vendedor(nome,telefone)

Matricula(aluno, atividade, vendedor, quando foi feita a matricula (dia e hora))


Exiba:
<<<<<<< HEAD
Todas as atividades ordenadas por turno
Todos os alunos que possuem matriculas
Todas as atividades que possuem matriculas
Todas as matriculas feitas por um vendedor

DESAFIO 2pts: O valor total de matrículas feitas por um vendedor. 
Ou seja, somar todos os preços das atividades matriculadas por ele.
=======
todas as atividades ordenadas por turno
todos os alunos que possuem matriculas
todas as atividades que possuem matriculas
todas as matriculas feitas por um vendedor

DESAFIO 2pts: O valor total de matrículas feitas por um vendedor. Ou seja, somar todos os preços das atividades matriculadas por ele.
>>>>>>> ac5a99c30a6d729ad1b60bfa6859e765c3a633d0
*/

=====================================================

<<<<<<< HEAD
 
=======
 CREATE DATABASE academia

-- MODELAGEM CONCEITUAL

-- Banco: academia

    -- Tabela: ALUNO
    -- Atributos:

    -- ID
    -- NOME                         VARCHAR(100)
    -- NASCIMENTO                   DATE
    -- GENERO                       VARCHAR(15)
    -- PESO                         INT(6)
    -- ALTURA                       INT(6)

    =
    -- Tabela: ATIVIDADE
    -- Atributos:

    -- ID
    -- NOME                         VARCHAR(100)
    -- TURNO                        CHAR(1)
    -- PRECO                        INT(6)

    =
    -- Tabela: VENDEDOR
    -- Atributos:

    -- ID
    -- NOME                         VARCHAR(100)
    -- TELEFONE                     VARCHAR(12)
    
    =

    -- Tabela: MATRICULA
    -- Atributos:

    -- ID
    -- ID_ALUNO                       
    -- ID_ATIVIDADE                     
    -- ID_VENDEDOR                  

CREATE TABLE aluno (

    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(100) NOT NULL,
    NASCIMENTO DATE NOT NULL,
    GENERO VARCHAR(15) NOT NULL,
    PESO   INT(6) NOT NULL,
    ALTURA INT(6),
    ATIVO BINARY

);

=

CREATE TABLE atividade (

    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(100) NOT NULL,
    TURNO CHAR(1) NOT NULL,
    PRECO INT(6) NOT NULL,
    ATIVO BINARY

);

=

CREATE TABLE vendedor (

    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(100) NOT NULL,
    TELEFONE VARCHAR(100) NOT NULL,
    ATIVO BINARY

);

=

CREATE TABLE matricula (

    ID INT PRIMARY KEY AUTO_INCREMENT,
    ID_ALUNO INT NOT NULL,
    ID_ATIVIDADE INT NOT NULL,
    ID_VENDEDOR INT NOT NULL,
    DATA DATETIME NOT NULL,

    CONSTRAINT FK_MATRICULA_ALUNO FOREIGN KEY
    MATRICULA(ID_ALUNO) REFERENCES ALUNO(ID),

    CONSTRAINT FK_MATRICULA_ATIVIDADE FOREIGN KEY
    MATRICULA(ID_ATIVIDADE) REFERENCES ATIVIDADE(ID),

    CONSTRAINT FK_MATRICULA_VENDEDOR FOREIGN KEY
    MATRICULA(ID_VENDEDOR) REFERENCES VENDEDOR(ID)

);



== ALUNO
INSERT INTO ALUNO(ID, NOME, NASCIMENTO, GENERO, PESO, ALTURA, ATIVO)
VALUES(NULL, 'ANDRÉ', '1989-07-25','M', 89, 1.85, 1),
      (NULL, 'ANA', '1988-01-02','F', 59, 1.55, 1),
      (NULL, 'BIA', '1979-11-15','F', 69, 1.67, 1),
      (NULL, 'BETO', '1994-03-05','M', 95, 1.95, 1)

== ATIVIDADE
INSERT INTO ATIVIDADE(ID, NOME, TURNO, PRECO, ATIVO)
VALUES(NULL, 'MUSCULAÇÃO', 'N', '85', 1),
      (NULL, 'AEROBICA', 'T', '125', 1),
      (NULL, 'DANÇA', 'M', '79', 1),
      (NULL, 'MUSCULAÇÃO', 'M', '79', 0),
      (NULL, 'DANÇA', 'N', '129', 1)

== VENDEDOR
INSERT INTO VENDEDOR(ID, NOME, TELEFONE, ATIVO)
VALUES(NULL, 'ALEXANDRE', '21-97589-2022', 1),
      (NULL, 'JULIANA', '21-9889-7015', 1),
      (NULL, 'WAGNER', '11-9999-8027', 1)



INSERT INTO MATRICULA(ID_ALUNO, ID_ATIVIDADE, ID_VENDEDOR, DATA)
VALUES(2,2,3,'2022-08-25 11:10:51'),
      (3,1,1,'2022-08-25 11:10:37'),
      (2,3,1,'2022-08-20 10:03:22'),
      (1,2,2,'2022-08-16 15:23:02')

== QUERYS

-Todas as atividades ordenadas por turno
SELECT NOME AS "Atividades", TURNO AS "Horário" FROM ATIVIDADE
ORDER BY TURNO

-Todos os alunos que possuem matriculas
SELECT MATRICULA.ID AS 'Matricula', ALUNO.NOME AS 'Aluno'
FROM MATRICULA INNER JOIN ALUNO 
ON MATRICULA.ID_ALUNO = ALUNO.ID

-Todas as atividades que possuem matriculas
SELECT MATRICULA.ID AS 'Matricula', ATIVIDADE.NOME AS 'Atividade'
FROM MATRICULA INNER JOIN ATIVIDADE
ON MATRICULA.ID_ATIVIDADE = ATIVIDADE.ID

-Todas as matriculas feitas por um vendedor
SELECT MATRICULA.ID AS 'Matricula', VENDEDOR.NOME AS 'Vendedor'
FROM MATRICULA INNER JOIN VENDEDOR
ON MATRICULA.ID_VENDEDOR = VENDEDOR.ID


- DESAFIO 2pts: O valor total de matrículas feitas por um vendedor. 
    Ou seja, somar todos os preços das atividades matriculadas por ele.

SELECT MATRICULA.ID AS 'Matricula', VENDEDOR.NOME AS 'Vendedor'
FROM MATRICULA INNER JOIN VENDEDOR
 
ON MATRICULA.ID_VENDEDOR = VENDEDOR.ID AND VENDEDOR.ID = 3


SELECT MATRICULA.ID AS 'Matricula', VENDEDOR.NOME AS 'Vendedor', ATIVIDADE.PRECO AS 'R$'
FROM MATRICULA INNER JOIN VENDEDOR INNER JOIN ATIVIDADE

ON MATRICULA.ID_VENDEDOR = VENDEDOR.ID AND VENDEDOR.ID = 3
>>>>>>> ac5a99c30a6d729ad1b60bfa6859e765c3a633d0
