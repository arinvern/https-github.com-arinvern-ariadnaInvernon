/*Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, juntament 
 * amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar 
 * els tres. Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.
 * 
 * No cal que aquests tres paràmetres siguin atributs de la classe, tot i que no hi ha problema en què ho siguin.
Simplement, has de crear un mètode amb tres paràmetres de tipus object ... 
Al següent exercici, ja hauràs de fer servir tres paràmetres genèrics .*/

package ex01;
public class NoGenericMethods {

	
	private Object objecte1, objecte2, objecte3;

	public NoGenericMethods(Object objecte1, Object objecte2, Object objecte3) {

		this.objecte1=objecte1;
		this.objecte2=objecte2;
		this.objecte3=objecte3;
		
	}

	public Object getObjecte1() {
		return objecte1;
	}

	public void setObjecte1(Object objecte1) {
		this.objecte1 = objecte1;
	}

	public Object getObjecte2() {
		return objecte2;
	}

	public void setObjecte2(Object objecte2) {
		this.objecte2 = objecte2;
	}

	public Object getObjecte3() {
		return objecte3;
	}

	public void setObjecte3(Object objecte3) {
		this.objecte3 = objecte3;
	}

	@Override
	public String toString() {
		return "NoGenericMethods [objecte1=" + objecte1 + ", objecte2=" + objecte2 + ", objecte3=" + objecte3 + "]";
	}

	
	
	
}
