INSERT INTO ciclista (nombrec, nacion, fecna) VALUES
('Jorge', 'Italia', '1990-12-14'),
('Alex', 'Rusia', '1995-10-28');

INSERT INTO equipo (nombree, nacion, direct) VALUES
('EquipoA', 'Ingraterra', 'direct1'),
('EquipoB', 'Italia', 'direct2');

INSERT INTO prueba (nombrep, agno, etapas, km, nombrec) VALUES
('Prueba1', 2000, 5, 10, 'Jorge'),
('Prueba2', 2005, 6, 12, 'Alex');

INSERT INTO pertenece (nombree, nombrec, inicio, fin) VALUES
('EquipoA', 'Jorge', 'inicio1', 'fin1'),
('EquipoB', 'Alex', 'inicio2', 'fin2');
