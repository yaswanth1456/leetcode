package practice_programms;

public class SwappingNumbers {
	int x=20;int y=10;
public void NumberSwapper(){
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("x="+x +" and y="+y);
}
public static void main(String[] args) {
	SwappingNumbers swp = new SwappingNumbers();
	swp.NumberSwapper();
}
}
