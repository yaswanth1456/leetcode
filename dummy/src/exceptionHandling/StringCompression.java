package exceptionHandling;

import java.util.ArrayList;

public class StringCompression {
	String inputString = "aaaavvrrrrdfffffsdss";
	char[] ArrayString = inputString.toCharArray();
	int counter = 1;
	char temp;
	int i;
	ArrayList al = new ArrayList<>();
	int length = ArrayString.length;
	boolean value = i < ArrayString.length;

	public ArrayList comprees() {

		while (i <= ArrayString.length - 10) {
			for (i = 0; i < ArrayString.length; i++) {
				temp = ArrayString[i];
				if (ArrayString[i] == ArrayString[i + 1]) {
					counter = counter + 1;

				}

				else if (!((ArrayString[i]) == ArrayString[i + 1])) {
					al.add(temp);
					al.add(counter);
					counter = 1;

				}
			}

		}

		return al;

	}

	public static void main(String[] args) {
		StringCompression scpr = new StringCompression();
		System.out.println(scpr.comprees());
	}
}
