use universidad;

/*1*/
SELECT apellido1, apellido2 , nombre FROM persona WHERE tipo = 'alumno' ORDER BY persona.apellido1, persona.apellido2, persona.nombre asc;
 
/*2*/
SELECT apellido1, apellido2 , nombre FROM persona WHERE  telefono is null AND tipo = 'alumno';

/*3*/
SELECT apellido1, apellido2 , nombre FROM persona WHERE fecha_nacimiento between '1999-01-01' and '1999-12-31' AND tipo = 'alumno';

/*4*/
SELECT apellido1, apellido2 , nombre, nif FROM persona WHERE  telefono is null  AND tipo = 'profesor' AND nif like '%k';

/*5*/
SELECT nombre FROM asignatura WHERE  cuatrimestre = 1  AND curso = 3 AND id_grado = 7;

/*6*/
SELECT apellido1, apellido2, persona.nombre as 'nombre profesor', departamento.nombre as 'nombre departamento' FROM persona INNER JOIN profesor ON  persona.id = profesor.id_profesor INNER JOIN departamento ON profesor.id_departamento = departamento.id ORDER BY apellido1, apellido2, persona.nombre desc ;

/*7*/
SELECT  asignatura.nombre as 'nombre asignatura', anyo_inicio as 'año inicio', anyo_fin as 'año final' FROM asignatura INNER JOIN alumno_se_matricula_asignatura ON  alumno_se_matricula_asignatura.id_asignatura = asignatura.id INNER JOIN curso_escolar ON alumno_se_matricula_asignatura.id_curso_escolar = curso_escolar.id INNER JOIN persona ON persona.id = alumno_se_matricula_asignatura.id_alumno WHERE persona.nif = '26902806M';

/*8*/
SELECT DISTINCT departamento.nombre as 'nombre departamento' FROM departamento INNER JOIN profesor ON departamento.id = profesor.id_departamento INNER JOIN asignatura ON profesor.id_profesor = asignatura.id_profesor INNER JOIN grado ON asignatura.id_grado = grado.id WHERE grado.nombre = 'Grado en Ingeniería Informática (Plan 2015)';

/*9*/
SELECT DISTINCT nombre, apellido1, apellido2 FROM persona INNER JOIN alumno_se_matricula_asignatura ON  persona.id = alumno_se_matricula_asignatura.id_alumno INNER JOIN curso_escolar ON alumno_se_matricula_asignatura.id_curso_escolar = curso_escolar.id WHERE curso_escolar.anyo_inicio = 2018;

/*Consultes LEFT JOIN y RIGHT JOIN*/

/*1*/
SELECT departamento.nombre AS 'nombre departamento',  persona.nombre FROM departamento INNER JOIN profesor ON profesor.id_departamento = departamento.id RIGHT JOIN  persona ON profesor.id_profesor = persona.id ORDER BY departamento.nombre, persona.apellido1, persona.apellido2, persona.nombre ASC;

/*2*/
SELECT  persona.apellido1, persona.apellido2, persona.nombre FROM departamento INNER JOIN profesor ON profesor.id_departamento = departamento.id RIGHT JOIN persona ON profesor.id_profesor = persona.id WHERE departamento.nombre is null ORDER BY departamento.nombre, persona.apellido1, persona.apellido2, persona.nombre ASC;

/*3*/
SELECT  nombre FROM departamento LEFT JOIN  profesor ON profesor.id_departamento = departamento.id WHERE profesor.id_profesor is null;

/*4*/
SELECT  persona.nombre as 'nombre profesor', apellido1, apellido2 FROM persona INNER JOIN profesor ON persona.id = profesor.id_profesor LEFT JOIN asignatura ON profesor.id_profesor = asignatura.id_profesor WHERE asignatura.id_profesor is null;

/*5*/
SELECT  asignatura.nombre as 'nombre asignatura' FROM asignatura WHERE asignatura.id_profesor is null;

/*6*/
SELECT DISTINCT departamento.nombre FROM departamento LEFT JOIN profesor on profesor.id_departamento = departamento.id LEFT JOIN asignatura on asignatura.id_profesor=profesor.id_profesor WHERE asignatura.nombre is null;

/*Consultes resum*/

/*1*/
SELECT COUNT(alumno_se_matricula_asignatura.id_alumno) as 'número de alumnos'FROM alumno_se_matricula_asignatura;

/*2*/
SELECT COUNT(persona.id) as 'número de alumnos nacidos en 1999' FROM persona LEFT JOIN alumno_se_matricula_asignatura ON alumno_se_matricula_asignatura.id_alumno = persona.id WHERE YEAR(persona.fecha_nacimiento)=1999;

/*3*/
SELECT departamento.nombre as 'nombre departamento', COUNT(persona.nombre) as 'número profesores'FROM persona INNER JOIN profesor ON profesor.id_departamento=persona.id INNER JOIN departamento ON profesor.id_departamento=departamento.id GROUP BY departamento.nombre ORDER BY  count(persona.nombre) desc;

/*4*/
SELECT departamento.nombre as 'nombre departamento', COUNT(persona.nombre) as 'número profesores' FROM persona RIGHT JOIN profesor ON profesor.id_departamento=persona.id RIGHT JOIN departamento ON profesor.id_departamento=departamento.id GROUP BY departamento.nombre;

/*5*/
SELECT grado.nombre as 'nombre grado', COUNT(asignatura.id) as 'número asignaturas' FROM grado LEFT JOIN asignatura ON asignatura.id_grado= grado.id GROUP BY grado.nombre ORDER BY COUNT(asignatura.id) DESC;

/*6*/
SELECT grado.nombre as 'nombre grado', COUNT(asignatura.id) as 'número asignaturas' FROM grado LEFT JOIN asignatura ON asignatura.id_grado= grado.id GROUP BY grado.nombre HAVING COUNT(asignatura.id) > 40;

/*7*/
SELECT grado.nombre as 'nombre grado', asignatura.tipo as 'tipo de asignatura', SUM(creditos) as 'total creditos' FROM asignatura INNER JOIN grado on grado.id = asignatura.id_grado GROUP BY grado.nombre, asignatura.tipo;

/*8*/
SELECT curso_escolar.anyo_inicio as 'año inicio curso', COUNT(alumno_se_matricula_asignatura.id_alumno) as 'número alumnos matriculados' FROM curso_escolar LEFT JOIN alumno_se_matricula_asignatura ON alumno_se_matricula_asignatura.id_curso_escolar = curso_escolar.id GROUP BY curso_escolar.anyo_inicio;

/*9*/
SELECT persona.id, persona.nombre, persona.apellido1 , persona.apellido2, COUNT(asignatura.id) as 'número asignaturas' FROM persona LEFT JOIN profesor on profesor.id_profesor=persona.id LEFT JOIN asignatura on profesor.id_profesor=asignatura.id_profesor GROUP BY persona.id, persona.nombre,persona.apellido1 , persona.apellido2 ORDER BY COUNT(asignatura.id) DESC;

/*10*/
SELECT * FROM persona ORDER BY fecha_nacimiento DESC LIMIT 1;

/*11*/
SELECT persona.nombre as 'nombre profesor' ,persona.apellido1, persona.apellido2 FROM persona INNER JOIN profesor on profesor.id_profesor=persona.id LEFT JOIN asignatura on profesor.id_profesor=asignatura.id_profesor LEFT JOIN departamento on profesor.id_departamento=departamento.id WHERE asignatura.id is NULL;
