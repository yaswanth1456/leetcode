package exceptionHandling;

public class CommonStringSequence {
	String a = "abnbvcdr";
	String b = "acnbvcar";
	String longestString;
	String dummy;
	String dummy1;
	int lengthOfString;
	int q = 1;
	int w = 1;

	public void commonStringFinder() {
		for (int i = 0; i < a.length()-q; i++) {
			for (int j = 0; j < b.length()-w; j++) {
				dummy=a.substring(i, w);dummy1=a.substring(i, q);
if (((a.substring(i, w))==((b.substring(j, w)))&&(a.substring(i, q)).length()>lengthOfString)){
	
	longestString=(a.substring(i, q));
	lengthOfString=(a.substring(i, q)).length();
}
w++;
			}
			q++;
		}
	
	System.out.println(lengthOfString);}
	public static void main(String[] args) {
		CommonStringSequence cms = new CommonStringSequence();
		cms.commonStringFinder();
	}
}
