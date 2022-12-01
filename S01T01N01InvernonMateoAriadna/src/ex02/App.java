package ex02;

public class App {

	public static void main(String[] args) {
		
		
		System.out.println(Coche.getMarca());
		System.out.println(Coche.getModelo());
		
		//antes de instanciar coche puedo acceder a atributos marca y modelo porque son estáticos.
		//no puedo acceder a potencia (final pero no estático).
		
		//Aunque puedo acceder a modelo (static) aparece como nulo antes de instanciar porque aún no se le ha dado valor.
		
		Coche.frenar();//como el método frenar es estático puedo acceder sin instanciar ningun objeto coche.
		
		Coche coche1 = new Coche ();
		
		System.out.println(Coche.getModelo());
		
		//después de crear instancia de coche la variable estática modelo ya tiene valor y no será null.
	
		System.out.println(coche1.getPotencia());
		
		//después de crear instancia de coche puedo acceder a la potencia.
		
		coche1.acelerar();//para poder usar el método acelerar que no es estático tengo que instanciar un objeto coche primero.
		
		
		/*Resumen diferencias:
		  - "final" --> una vez declarado no puede ser modificado.
		  - "static" --> pertenece a la clase y no al objeto. No depende de tener que crear un objeto de esa clase. */
		 
	}

}
