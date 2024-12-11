
=====================================================
             -- INSTRUÇÕES --


-- Altere o banco de dados de veículos para aceitar 
-- o soft delete, e fazer o log de quando foi deletado
-- em TODAS AS TABELAS.

-- (ativo, deletadoem)

=====================================================

ALTER TABLE cliente
ADD COLUMN ATIVO BINARY

ALTER TABLE veiculo
ADD COLUMN ATIVO BINARY
=
ALTER TABLE cliente
ADD COLUMN DELETADO_EM DATE

ALTER TABLE veiculo
ADD COLUMN DELETADO_EM DATE