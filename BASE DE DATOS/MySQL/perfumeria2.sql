CREATE DATABASE perfumeria2;
USE perfumeria2;

CREATE TABLE laboratorio
(
laboratorio VARCHAR(50) PRIMARY KEY,
calle VARCHAR(50) NOT NULL,
numero INTEGER NOT NULL,
poblacion VARCHAR(50) NOT NULL,
telefono VARCHAR(9) NOT NULL,
mail VARCHAR(50) NOT NULL,
responsable VARCHAR(50) NOT NULL
);

CREATE TABLE esencia
(
esencia VARCHAR(50) PRIMARY KEY,
precio DECIMAL(8,2) NOT NULL,
CONSTRAINT ck_precio
CHECK(PRECIO>0)
);

CREATE TABLE perfume
(
perfume VARCHAR(50) PRIMARY KEY,
envase VARCHAR(50) NOT NULL,
tamagno INTEGER NOT NULL,
laboratorio VARCHAR(50) NOT NULL,
CONSTRAINT ck_tamagno
CHECK(tamagno>0),
CONSTRAINT fk_perfume_laboratorio
FOREIGN KEY(laboratorio)
REFERENCES laboratorio(laboratorio)
);

CREATE TABLE contiene
(
perfume VARCHAR(50),
esencia VARCHAR(50),
proporcion DECIMAL(5,2) NOT NULL,
CONSTRAINT pk_contiene
PRIMARY KEY(perfume, esencia),
CONSTRAINT ck_proporcion
CHECK(proporcion>0 and proporcion<=100),
CONSTRAINT fk_contiene_perfume
FOREIGN KEY(perfume)
REFERRENCES perfume(perfume),
CONSTRAINT fk_contiene_esencia
FOREIGN KEY(esencia)
REFERRENCES esencia(esencia)
);
