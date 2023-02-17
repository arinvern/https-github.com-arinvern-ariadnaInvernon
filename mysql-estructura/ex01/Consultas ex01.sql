use base_dades;
show tables;
SELECT * from clients;
desc clients;

SELECT clients.nom ,Count(*)  
FROM clients 
INNER JOIN factures ON clients.idClients = factures.idClients  
WHERE clients.nom LIKE 'Ariadna' AND factures.data_factura BETWEEN '2021-01-01' AND '2023-02-06'
GROUP BY clients.nom ;

SELECT model.idModel as num_Model, marca.Nom_marca
FROM model
INNER JOIN ulleres ON  model.idModel = ulleres.idModel 
INNER JOIN factures ON  ulleres.idUlleres = factures.idUlleres
INNER JOIN venedors ON factures.idVenedor = venedors.idVenedor
INNER JOIN marca ON marca.idMarca = model.idMarca
WHERE  (factures.data_factura BETWEEN '2022-01-01' AND '2023-01-01') AND venedors.Nom_venedor LIKE 'Ivan' ;

SELECT proveidors.nom as nomProveidor,Count(*)  ventesTotals
FROM proveidors
INNER JOIN marca ON  marca.idProveidor = proveidors.idProveidor
INNER JOIN model ON  model.idMarca = marca.idMarca
INNER JOIN ulleres ON ulleres.idModel = model.idModel
INNER JOIN factures ON factures.idFactures = ulleres.idUlleres

GROUP BY proveidors.nom ;




