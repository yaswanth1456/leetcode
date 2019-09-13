package practice_programms;

public class ReversingWordsInSentence {
	String s = "This sentence has to be reversed only words not sentence";
	String[] Words=s.split(" ");
	StringBuffer sb = new StringBuffer();
	public void wordReverser(){
		for (int i = 0; i < Words.length; i++) {
			 StringBuilder sb=new StringBuilder(Words[i]); 
			 System.out.print(sb.reverse());
			 System.out.print(" ");
			
		}
	}
public static void main(String[] args) {
	ReversingWordsInSentence rd = new ReversingWordsInSentence();
	rd.wordReverser();
}
}
