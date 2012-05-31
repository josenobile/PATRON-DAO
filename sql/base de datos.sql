--
-- PostgreSQL database dump
--

-- Dumped from database version 9.0.1
-- Dumped by pg_dump version 9.0.1
-- Started on 2010-10-11 16:31:40

SET statement_timeout = 0;
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

--
-- TOC entry 310 (class 2612 OID 11574)
-- Name: plpgsql; Type: PROCEDURAL LANGUAGE; Schema: -; Owner: postgres
--

CREATE OR REPLACE PROCEDURAL LANGUAGE plpgsql;


ALTER PROCEDURAL LANGUAGE plpgsql OWNER TO postgres;

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 1503 (class 1259 OID 16399)
-- Dependencies: 5
-- Name: estudiante; Type: TABLE; Schema: public; Owner: oswaldo; Tablespace: 
--

CREATE TABLE estudiante (
    codigo character varying(20) NOT NULL,
    nombre character varying(50) NOT NULL,
    sexo character varying(12),
    codigo_programa character varying NOT NULL
);


ALTER TABLE public.estudiante OWNER TO postgres;

--
-- TOC entry 1502 (class 1259 OID 16394)
-- Dependencies: 5
-- Name: programa; Type: TABLE; Schema: public; Owner: oswaldo; Tablespace: 
--

CREATE TABLE programa (
    codigo character varying(12) NOT NULL,
    nombre character varying(50) NOT NULL,
    nivel character varying(50),
    num_creditos integer
);


ALTER TABLE public.programa OWNER TO postgres;

--
-- TOC entry 1787 (class 0 OID 16399)
-- Dependencies: 1503
-- Data for Name: estudiante; Type: TABLE DATA; Schema: public; Owner: oswaldo
--

COPY estudiante (codigo, nombre, sexo, codigo_programa) FROM stdin;
\.


--
-- TOC entry 1786 (class 0 OID 16394)
-- Dependencies: 1502
-- Data for Name: programa; Type: TABLE DATA; Schema: public; Owner: oswaldo
--

COPY programa (codigo, nombre, nivel, num_creditos) FROM stdin;
1	Ingeniería de sistemas	Pregrado	170
2	Ingeniería Electrónica	Pregrado	170
\.


--
-- TOC entry 1782 (class 2606 OID 16398)
-- Dependencies: 1502 1502
-- Name: codigo_pk; Type: CONSTRAINT; Schema: public; Owner: oswaldo; Tablespace: 
--

ALTER TABLE ONLY programa
    ADD CONSTRAINT codigo_pk PRIMARY KEY (codigo);


--
-- TOC entry 1784 (class 2606 OID 16403)
-- Dependencies: 1503 1503
-- Name: estudiante_pk; Type: CONSTRAINT; Schema: public; Owner: oswaldo; Tablespace: 
--

ALTER TABLE ONLY estudiante
    ADD CONSTRAINT estudiante_pk PRIMARY KEY (codigo);


--
-- TOC entry 1785 (class 2606 OID 16407)
-- Dependencies: 1503 1502 1781
-- Name: programa_estudiante_fk; Type: FK CONSTRAINT; Schema: public; Owner: oswaldo
--

ALTER TABLE ONLY estudiante
    ADD CONSTRAINT programa_estudiante_fk FOREIGN KEY (codigo_programa) REFERENCES programa(codigo);


--
-- TOC entry 1792 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2010-10-11 16:31:40

--
-- PostgreSQL database dump complete
--

