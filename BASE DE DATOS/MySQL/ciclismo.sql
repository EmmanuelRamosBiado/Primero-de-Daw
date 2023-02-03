CREATE DATABASE IF NOT EXISTS ciclismo;

CREATE USER IF NOT EXISTS userciclismo IDENTIFIED BY 'userciclismo';
CREATE USER IF NOT EXISTS operaciclismo IDENTIFIED BY 'operaciclismo';

GRANT ALL PRIVILEGES ON ciclismo.* TO userciclismo;
GRANT SELECT ON ciclismo.* TO operaciclismo;

FLUSH PRIVILEGES;

USE ciclismo;

CREATE TABLE IF NOT EXISTS ciclista
(
nombrec VARCHAR(50) PRIMARY KEY,
nacion VARCHAR(50),
fecna DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS equipo
(
nombree VARCHAR(50) PRIMARY KEY,
nacion VARCHAR(50),
direct VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS prueba
(
nombrep VARCHAR(50),
agno INTEGER,
etapas INTEGER NOT NULL,
km INTEGER NOT NULL,
nombrec VARCHAR(50) NOT NULL,
CONSTRAINT pk_prueba
PRIMARY KEY(nombrep, agno),
CONSTRAINT ck_etapas
CHECK(etapas>0),
CONSTRAINT ck_km
CHECK(km>0),
CONSTRAINT fk_prueba_ciclista
FOREIGN KEY(nombrec)
REFERENCES ciclista(nombrec)
ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS pertenece
(
nombree VARCHAR(50),
nombrec VARCHAR(50),
inicio VARCHAR(50) NOT NULL,
fin VARCHAR(50) NOT NULL,
CONSTRAINT pk_pertenece
PRIMARY KEY(nombree, nombrec),
CONSTRAINT fk_pertenece_equipo
FOREIGN KEY(nombree)
REFERENCES equipo(nombree)
ON UPDATE CASCADE,
CONSTRAINT fk_pertenece_ciclista
FOREIGN KEY(nombrec)
REFERENCES ciclista(nombrec)
ON UPDATE CASCADE
);
