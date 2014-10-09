package gitau634969;

import static org.junit.Assert.*;

import org.junit.Test;

public class _Lesson3Test {

	@Test
	public void testLargestOfThreeNumbers() {
		Lesson3 maxOf3Ints = new Lesson3(1,2);
		assertEquals(15, maxOf3Ints.largestValue(10, 12, 15));
	}
	public void multipleOfTwoTest(){
		Lesson3 even = new Lesson3(1,2);
		assertTrue("The number is even!!", even.multipleOfTwo(10));
	}
}
