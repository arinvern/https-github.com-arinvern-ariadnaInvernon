package ex03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import ex01.Month;

public class App {

	final static String filePath = "C:/Users/Ariadna/Desktop/Countries.txt";
	private static List<String> llistaCapitals;
	private static Collection<String> values;

	public static void main(String[] args) {

		// llegir l'arxiu de text amb hashMap

		Map<String, String> mapFromFile = HashMapFromTextFile();

		// convertir les keys del hashMap a ArrayList

		ArrayList<String> llistaPaisos = convertirKeysALlista(mapFromFile);

		// convertir values de hashmap a ArrayList
		List<String> llistaCapitals = convertirValuesALlista(mapFromFile);

		String usuari = demanaString("Introdueix el teu nom");

		int puntuacio = endevinarCapitals(llistaPaisos, llistaCapitals);

		crearTextResultats(usuari, puntuacio);

	}

	private static void crearTextResultats(String usuari, int puntuacio) {
		try {
			FileWriter myWriter = new FileWriter("C:/Users/Ariadna/Desktop/classificacio.txt");
			myWriter.write("Usuari: " + usuari);
			myWriter.write("\nPuntuació: " + puntuacio);

			myWriter.close();
			System.out.println("Creat arxiu amb els resultats.");
		} catch (IOException e) {
			System.out.println("Error al crear l'arxiu.");
			e.printStackTrace();
		}
	}

	private static List<String> convertirValuesALlista(Map<String, String> mapFromFile) {
		values = mapFromFile.values();
		llistaCapitals = new ArrayList<String>(values);
		return llistaCapitals;
	}

	private static ArrayList<String> convertirKeysALlista(Map<String, String> mapFromFile) {
		Set<String> keySet = mapFromFile.keySet();// convertir paisos en arrayList
		ArrayList<String> llistaPaisos = new ArrayList<String>(keySet);
		return llistaPaisos;
	}

	public static int endevinarCapitals(ArrayList<String> llistaPaisos, List<String> llistaCapitals) {
		int puntuacio = 0;

		ArrayList<Integer> llistaNums = new ArrayList<Integer>();

		LinkedHashSet<Integer> hashSetNumeros = new LinkedHashSet<Integer>();

		do {
			int numAleatori = generarNumAleatori();
			hashSetNumeros.add(numAleatori);

		} while (hashSetNumeros.size() < 10);

		llistaNums.addAll(hashSetNumeros);
		

		for (int i = 0; i < 10; i++) {

			String resposta = demanaString("Quina és la capital de " + llistaPaisos.get(llistaNums.get(i)) + "?");

			if (resposta.equalsIgnoreCase((String) llistaCapitals.get(llistaNums.get(i)))) {
				puntuacio += 1;

			}

		}
		return puntuacio;
	}

	public static int generarNumAleatori() {

		int numAleatori = (int) (Math.random() * (50 - 0));

		return numAleatori;
	}

	public static Map<String, String> HashMapFromTextFile() {

		Map<String, String> map = new HashMap<String, String>();
		BufferedReader br = null;

		try {

			// create file object
			File file = new File(filePath);

			// create BufferedReader object from the File
			br = new BufferedReader(new FileReader(file));

			String line = null;

			// read file line by line
			while ((line = br.readLine()) != null) {

				if (!line.equals("")) {// !!!!!comprobar
					// el .txt separa pais i capital per un espai " "
					String[] parts = line.split(" ");

					// primera part és el pais i la segona la capital
					String pais = parts[0].trim();// trim per treure espais buits per davant i darrere
					String capital = parts[1].trim();

					// si pais i capital no estan buits els afegeix a hashMap
					if (!pais.equals("") && !capital.equals(""))
						map.put(pais, capital); // put --> com add per llistes
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// tancar BufferedReader
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
				}
				;
			}
		}

		return map;

	}

	public static String demanaString(String missatge) {
		Scanner input = new Scanner(System.in);
		System.out.println(missatge);
		String text = input.nextLine();
		return text;
	}

}
