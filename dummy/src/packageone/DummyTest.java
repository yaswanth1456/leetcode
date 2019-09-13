package packageone;

public class DummyTest {
	DummyTest(int i){
		super();
	}
	public void example(int i){
	
		System.out.println(i);
	}
public static void main(String[] args) {
	DummyTest dt = new DummyTest(0);
	DummyTest dt1 = new DummyTest(3);
	System.out.println(dt==dt1);
	System.out.println(dt.equals(dt1));
}
}
                                                                  