package ex02;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Ex02test {

	
	@ParameterizedTest  
	@ValueSource(strings = {"99154235Q","54027397Y","35275634M", "14670194N", "76580853F", "63954558E","62889729R", "25921222S", "10638597Q", "10638597Z"}) 
	//Últim Dni está malament a proposit per comprobar.
	@DisplayName(value = "Check validity of DNI")
	
	void check_validity_DNI(String DNI) { // <- Indicamos en el test el tipo y nombre del nuestro parámetro

		char esperat=DNI.charAt(8);
		char resultat= CalculoDni.calculDni(DNI);
		
		assertEquals(esperat, resultat);
		
		
	}

}
