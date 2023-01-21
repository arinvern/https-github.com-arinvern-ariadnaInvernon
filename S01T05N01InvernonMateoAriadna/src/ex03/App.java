package ex03;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class App {

	public static void main(String[] args) throws IOException {

		String directori = "C:/Users/Ariadna/Desktop/carpetaS1T5/";

		PrintStream o = new PrintStream(new File("C:/Users/Ariadna/Desktop/directoriOrdenat.txt"));
		PrintStream console = System.out;
		System.setOut(o);

		Organitza.organitzar(directori);
		
		System.setOut(console);
	}

}
