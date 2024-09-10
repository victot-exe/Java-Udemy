alter table empresas modify cnpj varchar(14);

insert into empresas
    (nome, cnpj)
values
    ('Bradesco', 13243142000121),
    ('Vale', 89940148000110),
    ('Cielo', 81364260000148);


desc empresas;
desc cidades;
select * from empresas;
select * from cidades;

insert into empresas_unidades
    (empresa_id, cidade_id, sede)
values
    (1, 4, 1),
    (1, 1, 0),
    (2, 4, 0),
    (2, 1, 1);