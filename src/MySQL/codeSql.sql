DROP DATABASE IF EXISTS humanFriends;
CREATE DATABASE IF NOT EXISTS humanFriends;
USE humanFriends;

DROP TABLE cat;
CREATE TABLE cat (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
  date_of_birth DATE,
    commands TEXT
);

DROP TABLE dog;
CREATE TABLE dog (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
  date_of_birth DATE,
    commands TEXT
);

DROP TABLE hamster;
CREATE TABLE hamster (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
  date_of_birth DATE,
    commands TEXT
);

DROP TABLE horse;
CREATE TABLE horse (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
  date_of_birth DATE,
    commands TEXT
);

DROP TABLE camel;
CREATE TABLE camel (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
  date_of_birth DATE,
    commands TEXT
);

DROP TABLE donkey;
CREATE TABLE donkey (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
  date_of_birth DATE,
    commands TEXT
);

INSERT INTO cat (animal_name, date_of_birth, commands) VALUES 
	('Барсик', '2022-01-01', 'Кушать'),
	('Муська', '2023-05-17', 'Кушать, Кыш'),
	('Грызлик', '2015-11-15', 'Кс-Кс, Кыш');
  
SELECT * FROM cat;

INSERT INTO dog (animal_name, date_of_birth, commands) VALUES 
	('Барбос', '2017-05-17','Апорт, Сидеть'),
	('Рекс', '2023-11-15','Апорт, Лапу'),
	('Жуля', '2020-01-01','Апорт, Сидеть, Место');

SELECT * FROM dog;

INSERT INTO hamster (animal_name, date_of_birth, commands) VALUES 
	('Первый', '2022-05-17','Кушать, Сидеть'),
	('Второй', '2022-11-15','Кушать, Сидеть, Беги'),
	('Последний', '2023-01-01','Беги, Сидеть');

SELECT * FROM hamster;

INSERT INTO horse (animal_name, date_of_birth, commands) VALUES 
	('Алмаз', '2022-05-17','Галоп, Тпру'),
	('Кобыла', '2015-11-15','Барьер, Но'),
	('Ветерок', '2017-01-01','Галоп, Вкусняшка');

SELECT * FROM horse;

INSERT INTO camel (animal_name, date_of_birth, commands) VALUES 
	('Горбатый', '2023-05-17','Хоп, Чак'),
	('Светлый', '2015-11-15','Чак, Ап'),
	('Лайнер', '2021-01-01','Хоп, Ап');
  
  SELECT * FROM camel;
  
INSERT INTO donkey (animal_name, date_of_birth, commands) VALUES 
	('Осел', '2022-05-17','Куда, Тащи'),
	('Осел2', '2015-11-15','Тащи, Иди'),
	('Осел3', '2023-01-01','Иди, Куда');

SELECT * FROM donkey;

TRUNCATE camel;

SELECT * FROM camel;

INSERT INTO horse (animal_name, date_of_birth, commands)
SELECT animal_name, date_of_birth, commands
FROM donkey;

DROP TABLE donkey;
RENAME TABLE horse TO horse_donkey;

SELECT * FROM horse_donkey;

CREATE TABLE young_animal (
	id INT PRIMARY KEY AUTO_INCREMENT,
		animal_name CHAR(30),
    date_of_birth DATE,
    commands TEXT,
    age TEXT
);
SELECT * FROM young_animal;

DELIMITER $$
CREATE FUNCTION age_animal (date_b DATE)
RETURNS TEXT
DETERMINISTIC
BEGIN
    DECLARE res TEXT DEFAULT '';
	SET res = CONCAT(
            TIMESTAMPDIFF(YEAR, date_b, CURDATE()),
            ' years ',
            TIMESTAMPDIFF(MONTH, date_b, CURDATE()) % 12,
            ' month'
        );
	RETURN res;
END $$
DELIMITER ;


INSERT INTO young_animal (animal_name, date_of_birth, commands, age)
SELECT animal_name, date_of_birth, commands, age_animal(date_of_birth)
FROM cat
WHERE TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) BETWEEN 1 AND 3
UNION ALL
SELECT animal_name, date_of_birth, commands, age_animal(date_of_birth)
FROM dog
WHERE TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) BETWEEN 1 AND 3
UNION ALL
SELECT animal_name, date_of_birth, commands, age_animal(date_of_birth)
FROM hamster
WHERE TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) BETWEEN 1 AND 3
UNION ALL
SELECT animal_name, date_of_birth, commands, age_animal(date_of_birth)
FROM horse_donkey
WHERE TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) BETWEEN 1 AND 3;

SELECT * FROM young_animal;

DROP TABLE animals;
CREATE TABLE animals (
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_name CHAR(30),
    date_of_birth DATE,
		commands TEXT,
    age TEXT,
    animal_type ENUM('cat','dog','hamster', 'horse_donkey', 'young_animals') NOT NULL
);
SELECT * FROM animals;

INSERT INTO animals (animal_name, date_of_birth, commands, age, animal_type)
SELECT animal_name, date_of_birth, commands, age_animal(date_of_birth), 'cat'
FROM cat;

INSERT INTO animals (animal_name, date_of_birth, commands, age, animal_type)
SELECT animal_name, date_of_birth, commands, age_animal(date_of_birth), 'dog'
FROM dog;

INSERT INTO animals (animal_name, date_of_birth, commands, age, animal_type)
SELECT animal_name, date_of_birth, commands, age_animal(date_of_birth), 'hamster'
FROM hamster;

INSERT INTO animals (animal_name, date_of_birth, commands, age, animal_type)
SELECT animal_name, date_of_birth, commands, age_animal(date_of_birth), 'horse_donkey'
FROM horse_donkey;

INSERT INTO animals (animal_name, date_of_birth, commands, age, animal_type)
SELECT animal_name, date_of_birth, commands, age_animal(date_of_birth), 'young_animals'
FROM young_animal;

SELECT * FROM animals;