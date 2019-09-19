package codility;

public class IncreasingSequences {
	public int solution(int[] A, int[] B) {
		int swapa, swapb;
		int counter = 0;
		
		for (int i = 1; i < B.length-1; i++) {
			if(((A[i] <=A[i - 1])&(A[i] >B[i - 1]))&((B[i] < A[i + 1]) & (B[i] > A[i - 1]))) {
			
					swapa = A[i];
					swapb = B[i];
					A[i] = swapb;
					B[i] = swapa;
					counter++;

				
			}
		}
		for (int j = 1; j < B.length-1; j++) {
			if(A[j]<A[j-1]){
				 if (((A[j]<A[j-1])|(A[j]>B[j-1]))&((B[j]<=A[j+1])|(A[j]>B[j-1])))
				//(A[i] < A[i - 1] & B[i] > A[i + 1]) 
				{
					counter=-1;
					
				}}
		}
	 
			
		

		return counter;

	}

	public static void main(String[] args) {
		IncreasingSequences ims = new IncreasingSequences();
		int[] A = { 1,5,6 };
		int[] B = {-2,0,-2};

		System.out.println(ims.solution(A, B));
	}
}
