CREATE TABLE IF NOT EXISTS client(
	id SERIAL,
	fullname VARCHAR(100) NOT NULL,
	lastname VARCHAR(100) NOT NULL,
	address VARCHAR(100) NOT NULL,
	phone INT NOT NULL,
	PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS commander(
	id SERIAL,
	fullname VARCHAR(100) NOT NULL,
	plateau INT NOT NULL,
	PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS petition(
	id SERIAL,
	client_id INT NOT NULL,
	commander_id INT NOT NULL,
	petition_date DATE NOT NULL,
	total DECIMAL NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (client_id) REFERENCES client(id),
	FOREIGN KEY (commander_id) REFERENCES commander(id)
);
CREATE TABLE IF NOT EXISTS saucer(
  id SERIAL,
  name VARCHAR(100) NOT NULL,
  category VARCHAR(50) NOT NULL,
  price DECIMAL NOT NULL,
  preparation VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS detail(
	id SERIAL,
	petition_id INT NOT NULL,
	saucer_id INT NOT NULL,
	quantity INT NOT NULL,
	price DECIMAL NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (petition_id) REFERENCES petition(id),
	FOREIGN KEY (saucer_id) REFERENCES saucer(id)
);
CREATE TABLE IF NOT EXISTS proteins (
  id SERIAL,
  name VARCHAR(100) NOT NULL,
  quantity VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS saucer_proteins (
  saucer_id SERIAL,
  proteins_id SERIAL,
  PRIMARY KEY (saucer_id, proteins_id),
  FOREIGN KEY (saucer_id) REFERENCES saucer (id),
  FOREIGN KEY (proteins_id) REFERENCES proteins (id)
);
