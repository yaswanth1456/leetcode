package practice_programms;

public class ReverseSentence {
	String s="this has to reversed by coding in java";
public void reverseSentence(){
	for (int i =s.length()-1; i >=0 ; i--) {
		System.out.print(s.charAt(i));
	}
}
public static void main(String[] args) {
	ReverseSentence rs = new ReverseSentence();
	rs.reverseSentence();
}
}
