	-- select * from discipline;
	
	-- INSERT INTO discipline (id_discipline) VALUES (5);
	
	-- select * from discipline;
	
	-- INSERT INTO discipline (id_discipline, name) VALUES (2, 'PHP POO');
	
	-- select * from discipline;
	
	-- select * from book;
	
	-- INSERT INTO book (id_book, name, author, sinopse, id_discipline) 
	-- VALUES (1, 'JAVA POO', 'DANIEL', 'A book who talks about Java Poo', 1);
	
	/* INSERT INTO book (id_book, name, author, sinopse, id_discipline) 
	VALUES (2, 'JAVA POO', 'DANIEL', 'A book who talks about Java Poo', 1); */
	
	/* UPDATE book SET name = 'PHP'
	WHERE id_book = 2; */
	
	/* UPDATE book SET id_discipline = 3
	WHERE id_discipline = null; */
	
	-- UPDATE book SET sinopse = 'A book who talks about Java Poo'
	-- WHERE id_discipline = 1;

-- INSERT INTO book (id_book, name, author, sinopse, id_discipline) 
-- VALUES (5, 'JAVASCRIPT', 'DANIEL', 'A book who talks about javascript Poo', 5);

-- SELECT id_book, name, id_book
-- FROM book 
-- ORDER BY id_discipline ASC;	

-- DELETE FROM book 
-- WHERE id_book = 5;

-- DELETE FROM book 
-- WHERE id_book = 4

-- SELECT * FROM discipline;
-- SELECT * FROM book;

-- DELETE FROM discipline 
-- WHERE id_discipline = 5;

-- CREATE VIEW name_test AS SELECT author FROM book;

-- SELECT * FROM name_test;

-- CREATE index index_name ON book(name);

-- SELECT name FROM book;

-- CREATE TABLE games_catalog (
-- 	nameGame varchar(40),
-- 	plataform varchar(20),
-- 	price real
-- );

-- INSERT INTO games_catalog (namegame, plataform, price)
-- VALUES
--     ('Jogo A', 'PS5', 59.99),
--     ('Jogo B', 'Xbox Series X', 49.99),
--     ('Jogo C', 'Switch', 39.99),
--     ('Jogo D', 'PC', 29.99),
--     ('Jogo E', 'PS4', 39.99);

-- CREATE INDEX idx_games_catalog_full ON games_catalog USING btree (namegame, plataform, price);

SELECT * FROM games_catalog;
