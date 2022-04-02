-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE IF NOT EXISTS public.cliente
(
    cpf character varying,
    nome character varying,
    fone character varying,
    endereco character varying,
    PRIMARY KEY (cpf)
);

CREATE TABLE IF NOT EXISTS public.produto
(
    codigo bigint,
    nome character varying,
    preco double precision,
    PRIMARY KEY (codigo)
);
END;