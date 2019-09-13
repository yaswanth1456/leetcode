package multithreading;

public class CreatingThreadWithInterface implements Runnable {
	public void run() {
System.out.println("inside run");
	}

	public static void main(String[] args) {
		CreatingThreadWithInterface ct1 = new CreatingThreadWithInterface();
		Thread t = new Thread(ct1);
		t.start();
	
	}
}

	