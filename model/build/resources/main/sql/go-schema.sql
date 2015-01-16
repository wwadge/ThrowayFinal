\set ON_ERROR_STOP true;
SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
--
CREATE SCHEMA godb;

ALTER SCHEMA godb OWNER TO postgres;

ALTER ROLE postgres set search_path=godb, pg_catalog;

SET search_path = godb, pg_catalog;


SET default_with_oids = false;


--
-- Name: account_holder; Type: TABLE; Schema: godb; Owner: -
--

CREATE TABLE account_holder (
    account_holder_id bigint NOT NULL,
    email_address text,
    CONSTRAINT account_holder_pkey PRIMARY KEY (account_holder_id)
);



CREATE SEQUENCE account_holder_account_holder_id_seq
START WITH 50
INCREMENT BY 50
NO MINVALUE
NO MAXVALUE
CACHE 1;


ALTER SEQUENCE account_holder_account_holder_id_seq OWNED BY account_holder.account_holder_id;
