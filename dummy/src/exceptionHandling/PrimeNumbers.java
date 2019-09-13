package exceptionHandling;

public class PrimeNumbers {
	int temp;

	public void primesPrint() {
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < i / 2; j++) {
				if (i % j == 0) {
					continue;

				} 
				else {
					System.out.println(i);
				}
			}

		}
		
		
	}

	public static void main(String[] args) {
		PrimeNumbers pn = new PrimeNumbers();
		pn.primesPrint();
	}
}
