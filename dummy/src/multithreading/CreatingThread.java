package multithreading;

public class CreatingThread extends Thread {

public void run(){
	
	System.out.println("inside run method");
}



public static void main(String[] args) {
	CreatingThread ct = new CreatingThread();
	CreatingThread ct1 = new CreatingThread();
	ct.start();
	System.out.println(ct);
	ct1.start();
}

}
