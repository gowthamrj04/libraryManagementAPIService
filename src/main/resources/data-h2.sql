DROP TABLE IF EXISTS libraries;
DROP TABLE IF EXISTS books;

INSERT INTO LIBRARY (library_id, library_name, library_place, book_ids) VALUES
  (1,'Library_One', 'ECity', '[1,2]'),
  (2,'Library_Two', 'Hebbal','[1,3]');


INSERT INTO BOOK (book_id, book_name, author) VALUES
  (1,'Java Language', 'Author1'),
  (2,'C Language', 'Author2'),
  (3,'Python Language', 'Author3');