
/*
exiba veículos com valores até 20.000
exiba veículos com valores até 10.000
exiba veículos com valores abaixo da média
exiba veículos com valores acima da média

*/

//1

SELECT fabricante.nome AS FABRICANTE,
	   veiculo.nome AS Modelo,
	   veiculo.preco AS Preço
	   
FROM fabricante INNER JOIN veiculo
ON fabricante.id = veiculo.id_fabricante
WHERE veiculo.preco <= 200.000


//2

SELECT fabricante.nome AS FABRICANTE,
	   veiculo.nome AS Modelo,
	   veiculo.preco AS Preço
	   
FROM fabricante INNER JOIN veiculo
ON fabricante.id = veiculo.id_fabricante
WHERE veiculo.preco <= 200.000


//3
SELECT fabricante.nome AS FABRICANTE,
	   veiculo.nome AS Modelo,
	   veiculo.preco AS Preço
	   
FROM fabricante INNER JOIN veiculo
ON fabricante.id = veiculo.id_fabricante
WHERE veiculo.preco <= (SELECT AVG(preco) FROM veiculo)



//4
SELECT fabricante.nome AS FABRICANTE,
	   veiculo.nome AS Modelo,
	   veiculo.preco AS Preço
	   
FROM fabricante INNER JOIN veiculo
ON fabricante.id = veiculo.id_fabricante
WHERE veiculo.preco >= (SELECT AVG(preco) FROM veiculo)