package practice_programms;

public class FibanacciSeries {
	int   intArray[]= new int[110];
	  //sdd
public void fibbanaciGeneration(){
	
	intArray[0]=0;
	intArray[1]=1;
	intArray[2]=2;
	
	for (int i = 3; i < 100; i++) {
		intArray[i]=intArray[i-1]+intArray[i-2];
	}
	System.out.println(intArray);
	
	
	
}
public static void main(String[] args) {
	FibanacciSeries fb = new FibanacciSeries();
	fb.fibbanaciGeneration();
}
}
