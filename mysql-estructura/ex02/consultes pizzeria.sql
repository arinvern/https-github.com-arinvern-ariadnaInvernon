
SELECT SUM(ProductesComanda.quantitat) as 'total_begudes_venudes',Botiga.Localitat
FROM ProductesComanda 
INNER JOIN Comanda ON Comanda.idComanda = ProductesComanda.idComanda 
INNER JOIN Botiga ON Comanda.idBotiga = Botiga.idBotiga 
INNER JOIN Producte ON Producte.idProducte = ProductesComanda.idProducte 
WHERE Producte.Nom = 'Beguda'
and Botiga.Localitat='Sabadell';


SELECT COUNT(Comanda.idComanda) as 'número de comandes', empleat.Nom
FROM Comanda
INNER JOIN Empleat ON Empleat.idEmpleat = Comanda.Repartidor
WHERE Empleat.idEmpleat=4;

