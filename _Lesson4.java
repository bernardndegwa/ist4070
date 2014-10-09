package gitau634969;

import static org.junit.Assert.*;

import org.junit.Test;

public class _Lesson4 {

	@Test
	public void testOperations() {
		Lesson4 four  = new Lesson4();
		assertEquals("The total is: ", 4, four.add(2,2));
		assertEquals("The product is: ", 4, four.multiply(2,2));
		assertEquals("The divsion is: ", 1, four.divide(2,2), 0.1);
		
	}

}
