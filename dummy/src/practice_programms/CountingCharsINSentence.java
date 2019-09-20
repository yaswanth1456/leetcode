package practice_programms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountingCharsINSentence {
	String Sentence="hello couunting chars in sentence is easy";
	//this is trail fro sake of rebase
	
	public HashMap<Character,Integer> countCharsInSentence(){
		LinkedHashMap<Character,Integer> hmp = new LinkedHashMap<Character,Integer>();
		for (int i = 0; i < Sentence.length(); i++) {
			if (hmp.containsKey(Sentence.charAt(i))) {
			
				hmp.put(Sentence.charAt(i), hmp.get(Sentence.charAt(i))+1);
				
			}
			else {
				hmp.put(Sentence.charAt(i),1);
				//System.out.println(Sentence.charAt(i));
			}
			System.out.println(hmp);
		}
	return hmp;
	}
public static void main(String[] args) {
	CountingCharsINSentence ccis = new CountingCharsINSentence();
		ccis.countCharsInSentence();
}
}
