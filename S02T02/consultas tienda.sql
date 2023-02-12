use tienda;
/*1*/
SELECT nombre as 'nombre producto' FROM producto;

/*2*/
SELECT nombre as 'nombre producto', precio FROM producto;

/*3*/
SELECT *
FROM producto;

/*4*/
SELECT nombre , precio , ROUND(precio * 1.0691081,2)  FROM producto;

/*5*/
SELECT nombre as 'nombre de producto', precio as 'precio en euros' ,ROUND(precio * 1.0691081,2) as 'precio en dolares estadounidenses (USD)'FROM producto;

/*6*/
SELECT UPPER(nombre) as 'nombre de producto', precio as 'precio en euros' FROM producto;

/*7*/
SELECT LOWER(nombre) as 'nombre de producto', precio as 'precio en euros' FROM producto;

/*8*/
SELECT nombre, UPPER (LEFT(nombre,2))FROM fabricante;

/*9*/
SELECT nombre , ROUND(precio) FROM producto;

/*10*/
SELECT nombre , TRUNCATE(precio,0) FROM producto;

/*11*/
SELECT fabricante.codigo FROM fabricante INNER JOIN producto on producto.codigo_fabricante = fabricante.codigo;

/*12*/
SELECT DISTINCT fabricante.codigo FROM fabricante INNER JOIN producto on producto.codigo_fabricante = fabricante.codigo;

/*13*/
SELECT nombre FROM fabricante ORDER BY nombre ASC;

/*14*/
SELECT nombre FROM fabricante ORDER BY nombre DESC;

/*15*/
SELECT nombre FROM producto ORDER BY nombre DESC, producto.precio ASC;

/*16*/
SELECT * FROM fabricante LIMIT 5;

/*17*/
SELECT * FROM fabricante LIMIT 2 OFFSET 3;

/*18*/
SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;

/*19*/
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;

/*20*/
SELECT producto.nombre FROM producto INNER JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.codigo =2;

/*21*/
SELECT producto.nombre as 'nombre producto', producto.precio as' precio producto', fabricante.nombre as 'nombre fabricante' FROM producto LEFT JOIN fabricante on producto.codigo_fabricante = fabricante.codigo;

/*22*/
SELECT producto.nombre as 'nombre producto', producto.precio as' precio producto', fabricante.nombre as 'nombre fabricante' FROM producto LEFT JOIN fabricante on producto.codigo_fabricante = fabricante.codigo ORDER BY fabricante.nombre ASC ;

/*23*/
SELECT producto.nombre as 'nombre producto', producto.codigo as' codigo producto', fabricante.nombre as 'nombre fabricante', fabricante.codigo as' codigo fabricante' FROM producto LEFT JOIN fabricante on producto.codigo_fabricante = fabricante.codigo;

/*24*/
SELECT producto.nombre as 'nombre producto', producto.precio as 'precio producto', fabricante.nombre as'nombre fabricante' FROM producto JOIN fabricante on producto.codigo_fabricante = fabricante.codigo ORDER BY producto.precio ASC LIMIT 1 ;

/*25*/
SELECT producto.nombre as 'nombre producto', producto.precio as 'precio producto', fabricante.nombre as'nombre fabricante' FROM producto JOIN fabricante on producto.codigo_fabricante = fabricante.codigo ORDER BY producto.precio DESC LIMIT 1;

/*26*/
SELECT producto.nombre as 'nombre producto' FROM producto INNER JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Lenovo';

/*27*/
SELECT producto.nombre as 'nombre producto' FROM producto INNER JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Crucial' AND producto.precio >200;

/*28*/
SELECT producto.nombre as 'nombre producto' FROM producto INNER JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Asus' OR fabricante.nombre ='Hewlett-Packard' OR fabricante.nombre='Seagate';

/*29*/
SELECT producto.nombre as 'nombre producto' FROM producto INNER JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre IN ('Asus','Hewlett-Packard','Seagate');

/*30*/
SELECT producto.nombre as 'nombre producto', producto.precio FROM producto INNER JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre LIKE '%e';

/*31*/
SELECT  producto.nombre as 'nombre producto', producto.precio FROM producto LEFT JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre LIKE '%w%';

/*32*/
SELECT producto.nombre as 'nombre producto', producto.precio, fabricante.nombre as 'nombre fabricante' FROM producto INNER JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE producto.precio >180 ORDER BY producto.precio DESC, producto.nombre ASC;

/*33*/
SELECT fabricante.nombre as 'nombre fabricante', fabricante.codigo as 'codigo fabricante' FROM fabricante INNER JOIN producto on producto.codigo_fabricante = fabricante.codigo;

/*34*/
SELECT fabricante.nombre as 'nombre fabricante', producto.nombre as 'nombre producto' FROM fabricante LEFT JOIN producto on producto.codigo_fabricante = fabricante.codigo;

/*35*/
SELECT fabricante.nombre as 'nombre fabricante', producto.nombre as 'nombre producto' FROM fabricante LEFT JOIN producto on producto.codigo_fabricante = fabricante.codigo WHERE producto.nombre is null;

/*36*/
SELECT fabricante.nombre as 'nombre fabricante', producto.nombre as 'nombre producto' FROM fabricante RIGHT JOIN producto on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Lenovo';

/*37*/
SELECT * FROM producto WHERE producto.precio = (SELECT MAX(precio) FROM producto RIGHT JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Lenovo');

/*38*/
SELECT  producto.nombre as 'nombre producto' FROM producto INNER JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Lenovo' ORDER BY producto.precio DESC LIMIT 1;

/*39*/
SELECT  producto.nombre as 'nombre producto' FROM producto INNER JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Hewlett-Packard' ORDER BY producto.precio ASC LIMIT 1;

/*40*/
SELECT * FROM producto WHERE producto.precio >= (SELECT MAX(precio) FROM producto JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Lenovo');

/*41*/
SELECT producto.nombre FROM producto JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE producto.precio > (SELECT AVG(precio) FROM producto JOIN fabricante on producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre = 'Asus' ) AND fabricante.nombre ='Asus';


