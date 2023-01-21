/*Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, juntament 
 * amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar 
 * els tres. Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.
 * 
 * No cal que aquests tres paràmetres siguin atributs de la classe, tot i que no hi ha problema en què ho siguin.
Simplement, has de crear un mètode amb tres paràmetres de tipus object ... 
Al següent exercici, ja hauràs de fer servir tres paràmetres genèrics .*/

package ex01;

import ex02.Persona;

public class App {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Ariadna", "Invernón", 28);
		Persona persona2 = new Persona("Benancia", "García", 87);
		Persona persona3 = new Persona("Arsenio", "Pérez", 65);
		
		NoGenericMethods noGeneric1 = new NoGenericMethods(persona1, persona2, persona3);
		System.out.println(noGeneric1);

		NoGenericMethods noGeneric2 = new NoGenericMethods(persona3, persona1, persona2);
		System.out.println(noGeneric2);
	}

}
