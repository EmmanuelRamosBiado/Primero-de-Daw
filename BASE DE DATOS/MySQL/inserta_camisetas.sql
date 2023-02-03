INSERT INTO categoria VALUES
(01, 'Manga larga'),
(02, 'Manga corta'),
(03, 'Tirantes'),
(04, 'Camisa');

INSERT INTO usuario VALUES
(1111, 'Luis', 'Sanz', 'luissanz@gmail.com', 'luis123', 'user'),
(2222, 'Julia', 'Mendoza', 'juliamendoza@gmail.com', 'julia123', 'user'),
(3333, 'Ana', 'Cedeño', 'anacedeño@gmail.com', 'ana123', 'user'),
(4444, 'Jaime', 'Padilla', 'jaimepadilla@gmail.com', 'jaime123', 'user');

INSERT INTO producto VALUES
(012, 01, 'Camiseta negra', NULL, 28.99, 1000, '2022-01-12'),
(345, 02, 'Camiseta roja', NULL, 30.99, 1400, '2022-01-30'),
(678, 03, 'Camiseta de tirantes', NULL, 27.99, 1234, '2022-01-14'),
(901, 04, 'Camisa blanca', NULL, 44.99, 9999, '2022-01-24');

INSERT INTO pedido VALUES
(55555, 1111, 'Avenida de America', 'Madrid', 'Madrid', 90.99, 'En reparto', '2022-02-01', '22:31:12'),
(66666, 2222, 'Calle Leganitos', 'Madrid', 'Madrid', 65.50, 'En proceso', '2022-02-02', '19:12:56'),
(77777, 3333, 'Calle Serrano', 'Madrid', 'Madrid', 30.99, 'En proceso', '2022-02-04', '04:10:39'),
(88888, 4444, 'Calle Preciados', 'Madrid', 'Madrid', 200.99, 'En reparto', '2022-02-06', '08:30:00');

INSERT INTO contiene VALUES
(012, 55555, 3),
(345, 66666, 2),
(678, 77777, 1),
(901, 88888, 4);