

CREATE DATABASE mercado

-- TABLE
CREATE TABLE produto (
	idProduto SERIAL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	fabricante VARCHAR(100) DEFAULT 'indefinido',
	preco FLOAT DEFAULT 0
					 
)

-- INSERTS
INSERT INTO produto (nome, fabricante, preco)
VALUES ('Caneta esfereografica', 'Fabercastel', 7.90),
('Caneta esfereografica', 'Bic', 3.90),
('Lapiseira 0.5mm', 'Compactor', 21.90),
('Lapiseira 0.5mm', 'Compactor', 25.90),
('Lapis de Cor', 'Fabercastel', 12.90),
('Borracha', 'Bic', 2.90)

-- QUERYS
SELECT * FROM produto

SELECT MAX(preco) AS mais_caro
FROM produto

SELECT MIN(preco) AS mais_barato
FROM produto

SELECT AVG(preco) AS media_fabricante
FROM produto

SELECT SUM(preco) AS total
FROM produto