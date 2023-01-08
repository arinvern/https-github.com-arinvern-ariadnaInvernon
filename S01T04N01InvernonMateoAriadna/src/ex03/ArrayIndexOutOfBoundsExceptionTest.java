package ex03;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ArrayIndexOutOfBoundsExceptionTest {

		
	@Test
	public void patata() {
		
		try {
		ArrayIndexOutOfBoundsException.excepcio();
		fail("ha de fallar perquè hi ha excepcio");
		}catch (IndexOutOfBoundsException e) {
			assertTrue(e.getMessage(), true);
		
		}
		
	}
	

}
