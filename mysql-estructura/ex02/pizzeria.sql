drop database pizzeria;
create database pizzeria;
use pizzeria;

create table Clients(
idClients int not null AUTO_INCREMENT ,
Nom varchar(45) not null,
Cognom1 varchar(45) not null,
Cognom2 varchar(45) ,
Telefon varchar(15) not null,
Correu_electronic varchar (45) not null,
Data_registre date not null,
Direccio varchar(45) not null,
Localitat varchar (45) not null,
CodiPostal char(5) not null,
Provincia varchar(45) not null,
PRIMARY KEY (idClients)
);

create table Botiga(
idBotiga int not null AUTO_INCREMENT,
Direccio varchar(45) not null,
Localitat varchar (45) not null,
CodiPostal char(5) not null,
Provincia varchar(45) not null,
PRIMARY KEY (idBotiga)
);

create table Empleat(
idEmpleat int not null AUTO_INCREMENT,
Nom varchar(45) not null,
Cognom1 varchar(45) not null,
Cognom2 varchar(45) ,
Telefon varchar(15) not null,
NIF char(9) not null,
Tipus enum ('cuiner','repartidor') not null,
Botiga int not null,
PRIMARY KEY (idEmpleat),
FOREIGN KEY (Botiga) REFERENCES Botiga(idBotiga)
);

create table Producte(
idProducte int not null AUTO_INCREMENT,
Nom varchar(45) not null,
Descripcio varchar(100) not null,
Preu float not null,
Imatge longblob,

PRIMARY KEY (idProducte)

);

create table PizzaNormal(
idPizza int not null AUTO_INCREMENT,
idProducte int not null,

PRIMARY KEY (idPizza),
FOREIGN KEY (idProducte) REFERENCES Producte(idProducte)
);

create table PizzaVegana(
idPizzaVegana int not null AUTO_INCREMENT,
idProducte int not null,

PRIMARY KEY (idPizzaVegana),
FOREIGN KEY (idProducte) REFERENCES Producte(idProducte)
);

create table PizzaSenseGluten(
idPizzaSenseGluten int not null AUTO_INCREMENT,
idProducte int not null,

PRIMARY KEY (idPizzaSenseGluten),
FOREIGN KEY (idProducte) REFERENCES Producte(idProducte)
);

create table Comanda(
idComanda int not null AUTO_INCREMENT,
idClient int not null,
idBotiga int not null,
entrega enum ('domicili', 'recollida en botiga') not null,
repartidor int,
dataEntrega date,

PRIMARY KEY (idComanda),
FOREIGN KEY (idClient) REFERENCES Clients (idClients),
FOREIGN KEY (idBotiga) REFERENCES Botiga (idBotiga),
FOREIGN KEY (repartidor) REFERENCES Empleat (idEmpleat)
);

create table ProductesComanda(
idProductesComanda int not null AUTO_INCREMENT,
idComanda int not null,
idProducte int not null,
quantitat int not null,
preuTotalProducte float,

PRIMARY KEY (idProductesComanda),
FOREIGN KEY (idComanda) REFERENCES Comanda (idComanda),
FOREIGN KEY (idProducte) REFERENCES Producte (idProducte)

);

INSERT INTO Clients(Nom ,Cognom1,Cognom2,Telefon,Correu_electronic,Data_registre,Direccio,Localitat,CodiPostal,Provincia)
VALUES 
('Boyd', 'Diloway', 'Macy', '8424821864', 'bmacy0@over-blog.com', '2022-11-14', '2645 Butterfield Court', 'Pontevedra', '36156', 'Pontevedra'),
('Kiley', 'Poff', 'Raffon', '3842400353', 'kraffon1@discovery.com', '2022-08-03', '97 Eastlawn Pass', 'Vigo', '36205', 'Pontevedra'),
('Cary', 'Jandourek', 'Broscombe', '8693469752', 'cbroscombe2@163.com', '2022-08-17', '0 Debs Lane', 'Leganes', '28914', 'Madrid'),
('Pinchas', 'Clatworthy', 'Rawlyns', '6543981097', 'prawlyns3@cocolog-nifty.com', '2022-12-04', '2 Rutledge Alley', 'Palmas De Gran Canaria, Las', '35010', 'Canarias'),
('Ramonda', 'De Mico', 'Lemmen', '9839418816', 'rlemmen4@webnode.com', '2022-09-08', '74 Elka Hill', 'Madrid', '28015', 'Madrid'),
('Marni', 'McMorran', 'Cameli', '5799601338', 'mcameli5@theatlantic.com', '2022-07-18', '29 Manley Park', 'Zaragoza', '50080', 'Zaragoza'),
('Ethelbert', 'Preston', 'Balsillie', '1037314074', 'ebalsillie6@reuters.com', '2022-04-12', '9 Macpherson Plaza', 'Albacete', '02005', 'Albacete'),
('Koenraad', 'Bangs', 'Bartoshevich', '9316297900', 'kbartoshevich7@comsenz.com', '2023-01-10', '011 Bayside Court', 'Albacete', '02005', 'Albacete'),
('Gilli', 'Braemer', 'Surpliss', '7393982183', 'gsurpliss8@shinystat.com', '2022-08-26', '7141 Dwight Alley', 'Pontevedra', '36156', 'Pontevedra'),
 ('Barrie', 'Brunt', 'Springell', '8809493697', 'bspringell9@nifty.com', '2022-04-04', '20 Gale Park', 'Palmas De Gran Canaria, Las', '35010', 'Canarias'),
 ('Sanson', 'Webben', 'Cloonan', '6845814797', 'scloonana@sbwire.com', '2022-08-02', '986 Springs Plaza', 'Palmas De Gran Canaria, Las', '35010', 'Canarias'),
('Bram', 'Panas', 'Goodricke', '9757663529', 'bgoodrickeb@washington.edu', '2022-07-04', '31428 Spaight Crossing', 'Lugo', '27294', 'Lugo'),
('Bill', 'Chipps', 'Brettoner', '3323154040', 'bbrettonerc@hexun.com', '2022-07-13', '4218 Lotheville Trail', 'Palmas De Gran Canaria, Las', '35070', 'Canarias'),
('Essa', 'Chinge', 'Goodlip', '5119822045', 'egoodlipd@nature.com', '2022-08-24', '74115 Drewry Road', 'Albacete', '02070', 'Albacete'),
('Valentin', 'Hubber', 'Taillard', '9464889037', 'vtaillarde@mapquest.com', '2022-06-19', '0 Fulton Street', 'Madrid', '28045', 'Madrid'),
('Staci', 'Hillaby', 'Calafate', '5367687946', 'scalafatef@nps.gov', '2022-09-02', '39 Bartillon Pass', 'Lugo', '27294', 'Lugo'),
('Giustino', 'Andrini', 'Muirhead', '4497474865', 'gmuirheadg@mail.ru', '2023-01-04', '6052 Buena Vista Pass', 'Vigo', '36205', 'Pontevedra'),
('Clarice', 'Patey', 'Haughton', '6285437303', 'chaughtonh@dailymotion.com', '2023-01-09', '1 Spenser Alley', 'Palmas De Gran Canaria, Las', '35070', 'Canarias'),
('Clair', 'Varley', 'Whyberd', '6067780110', 'cwhyberdi@senate.gov', '2022-12-17', '0799 Westridge Road', 'Vigo', '36205', 'Vigo'),
('Laverna', 'Fortey', 'Lawtie', '5831756025', 'llawtiej@github.com', '2022-05-03', '54 Debs Hill', 'Vigo', '36205', 'Vigo'),
('Deana', 'Hanratty', 'Strasse', '7397086377', 'dstrassek@istockphoto.com', '2022-08-27', '9 Crownhardt Crossing', 'Leganes', '28914', 'Madrid'),
 ('Luciano', 'Tapsfield', 'Groocock', '2717507149', 'lgroocockl@tiny.cc', '2022-03-31', '3303 Mccormick Terrace', 'Barcelona', '08075', 'Barcelona'),
 ('Mella', 'Osichev', 'Worgen', '7555662279', 'mworgenm@wufoo.com', '2023-01-21', '39 Golf Course Pass', 'Huesca', '22005', 'Huesca'),
 ('Cordy', 'Akred', 'Genese', '8386110550', 'cgenesen@amazon.de', '2022-03-09', '86 South Circle', 'Santiago De Compostela', '15705', 'La Coruña'),
 ('Barb', 'Livesey', 'Vatini', '4344102131', 'bvatinio@wix.com', '2022-11-15', '89521 Daystar Junction', 'Leganes', '28914', 'Madrid'),
('Ivett', 'Garrat', 'Breche', '2417927664', 'ibrechep@parallels.com', '2022-06-19', '4093 Londonderry Place', 'Palmas De Gran Canaria, Las', '35015', 'Canarias'),
('Wilhelm', 'Soreau', 'Ferro', '4093006494', 'wferroq@odnoklassniki.ru', '2022-09-02', '12 Fairfield Circle', 'Madrid', '28015', 'Madrid'),
('Blayne', 'Cripps', 'Canadas', '2457056638', 'bcanadasr@a8.net', '2022-11-04', '6137 Main Circle', 'Telde', '35213', 'Canarias'),
('Ardeen', 'Habeshaw', 'Barthropp', '5955937973', 'abarthropps@wufoo.com', '2022-04-16', '801 Di Loreto Parkway', 'Barcelona', '08075', 'Barcelona'),
('Dorey', 'Cuppleditch', 'Phillpotts', '5162907112', 'dphillpottst@ed.gov', '2022-07-09', '73175 Haas Drive', 'Leganes', '28914', 'Madrid'); 

INSERT INTO Botiga( Direccio,Localitat ,CodiPostal,Provincia)
VALUES 
('7 South Plaza', 'Barcelona', '08030', 'Barcelona'),
('8363 Service Terrace', 'Madrid', '28045', 'Madrid'),
('11072 Clarendon Pass', 'Hospitalet De Llobregat', '08904', 'Barcelona'),
('18799 Drewry Street', 'Sabadell', '08204', 'Barcelona'),
('660 Del Mar Parkway', 'Lleida', '25193', 'Lleida');

INSERT INTO Empleat( Nom,Cognom1,Cognom2,Telefon,NIF,Tipus, Botiga)
VALUES 
('Loïca', 'Neal', 'Jancar', '4019400355', '39380928x', 'cuiner',1),
('Táng', 'Massimo', 'McElroy', '7325014984', '83163466p', 'cuiner',1),
('Annotés', 'Sealand', 'Broadhead', '9566572583', '77432360l', 'repartidor',1),
('Marie-josée', 'Vedekhin', 'Bracegirdle', '6392923761', '88507481e', 'repartidor',2),
('Håkan', 'Connolly', 'Kliment', '2326847600', '70260047h', 'cuiner',2),
('Françoise', 'Renvoise', 'Lowthian', '7635885294', '19884384z', 'cuiner',2),
('Örjan', 'Peiro', 'Rodge', '2412691263', '49029460z', 'repartidor',3),
('Gaëlle', 'Mattei', 'Roskams', '3896893956', '64277556j', 'cuiner',3),
('Nuó', 'Pluvier', 'Swatradge', '8402659125', '83123099j', 'cuiner',3),
('Fèi', 'Rough', 'Feares', '6971488922', '98477943g', 'repartidor',4),
('Edmée', 'Penrith', 'Kropach', '2133786461', '63517763l', 'cuiner',4),
('Chloé', 'MacKaig', 'Houldcroft', '9514715420', '66901224h', 'cuiner',4),
('Adélaïde', 'Olliver', 'Bruni', '5016486408', '83808411e', 'cuiner',5),
('Yénora', 'Faulkes', 'Dufaur', '6444939757', '03470403r', 'repartidor',5),
('Geneviève', 'Holdey', 'Bollon', '8536761240', '87552830r', 'cuiner',5);


INSERT INTO Producte (Nom,Descripcio,Preu, Imatge)
VALUES
('Hamburguesa', 'Hamburguesa amb formatge i bacon', 9.95, LOAD_FILE('C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\burger.jpg')),
('Beguda', 'Beguda de taronja o cola', 3.50, LOAD_FILE('C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\beguda.jpg')),
('Pizza 4 formatges', 'Pizza amb mozzarella, grana padano, roquefort i emmental', 11.50, LOAD_FILE('C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\pizza1.jpg')),
('Pizza margarita', 'Pizza amb tomaquet i mozzarella', 15.99, LOAD_FILE('C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\pizza2.jpg')),
('Pizza barbacoa', 'Pizza amb carn i salsa barbacoa sense gluten', 17.50, LOAD_FILE('C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\pizza3.jpeg')),
('Pizza carbonara', 'Pizza amb salsa carbonara i xampinyons sense gluten', 13.99, LOAD_FILE('C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\pizza4.jpeg')),
('Pizza de tofu', 'Pizza vegana amb tofu', 3.50, LOAD_FILE('C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\pizza5.jpg')),
('Pizza verdures', 'Pizza vegana de verdures i masa de coliflor', 3.50, LOAD_FILE('C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\pizza6.avif'));

INSERT INTO PizzaNormal (idProducte)
VALUES
(3),
(4);
 
INSERT INTO PizzaSenseGluten (idProducte)
VALUES
(5),
(6);
 
INSERT INTO PizzaVegana (idProducte)
VALUES
(7),
(8);

INSERT INTO Comanda(idClient,idBotiga,entrega,repartidor,dataEntrega)
VALUES
(1,1,'recollida en botiga',null ,'2022-09-04'),
(2,2,'domicili',4,'2021-07-05'),
(3,3,'domicili',7,'2022-06-18'),
(4,4,'domicili',10,'2021-10-21'),
(5,5,'domicili',14,'2021-08-11'),
(6,5,'domicili',14,'2020-06-14'),
(7,4,'domicili',10,'2021-07-04'),
(8,1,'domicili',3,'2021-04-06'),
(9,1,'recollida en botiga',null,'2020-11-18'),
(10,2,'domicili',4,'2020-01-25'),
(11,3,'domicili',7,'2020-09-15'),
(12,4,'domicili',10,'2020-06-01'),
(13,4,'domicili',10,'2021-12-03'),
(14,3,'domicili',7,'2023-01-30'),
(15,5,'recollida en botiga',null,'2022-07-29'),
(16,2,'domicili',4,'2022-03-27'),
(17,2,'recollida en botiga',null,'2022-12-06'),
(18,5,'domicili',14,'2022-06-15'),
(19,1,'domicili',3,'2022-06-18'),
(20,2,'recollida en botiga',null,'2021-02-15'),
(21,1,'domicili',3,'2020-06-27'),
(22,3,'domicili',7,'2023-01-20'),
(23,3,'recollida en botiga',null,'2020-09-15'),
(24,4,'domicili',10,'2022-01-15'),
(25,4,'recollida en botiga',null,'2022-07-24'),
(26,2,'domicili',4,'2021-02-22'),
(27,1,'domicili',3,'2020-02-21'),
(28,4,'domicili',10,'2021-05-08'),
(29,3,'domicili',7,'2022-10-24'),
(30,5,'domicili',14,'2022-10-05');



INSERT INTO ProductesComanda (idComanda, idProducte, quantitat)
VALUES
(1,1,3) ,
(1,7,4),
(2,8,1),
(3,5,2),
(3,4,5),
(4,2,2),
(4,3,2),
(5,1,2),
(6,5,3),
(6,6,1),
(6,7,2),
(7,3,3),
(8,4,1),
(9,6,2),
(10,6,3),
(10,7,2),
(11,5,3),
(11,4,1),
(11,1,3),
(12,2,2),
(13,1,4),
(14,4,1),
(14,8,2),
(15,8,2),
(16,2,3),
(17,3,2),
(18,1,1),
(19,7,2),
(19,8,3),
(20,3,2),
(20,4,1),
(21,1,5),
(21,6,3),
(22,2,2),
(22,4,1),
(23,7,3),
(24,6,2),
(25,5,4),
(26,1,2),
(27,2,1),
(28,3,3),
(29,4,2),
(30,5,1),
(30,6,3);

UPDATE ProductesComanda
SET preuTotalProducte = (
  SELECT Producte.preu * ProductesComanda.quantitat
  FROM Producte 
  WHERE Producte.idProducte = ProductesComanda.idProducte
)
WHERE preuTotalProducte IS NULL AND ProductesComanda.idProductesComanda >0;
