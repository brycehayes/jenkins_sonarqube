package uk.gov.saas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemainderZeroTest {

	public RemainderZero remZero = new RemainderZero();
	
	@Test
	public void remainder_should_be_zero() {
		
		int x = 12;
		int y = 4;
		boolean remainderZero;
		
		remainderZero = remZero.checkRemainderIsZero(x, y);
		
		assertEquals("The remainder is zero.", true, remainderZero);
	}
	
	@Test
	public void remainder_should_be_nonzero() {
		int i = 13;
		int j = 5;
		int result;
		
		result = remZero.findRemainder(i, j);
		
		assertEquals("The remainder is non-zero.", 2, result);
		
	}
}
