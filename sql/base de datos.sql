CREATE TABLE estudiante (
    codigo character varying(20) NOT NULL,
    nombre character varying(50) NOT NULL,
    sexo character varying(12),
    codigo_programa character varying NOT NULL
);



CREATE TABLE programa (
    codigo character varying(12) NOT NULL,
    nombre character varying(50) NOT NULL,
    nivel character varying(50),
    num_creditos integer
);


ALTER TABLE  programa
    ADD CONSTRAINT codigo_pk PRIMARY KEY (codigo);


ALTER TABLE  estudiante
    ADD CONSTRAINT estudiante_pk PRIMARY KEY (codigo);

ALTER TABLE  estudiante
    ADD CONSTRAINT programa_estudiante_fk FOREIGN KEY (codigo_programa) REFERENCES programa(codigo);


INSERT INTO "public".programa (codigo, nombre, nivel, num_creditos) 
	VALUES ('3743', 'Ingenieria de Sistemas', 'Pregrado', 160);

INSERT INTO "public".programa (codigo, nombre, nivel, num_creditos) 
	VALUES ('2711', 'Tecnologia de Sistemas', 'Pregrado', 100);