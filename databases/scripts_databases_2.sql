-- CREATE SEQUENCE clients_id_seq;

-- CREATE TABLE clients (
-- 	ID SERIAL PRIMARY KEY,
--     NAME VARCHAR(16) NOT NULL,
--     CPF VARCHAR(11) NOT NULL,
--     EMAIL VARCHAR(100) NOT NULL
-- )

-- CREATE SEQUENCE book_id_seq;
-- ALTER SEQUENCE book_id_seq OWNED BY book.id_book;

-- SELECT * FROM book;

-- INSERT INTO clients(name, cpf, email)
-- VALUES
-- 	('Daniel','12484985903','danielteste@gmail.com'),
-- 	('Renato','12484985883','renato@gmail.com')

-- CREATE SEQUENCE discipline_id_seq;
-- ALTER SEQUENCE discipline_id_seq OWNED BY book.id_discipline;

-- SELECT * FROM book;

-- ALTER TABLE book
-- ALTER COLUMN id_discipline SET DEFAULT nextval('discipline_id_seq');

-- INSERT INTO book (name, author, sinopse) 
-- VALUES('PYTHON','DANIEL','A book who talks about Python')

-- SELECT * FROM information_schema.sequences WHERE sequence_name = 'discipline_id_seq';

-- INSERT INTO book (id_book, name, author, sinopse, id_discipline)
-- VALUES (nextval('book_id_seq'), 'PYTHON', 'DANIEL', 'A book who talks about PYTHON', nextval('discipline_id_seq'));

-- ALTER TABLE Book
-- ALTER COLUMN id_book SET DEFAULT nextval('book_id_seq');

-- ALTER TABLE discipline
-- ALTER COLUMN id_discipline SET DEFAULT nextval('discipline_id_seq');

-- ALTER TABLE Book
-- ADD CONSTRAINT fk_id_discipline
-- FOREIGN KEY (id_discipline) REFERENCES discipline(id_discipline);

-- INSERT INTO Book (name, author, sinopse, id_discipline)
-- VALUES ('PYTHON', 'DANIEL', 'A book who talks about PYTHON', 1);

SELECT * FROM book

INSERT INTO Book (name, author, sinopse)
-- VALUES ('PYTHON', 'DANIEL', 'A book who talks about PYTHON');