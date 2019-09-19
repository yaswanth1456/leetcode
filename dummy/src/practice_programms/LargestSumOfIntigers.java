package practice_programms;

public class LargestSumOfIntigers {
	int []a= new int[]{1,23,-1,3,4,5,4};
public void dummyMethod() {
	for (int i = 0; i < a.length; i++) {
		for (int j = i; j <a.length ; j++) {
			System.out.print(a[j]+" ");	
		}
	System.out.println(" ");
	}
	for (int i = a.length; i >0; i--) {
		for (int j = i; j >0; j--) {
			System.out.print(a[j]+" ");	
		}
	System.out.println(" ");
	}
	
}
	
public static void main(String[] args) {
	LargestSumOfIntigers ls= new LargestSumOfIntigers();
	ls.dummyMethod();
}
}
