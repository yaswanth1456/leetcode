package exceptionHandling;

public class VoterVerification {
public void namo(){
	int i=19;
if (i<=19) {
	try {
		throw new  NotEligibleVoter("hjgf");
		
	} catch (NotEligibleVoter e) {
		System.out.println("from catch block");
		// TODO: handle exception
	}
	//throw new NotEligibleVoter("please wait for 1 year");
	
}
} public static void main(String[] args) {
	VoterVerification vf = new VoterVerification();
	vf.namo();
}
}
