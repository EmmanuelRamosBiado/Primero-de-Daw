CREATE DATABASE banco;
USE banco;

CREATE TABLE sucursal
(
cod_sucursal VARCHAR(10) PRIMARY KEY,
calle VARCHAR(50) NOT NULL,
numero INTEGER NOT NULL,
poblacion VARCHAR(50) NOT NULL,
telefono VARCHAR(12) NOT NULL,
mail VARCHAR(50) NOT NULL,
responsable VARCHAR(50) NOT NULL
);

CREATE TABLE tipo_cuenta
(
tipo VARCHAR(50) PRIMARY KEY,
observaciones VARCHAR(200)
);

CREATE TABLE cliente
(
dni VARCHAR(12) PRIMARY KEY,
nombre VARCHAR(25) NOT NULL,
apellido1 VARCHAR(25) NOT NULL,
apellido2 VARCHAR(25) NOT NULL,
fecha_nac DATE NOT NULL,
telefono VARCHAR(12) NOT NULL,
mail VARCHAR(50) NOT NULL
);

CREATE TABLE cuenta
(
cod_cuenta VARCHAR(10) PRIMARY KEY,
fecha_apertura DATE NOT NULL,
saldo DECIMAL(10,2) NOT NULL,
cod_sucursal VARCHAR(10) NOT NULL,
tipo VARCHAR(50),
CONSTRAINT ck_saldo
CHECK (saldo>0),
CONSTRAINT fk_cuenta_sucursal
FOREIGN KEY (cod_sucursal)
REFERENCES sucursal(cod_sucursal),
CONSTRAINT fk_cuenta_tipo_cuenta
FOREIGN KEY (tipo)
REFERENCES tipo_cuenta(tipo)
);

CREATE TABLE cuenta_cliente
(
cod_cuenta VARCHAR(10),
dni VARCHAR(12),
privilegio VARCHAR(50) NOT NULL,
CONSTRAINT pk_cuenta_cliente
PRIMARY KEY (cod_cuenta, dni),
CONSTRAINT fk_cuenta_cliente_cuenta
FOREIGN KEY (cod_cuenta)
REFERENCES cuenta(cod_cuenta),
CONSTRAINT fk_cuenta_cliente_cliente
FOREIGN KEY (dni)
REFERENCES cliente(dni)
);
