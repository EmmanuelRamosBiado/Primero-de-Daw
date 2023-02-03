CREATE DATABASE perfumeria;
USE perfumeria;

CREATE USER IF NOT EXISTS PERFUME IDENTIFIED BY 'perfume';

GRANT ALL PRIVILEGES ON perfumeria.* TO perfume;
FLUSH PRIVILEGES;


CREATE TABLE IF NOT EXISTS laboratorio
(
laboratorio VARCHAR(50) PRIMARY KEY,
calle VARCHAR(50) NOT NULL,
numero INTEGER NOT NULL,
telefono VARCHAR(50) NOT NULL,
mail VARCHAR(50) NOT NULL,
responsable VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS esencia
(
esencia VARCHAR(50) PRIMARY KEY,
precio DECIMAL(7,2) NOT NULL,
CONSTRAINT ck_precio
CHECK(PRECIO>0)
);

CREATE TABLE IF NOT EXISTS perfume
(
perfume VARCHAR(50) PRIMARY KEY,
envase VARCHAR(50) NOT NULL,
tamagno DECIMAL(5,2) NOT NULL,
CONSTRAINT ck_tamagno
CHECK(tamagno>0),
laboratorio VARCHAR(50) NOT NULL,
CONSTRAINT fk_perfume_laboratorio
FOREIGN KEY(laboratorio)
REFERENCES laboratorio(laboratorio)
);

CREATE TABLE IF NOT EXISTS contiene
(
perfume VARCHAR(50),
esencia VARCHAR(50),
proporcion DECIMAL(5,2) NOT NULL,
CONSTRAINT pk_contiene
PRIMARY KEY(perfume, esencia),
CONSTRAINT ck_proporcion
CHECK(proporcion>0),
CONSTRAINT fk_contiene_perfume
FOREIGN KEY(perfume)
REFERENCES perfume(perfume),
CONSTRAINT fk_contiene_esencia
FOREIGN KEY(esencia)
REFERENCES esencia(esencia)
);
