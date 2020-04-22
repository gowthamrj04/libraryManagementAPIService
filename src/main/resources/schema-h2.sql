CREATE TABLE LIBRARY (
        library_id INT PRIMARY KEY,
        library_name VARCHAR(250) NOT NULL,
        library_place VARCHAR(250) NOT NULL,
        book_ids VARCHAR(250)
);

CREATE TABLE BOOK (
        book_id INT PRIMARY KEY,
        book_name VARCHAR(250) NOT NULL,
        author VARCHAR(250) NOT NULL
);