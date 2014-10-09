package gitau634969;

import org.junit.*;
import junit.framework.TestCase;


public class _Lesson2Test extends TestCase {
	/*@Test 
		public void testAddition(){
		assertEquals(7, Lesson2Triangle.add(2, 5));
	}
	public void testDoubleMultiplication(){
		assertEquals(100.0, Lesson2Triangle.multiply(10.00,10.00));
		
	}*/
	@Test
	public void testAreaOfATriangle(){
		Lesson2Triangle tri = new Lesson2Triangle(5.0, 6.0);
		assertEquals(15.0, tri.area(5.0,6.0));
		
	}

}
