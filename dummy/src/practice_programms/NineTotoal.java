package practice_programms;

import java.util.TreeMap;

public class NineTotoal {
	int sum,temp;
	int num,n;
	TreeMap tmp = new TreeMap<>();

public void IntigerTotals(){
	
	for (temp = 2007; temp < 3999; temp++) {
	          sum = 0;
	          num=temp;
	          
        while (num > 0) {
        	sum = sum + num % 10;
            num = num / 10;
           
        	
			
        }	
			
        if (sum>9) {
            
            while (num > 0) {
            	sum = sum + num % 10;
                num = num / 10;
               
    	}
	}
	
        
        System.out.println("Sum of Digits:"+sum);
	}
	
}

	public static void main(String[] args) {
		NineTotoal nt = new NineTotoal();
		nt.IntigerTotals();
	}
}
