package designpatterns;

public class SingleTonDesignPatterns {
	static int noOfObjects = 0;
private SingleTonDesignPatterns(){
	 noOfObjects += 1;
}

private static SingleTonDesignPatterns uniqueInstance = null;

public static SingleTonDesignPatterns getInstance(){
	if (uniqueInstance==null) {
		uniqueInstance= new SingleTonDesignPatterns();
	}
	return uniqueInstance;
	
	
}
public static void main(String[] args) {
	SingleTonDesignPatterns s1 = SingleTonDesignPatterns.getInstance();
	SingleTonDesignPatterns s2 = SingleTonDesignPatterns.getInstance();
	System.out.println(s1.hashCode()+"for s1"+noOfObjects);
	System.out.println(s2.hashCode()+"for s2   "+noOfObjects);
}

}
