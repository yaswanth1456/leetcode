package practice_programms;

public class ReverseIntiger {
	int number=123456789;
	String Parsednumber=Integer.toString(number);
	String Reversedstring="";
	int output;
	public int reverseIntiger(){
		for (int i = Parsednumber.length()-1; i >=0; i--) {
			Reversedstring=Reversedstring+Parsednumber.charAt(i);
			
			
		}
		
		//System.out.print(Reversedstring);
		output=Integer.parseInt(Reversedstring);
		return output;
	}
public static void main(String[] args) {
	ReverseIntiger pi = new ReverseIntiger();
	System.out.println(pi.reverseIntiger());
}

}
