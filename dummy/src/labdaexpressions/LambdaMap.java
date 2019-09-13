package labdaexpressions;

import java.util.HashMap;

public class LambdaMap {
public void lambdaOnHashMap(){
	HashMap<Integer, String> hmp= new HashMap<Integer, String>();
	hmp.put(1, "demo");
	hmp.put(2,"hello");
	hmp.put(3,"jemo");
	hmp.put(77,"demon");
	hmp.put(45,"semon");
	hmp.put(767,"qwerty");
	hmp.entrySet().forEach(entry ->{
		 System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	});
	
	
	
}
public static void main(String[] args) {
	LambdaMap lmp = new LambdaMap();
	lmp.lambdaOnHashMap();
}
}
