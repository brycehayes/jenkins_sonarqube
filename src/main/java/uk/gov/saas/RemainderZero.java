package uk.gov.saas;

public class RemainderZero {

	//private int x;
	//private int y;
	private int remainder;
	
	
	public int findRemainder(int a, int b) {
		return a % b;
	};
	
	
	public boolean checkRemainderIsZero(int x, int y) {
		remainder = findRemainder(x, y);
		if(remainder == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
