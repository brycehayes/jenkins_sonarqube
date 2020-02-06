package uk.gov.saas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.*;


public class MathsProblemTest {

	
	@Test
	public void test_addition_gives_correct_result() {
		MathsProblem mathsProblem = new MathsProblem();
		int sum = 0;
		
		sum = mathsProblem.add(3, 5);
		
		assertEquals("The add method returned an incorrect value", 8, sum);
	}
}
