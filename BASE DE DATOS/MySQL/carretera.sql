CREATE DATABASE IF NOT EXISTS carretera;

CREATE USER IF NOT EXISTS carretera IDENTIFIED BY 'carretera';

USE carretera;

CREATE TABLE IF NOT EXISTS carretera
(
carretera VARCHAR(20) PRIMARY KEY,
categoria VARCHAR(1) NOT NULL,
origen VARCHAR(50) NOT NULL,
fin VARCHAR(50) NOT NULL,
tipo_A VARCHAR(50),
tipo_B VARCHAR(50),
tipo_C VARCHAR(50),
CONSTRAINT ck_categoria
CHECK ((categoria='A' AND tipo_A IS NOT NULL AND tipo_B IS NULL AND tipo_C IS NULL) 
OR (categoria='B' AND tipo_B IS NOT NULL AND tipo_A IS NULL AND tipo_C IS NULL) 
OR (categoria='C' AND tipo_C IS NOT NULL AND tipo_A IS NULL AND tipo_B IS NULL))
);

CREATE TABLE IF NOT EXISTS provincia
(
provincia VARCHAR(50) PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS termino
(
provincia VARCHAR(50),
termino VARCHAR(50),
CONSTRAINT pk_termino
PRIMARY KEY (provincia, termino),
CONSTRAINT fk_termino_provincia
FOREIGN KEY (provincia)
REFERENCES provincia(provincia)
ON UPDATE CASCADE
ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS tramo
(
carretera VARCHAR(20),
tramo INTEGER,
longitud DECIMAL(9,3),
CONSTRAINT pk_tramo
PRIMARY KEY (carretera, tramo),
CONSTRAINT fk_tramo_carretera
FOREIGN KEY (carretera)
REFERENCES carretera(carretera)
ON UPDATE CASCADE
ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS pasa_por
(
carretera VARCHAR(20),
tramo INTEGER,
provincia VARCHAR(50),
termino VARCHAR(50),
km_e DECIMAL(9,3) NOT NULL,
km_s DECIMAL(9,3) NOT NULL,
CONSTRAINT pk_pasa_por
PRIMARY KEY (carretera, tramo, provincia, termino),
CONSTRAINT fk_pasa_por_tramo
FOREIGN KEY (carretera, tramo)
REFERENCES tramo(carretera, tramo),
CONSTRAINT fk_pasa_por_termino
FOREIGN KEY (provincia, termino)
REFERENCES termino(provincia, termino)
);

INSERT INTO carretera VALUES
('carretera 1', 'A', 'origen 1', 'fin 1', 'Autopista', NULL, NULL),
('carretera 2', 'A', 'origen 2', 'fin 2', 'Autovía', NULL, NULL),
('carretera 3', 'B', 'origen 3', 'fin 3', NULL, 'Con arcén', NULL),
('carretera 4', 'B', 'origen 4', 'fin 4', NULL, 'Sin arcén', NULL),
('carretera 5', 'C', 'origen 5', 'fin 5', NULL, NULL, 'Comarcales'),
('carretera 6', 'C', 'origen 6', 'fin 6', NULL, NULL, 'Otras');

INSERT INTO provincia VALUES
('Madrid'),
('Murcia'),
('Valencia'),
('Barcelona'),
('Sevilla'),
('Zaragoza');

INSERT INTO termino VALUES
('Madrid', 'termino 1'),
('Madrid', 'termino 2'),
('Murcia', 'termino 3'),
('Murcia', 'termino 4'),
('Valencia', 'termino 5'),
('Valencia', 'termino 6'),
('Barcelona', 'termino 7'),
('Barcelona', 'termino 8'),
('Sevilla', 'termino 9'),
('Sevilla', 'termino 10'),
('Zaragoza', 'termino 11'),
('Zaragoza', 'termino 12');

INSERT INTO tramo VALUES
('carretera 1', 1, 1000),
('carretera 1', 2, 2000),
('carretera 2', 3, 3000),
('carretera 2', 4, 4000),
('carretera 3', 5, 5000),
('carretera 3', 6, 6000),
('carretera 4', 7, 7000),
('carretera 4', 8, 8000),
('carretera 5', 9, 9000),
('carretera 5', 10, 1000),
('carretera 6', 11, 2000),
('carretera 6', 12, 3000);

INSERT INTO pasa_por VALUES
('carretera 1', 1, 'Madrid', 'termino 1', 12, 134),
('carretera 1', 2, 'Madrid', 'termino 2', 56, 234),
('carretera 2', 3, 'Murcia', 'termino 3', 11, 111),
('carretera 2', 4, 'Murcia', 'termino 4', 34, 456),
('carretera 3', 5, 'Valencia', 'termino 5', 78, 675),
('carretera 3', 6, 'Valencia', 'termino 6', 99, 667),
('carretera 4', 7, 'Barcelona', 'termino 7', 45, 129),
('carretera 4', 8, 'Barcelona', 'termino 8', 66, 916),
('carretera 5', 9, 'Sevilla', 'termino 9', 71, 213),
('carretera 5', 10, 'Sevilla', 'termino 10', 23, 116),
('carretera 6', 11, 'Zaragoza', 'termino 11', 39, 447),
('carretera 6', 12, 'Zaragoza', 'termino 12', 19, 109);
