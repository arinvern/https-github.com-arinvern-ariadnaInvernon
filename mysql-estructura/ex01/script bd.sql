
create database base_dades;
use base_dades;
create table Clients(
idClients int not null AUTO_INCREMENT ,
Nom varchar(45) not null,
Telefon varchar(15) not null,
Correu_electronic varchar (45) not null,
Data_registre date not null,
Direccio_carrer varchar(45) not null,
Direccio_numero varchar (5) not null,
Direccio_pis varchar (5),
Direccio_porta varchar (5),
Direccio_ciutat varchar (45) not null,
Direccio_codiPostal char(5) not null,
Direccio_pais varchar(45) not null,
Referit_per int,
PRIMARY KEY (idClients),
FOREIGN KEY (Referit_per) REFERENCES Clients(idCLients)
);

create table Proveidors(
idProveidor int not null AUTO_INCREMENT,
Nom varchar(45) not null,
Telefon varchar(15) not null,
Fax varchar (15) not null,
Direccio_carrer varchar(45) not null,
Direccio_numero varchar (5) not null,
Direccio_pis varchar (5),
Direccio_porta varchar (5),
Direccio_ciutat varchar (45) not null,
Direccio_codiPostal char(5) not null,
Direccio_pais varchar(45) not null,
NIF char(9),
PRIMARY KEY (idProveidor)
);

create table Marca(
idMarca int not null AUTO_INCREMENT,
Nom_marca varchar (45) not null,
idProveidor int  ,
PRIMARY KEY (idMarca),
FOREIGN KEY (idProveidor) REFERENCES Proveidors(idProveidor)
);

create table Venedors(
idVenedor int not null AUTO_INCREMENT,
Nom_venedor varchar (45) not null,
PRIMARY KEY (idVenedor)
);

create table Model(
idModel int not null AUTO_INCREMENT,
idMarca int ,
Tipus_montura ENUM('flotant', 'pasta', 'metalica') not null,
Color_montura varchar (45) not null,
Color_vidre varchar (45) not null,
Preu float not null,
PRIMARY KEY (idModel),
FOREIGN KEY (idMarca) REFERENCES Marca(idMarca)
);

create table Ulleres(
idUlleres int not null AUTO_INCREMENT,
idModel int,
Graduacio_dret float not null,
Graduacio_esquerra float not null,
PRIMARY KEY (idUlleres),
FOREIGN KEY (idModel) REFERENCES Model(idModel)
);

create table Factures(
idFactures int not null AUTO_INCREMENT,
idClients int not null,
idVenedor int not null,
idUlleres int not null,
data_factura date not null,
PRIMARY KEY (idFactures),
FOREIGN KEY (idClients) REFERENCES Clients(idClients),
FOREIGN KEY (idVenedor) REFERENCES Venedors(idVenedor),
FOREIGN KEY (idUlleres) REFERENCES Ulleres(idUlleres)
);

INSERT INTO Clients (Nom, Telefon, Correu_electronic, Data_registre, Direccio_carrer,Direccio_numero,Direccio_pis,Direccio_porta,Direccio_ciutat,Direccio_codiPostal,Direccio_pais,Referit_per) 
VALUES 

('Ariadna', '612345678', 'ariadna123@gmail.com', '2020-05-05', 'Carrer de prova', '15', '3', '2','Barcelona', '08040', 'Espanya', null ), 
('Leopoldo', '612462568', 'ciliff0@netscape.com', '2021-10-09', 'Carrer blablabla', '25', '6', '1','Cerdanyola', '08580', 'Espanya', null ),
('Pilar', '614986248', 'apenrith2@google.nl', '2018-01-09', 'Carrer Diputacio', '101', '1', '3','Barcelona', '08110', 'Espanya', 1 ),
('Humberto', '66654810', 'ddomingues9@foxnews.com', '2018-08-02', 'Consell de Cent', '99', '5', '1','Barcelona', '08010', 'Espanya', 2 ),
('Menna', '620099548', 'MennaGuillenMadrid@superrito.com', '2017-11-05', 'Passeig Joan', '25', '7', 'B','Abad de Arriba', '06107', 'Espanya', null ),
('Floriana', '718040718', 'FlorianaAguilarTorrez@gustr.com', '2015-12-10', 'Avenida Adorno', '8', '3', '1','Carreón del Barco', '64305', 'Espanya', null ),
('Pompeyo', '612362915', 'PompeyoMateoTorres@gustr.com', '2023-01-01', 'Passeig Aragon', '58', '11', 'A','Barcelona', '01048', 'Espanya', 1 ),
('Nerea', '931551388', 'nerea57@example.com', '2017-05-12', 'Carrer Olivarez', '8', '3', '3','Barcelona', '60548', 'Espanya', 4 ),
('Noa', '690743870', 'marrero.pau@example.net', '2016-02-03', 'Passeig Aguilera', '525', '8', 'D','Barcelona', '08110', 'Espanya', null ),
('Antonio', '64054810', 'aespinoza@example.org', '2021-04-14', 'Plaça Berta', '44', '7', null, 'Carrasquillo Baja', '20262', 'Espanya', 4 );


SELECT DATE_FORMAT(Data_registre, '%d-%m-%Y %H:%i') FROM Clients;

INSERT INTO Proveidors (Nom ,Telefon ,Fax ,Direccio_carrer ,Direccio_numero,Direccio_pis ,Direccio_porta,Direccio_ciutat,Direccio_codiPostal,Direccio_pais,NIF) 
VALUES 
('Smartoptics','669755214', '962022037', 'Camino Soliz', '25', '1', null, 'Rentería de Arriba',  '81218', 'Espanya', '19396628S' ),
('Opticalia','665856634', '964892012', 'Carrer Lluis', '5', '4', '1', 'Abrego de Ulla',  '80435', 'Espanya', '09711994Z' ),
('Euro Optics', '042936141',  '042986161', 'Brunnerplatz', '742', null, null, 'Ansbach', '32063', 'Alemanya', '21042467C');

INSERT INTO Marca (Nom_marca, idProveidor) 
VALUES
('Rayban', 1),
('Vogue',2),
('Polaroid',2),
('Carrera',3),
('Lacoste',1),
('Persol',1),
('Timberland',2),
('Tous',3),
('Prada',3);

INSERT INTO Venedors (Nom_venedor) 
VALUES 
('Ismael'),
('Maria'),
('Luisa'),
('Ivan'),
('Carolina');

INSERT INTO Model(idMarca, Tipus_montura ,Color_montura,Color_vidre,Preu)
VALUES

(1,'pasta','blau','transparent',59.90),
(1,'flotant','negre','transparent',125),
(2,'pasta','lila','verd',99.99),
(2,'flotant','rosa', 'negre',160),
(3,'pasta','blanc','transparent',80),
(3,'flotant','blau', 'negre',59.90),
(4,'pasta','negre','verd',49.90),
(4,'flotant','blau','transparent',85.50),
(5,'pasta','groc', 'negre',75.50),
(5,'flotant','lila','transparent',69.90),
(6,'pasta','blau','verd',45),
(6,'flotant','gris', 'negre',39),
(7,'pasta','blau','transparent',45),
(7,'flotant','vermell','verd',110),
(8,'pasta','blanc', 'negre',150),
(8,'flotant','vermell','transparent',199),
(9,'pasta','taronja','transparent',33.85),
(9,'flotant','gris','transparent',45.60);


INSERT INTO Ulleres (Graduacio_dret ,Graduacio_esquerra, IdModel)
VALUES

(1.1,1.2,1),
(0.9,0.8,2),
(-2.3,-2.5,3),
(1,1,4),
(2,2,5),
(0,0,6),
(0,0,7),
(0,0.2,8),
(5,4.5,9),
(6,4,10),
(2.6,4.3,11),
(1.3,1.1,12),
(0,0.2,13),
(1.3,1.1,14),
(2,2,15),
(1,1,16),
(0,0.2,17),
(1,1,18),
(6,4,1),
(1.3,1.1,2),
(0.9,0.8,3),
(2,2,4),
(0,0.2,5),
(0.9,0.8,6),
(1.3,1.1,7),
(0.9,0.8,8),
(6,4,9),
(0.9,0.8,10),
(1.3,1.1,11),
(0.9,0.8,12);


INSERT INTO Factures (idClients, idVenedor, idUlleres, data_factura)
VALUES
(4,5,1,'2021-04-14'),
(3,1,2,'2022-11-25'),
(1,2,3,'2023-02-06'),
(8,2,4,'2021-09-13'),
(9,3,5,'2020-06-24'),
(5,2,6,'2022-05-14'),
(7,4,7,'2022-10-15'),
(10,1,8,'2021-03-30'),
(2,3,9,'2021-08-18'),
(2,3,10,'2019-09-05'),
(6,4,11,'2018-10-04'),
(6,4,12,'2017-03-22'),
(4,5,13,'2022-04-23'),
(3,1,14,'2022-01-22'),
(1,2,15,'2021-01-28'),
(8,2,16,'2021-02-05'),
(9,3,17,'2023-08-06'),
(5,2,18,'2022-07-01'),
(7,4,19,'2022-11-09'),
(10,1,20,'2022-10-11'),
(2,3,21,'2021-05-14'),
(2,3,22,'2020-07-03'),
(6,4,23,'2018-09-11'),
(6,4,24,'2017-02-10'),
(7,4,25,'2017-02-07'),
(10,1,26,'2016-03-06'),
(2,3,27,'2015-01-14'),
(2,3,28,'2019-11-19'),
(6,4,29,'2021-12-24'),
(6,4,30,'2022-12-31');

SELECT DATE_FORMAT(Data_factura, '%d-%m-%Y %H:%i') FROM Factures;
