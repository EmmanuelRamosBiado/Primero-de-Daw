CREATE DATABASE guerra;
USE guerra;

CREATE TABLE guerra
(
id_guerra INTEGER PRIMARY KEY,
guerra VARCHAR(50) NOT NULL,
a_inicio INTEGER NOT NULL,
a_fin INTEGER NOT NULL,
CONSTRAINT ck_a_inicio
CHECK (a_inicio>0),
CONSTRAINT ck_a_fin
CHECK (a_fin>0),
CONSTRAINT ck_a_inicio_a_fin
CHECK (a_fin>a_inicio)
);

CREATE TABLE pais
(
id_pais INTEGER PRIMARY KEY,
nombre VARCHAR(50) NOT NULL
);

CREATE TABLE bando
(
id_bando INTEGER PRIMARY KEY,
bando VARCHAR(50) NOT NULL,
ganador VARCHAR(2) NOT NULL,
id_guerra INTEGER NOT NULL,
CONSTRAINT ck_ganador
CHECK (ganador='SI' or ganador='NO'),
CONSTRAINT fk_bando_guerra
FOREIGN KEY (id_guerra)
REFERENCES guerra(id_guerra)
ON UPDATE CASCADE
);

CREATE TABLE participa
(
id_bando INTEGER,
id_pais INTEGER,
a_entrada INTEGER NOT NULL,
a_salida INTEGER NOT NULL,
CONSTRAINT pk_participa
PRIMARY KEY (id_bando, id_pais),
CONSTRAINT fk_participa_bando
FOREIGN KEY (id_bando)
REFERENCES bando(id_bando),
CONSTRAINT fk_participa_pais
FOREIGN KEY (id_pais)
REFERENCES pais(id_pais),
CONSTRAINT ck_a_entrada
CHECK (a_entrada>0),
CONSTRAINT ck_a_salida
CHECK (a_salida>0),
CONSTRAINT ck_a_salida_a_entrada
CHECK (a_salida>a_entrada)
);
