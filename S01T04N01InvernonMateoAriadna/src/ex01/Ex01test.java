package ex01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Ex01test {

	ArrayList<String> mesos = Mesos.mesos();

	@Test
	void testPosicions() {

		int esperat = 12;
		int resultat = mesos.size();
		assertEquals(esperat, resultat);

	}

	@Test
	void testNoEsNula() {

		assertNotNull(mesos);

	}

	@Test
	void testAgostPosicioVuit() { 
		
		//dona "failure" perquè agost es troba a la posició 7 de la llista, no a al vuit
		// les llistes comencen amb posició 0
		String esperat = "Agost";
		String resultat = mesos.get(8);
		assertEquals(esperat, resultat);

	}
	
	@Test
	void testAgostPosicioSet() {

		String esperat = "Agost";
		String resultat = mesos.get(7);
		assertEquals(esperat, resultat);

	}

}
