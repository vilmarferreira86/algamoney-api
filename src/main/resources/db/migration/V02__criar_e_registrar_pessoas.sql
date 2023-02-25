CREATE TABLE pessoa (
    codigo BIGINT(20) Primary Key AUTO_INCREMENT,
    nome varchar(100) not null,
    ativo boolean,
    logradouro varchar(100) not null,
    numero varchar(10),
    bairro varchar(30) not null, 
    cep varchar(10),
    cidade varchar(50),
    estado varchar(2)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) 
VALUES ('vilmar', true, 'R. Francisco Martiniano Barbosa', 637, 'Sapiranga', '60833375', 'Fortaleza', 'CE');
INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado) 
values ('joana', true, 'R. Francisco Martiniano Barbosa', 637, 'Sapiranga', '60833375', 'Fortaleza', 'CE');
