package labdaexpressions;

import java.util.TreeSet;

public class ArrayListSortingLambda {
	
	public void sorterMethod(){
		TreeSet<Integer> als = new TreeSet<Integer>((i1,i2)->(i1>i2)?1:(i1<i2)?-1:0);
		als.add(32);
		als.add(12);
		als.add(2);
		als.add(22);
		als.add(39);
		als.add(37);
		als.add(37);
		als.add(63);
		System.out.println("before sorting" +als);
	
	//als.forEach(value->System.out.println(value));
	als.forEach((Integer value)->System.out.print(value+" "));
	System.out.println(als);
	}
public static void main(String[] args) {
	ArrayListSortingLambda alst= new ArrayListSortingLambda();
	alst.sorterMethod();
}
}
