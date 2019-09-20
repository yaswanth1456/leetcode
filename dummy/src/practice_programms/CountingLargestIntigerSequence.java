package practice_programms;

public class CountingLargestIntigerSequence {
	int counter;
	int sum;
	int a,b,j;
	int max;
	int[] array = new int[] { 2, 4, -13, 6, 7, 88, 3 };

	public void sequenceCounting() {
		for (int i = 0; i < array.length - 1; i++) {
			counter++;
			//for sake of branch

				for (j = i; j <= counter; j++) {
					sum = sum + array[j];
					System.out.println(array[j]);
						}
				if (sum>max) {
                  max=sum;
                	a=i;
                	b=j;
                	
				}
				System.out.println("sum"+ sum+" "+max);
			}
		

	}
	public static void main(String[] args) {
		CountingLargestIntigerSequence cl = new CountingLargestIntigerSequence();
		cl.sequenceCounting();
	}
}
