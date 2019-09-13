package exceptionHandling;

import java.util.HashMap;
import java.util.Map.Entry;
//hello world
public class CommonNumbers {
	String line = "hello bunny bunny bunny bunny bunny bunny bunny chinny bunny chinny chinny chinny chinny bunny hi hi";
	String bannedWords = "bunny";
	int maxvalue = 0;
	String Finalresult;
	HashMap<String, Integer> hmp = new HashMap<String, Integer>();
	String[] tempHolding = line.split(" ");

	public void countMaxWord() {
		for (int i = 0; i < tempHolding.length; i++) {
			if (!(tempHolding[i].equals(bannedWords))) {
				String temp = tempHolding[i];
				hmp.put(tempHolding[i], hmp.getOrDefault(tempHolding[i], 0) + 1);

			}

		}
		for (Entry<String, Integer> entry : hmp.entrySet()) {
			if (entry.getValue() > maxvalue) {
				Finalresult = entry.getKey();
				maxvalue = entry.getValue();
			}
		}
		System.out.println(Finalresult);
	}
	public static void main(String[] args) {
		CommonNumbers cnm = new CommonNumbers();
		cnm.countMaxWord();
		
	}
}
