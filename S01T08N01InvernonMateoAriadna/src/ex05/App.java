package ex05;


public class App {

	public static void main(String[] args) {
		
		InterficieFuncional InterficieFuncional;

    
		InterficieFuncional = () -> 3.1415;

        
        System.out.println("Valor de Pi = " + InterficieFuncional.getPiValue());

	}

}
