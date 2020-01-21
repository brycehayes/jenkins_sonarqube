package uk.gov.saas;

public class RandomNumber {

	public static void main(String[] args) {
		
		int count = 1;
		double x;
		
		while(count <= 6) {
			count = count + 1;
			x = Math.random() * 60;
			int y = (int) x;
			System.out.println(y);
		}

	}

}
