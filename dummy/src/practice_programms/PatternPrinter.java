package practice_programms;

public class PatternPrinter {
	int counter;int anticounter=10;
public void Printerstar(){
	for (int i = 0; i <anticounter; i++) {
		
	
	for (int j = i; j < anticounter; j++) {
		System.out.print("*");
	}
	anticounter--;
	System.out.println(" ");
	}
}
public static void main(String[] args) {
	PatternPrinter pp = new PatternPrinter();
	pp.Printerstar();
}
}
