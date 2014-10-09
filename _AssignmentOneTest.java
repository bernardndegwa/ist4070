package gitau634969;

import static org.junit.Assert.*;

import org.junit.Test;

public class _AssignmentOneTest {

	@Test
	public void totalPayableBeforeTaxes() {
		AssignmentOne Person = new AssignmentOne("Danny", 40.0,17.5);
		assertEquals(700.0, Person.totalPayBeforeTaxesAndWithoutOvertime(40.0,17.5), 0.001);
	}

	

}
