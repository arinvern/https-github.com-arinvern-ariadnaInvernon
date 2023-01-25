package ex04;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		
		
		String directori = demanaString ("Introdueix el directori de l'arxiu .txt que vols llegir:");
		
		LlegirTxt.llegirTxt(directori);

	}
	
	public static String demanaString (String missatge) {
		Scanner input = new Scanner(System.in);
		System.out.println(missatge);
		String text = input.nextLine();
		return text;
	}

}
