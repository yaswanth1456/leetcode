package exceptionHandling;

import java.util.Arrays;
import java.util.HashMap;

public class BookGroup {
	static int[] rawData={2,4,3,6,4,4,3,4};
	static int[][] FinalDataArray=bookGroupFinder(8, mapretriver(rawData));
	public static int[][] bookGroupFinder(int i, HashMap<Integer, Integer> booksholder,int [] rawData) {
		int array1[] = rawData;
		int Firstmaxgroups = i;
		int Secondmax_books = i;
		HashMap<Integer, Integer> datamap=new HashMap<Integer, Integer>();
		datamap=booksholder;
		int finalGroups[][] = new int[Firstmaxgroups][Secondmax_books];
		for (int j = Firstmaxgroups; j < array1.length; j++) {
			for (int j2 = 0; j2 < array1.length; j2++) {
				if (datamap.get(array1[j2])>0) {
					finalGroups[Firstmaxgroups][Secondmax_books]=array1[j2];
					Secondmax_books++;
					datamap.put(datamap.get(array1[j2]), datamap.get(array1[j2]-1));
				}
			}Firstmaxgroups++;
		}

		return finalGroups;

	}

	public static HashMap<Integer, Integer> mapretriver(int[] arrayname) {
		int array1[] = arrayname;
		HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();
		for (int j = 0; j < array1.length; j++) {
			if (hmp.containsKey(array1[j])) {
				hmp.put(array1[j], hmp.get(array1[j] + 1));
			} else {
				hmp.put(array1[j], 1);
			}

		}
		return hmp;

	}
	public void ArrayLoopPrinter(int [][] data){
		
		System.out.println(Arrays.deepToString(data));
		
	}
	public static void main(String[] args) {
		
		BookGroup bgp = new  BookGroup();
		bgp.ArrayLoopPrinter(FinalDataArray);
	}
}
