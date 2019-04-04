package exceptionHandling;

public class CountNumber {
	int number = 16;
	int repetetioncount = 0;

	char particularnumber = '1';
	String numb;

	public int numberarray() {
		for (int i = 0; i < number; i++) {
			numb = numb + i;

		}
		for (int j = 0; j < numb.length(); j++) {
			char dummy=numb.charAt(j);
			//System.out.println(numb.charAt(j));
			if (dummy ==particularnumber) {

				repetetioncount = repetetioncount + 1;
			} // numb.charAt(j));
		}

		return repetetioncount;

	}

	public static void main(String[] args) {
		CountNumber cnm = new CountNumber();
		System.out.println(cnm.numberarray());
	}
}
