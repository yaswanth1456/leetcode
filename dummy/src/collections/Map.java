package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;

public class Map {
public void hashmapper(){
	HashMap hmp = new HashMap();
	hmp.put(1, "201");
	hmp.put(2, "202");
	hmp.put(3, "203");
	hmp.put(4, "204");
	hmp.put(5, "205");
	//System.out.println(hmp.size());
	HashSet hsst= hmp.entrySet();
 HashSet hst= hmp.keySet();
 for (int i = 0; i < hst.size(); i++) {
	 System.out.println(hst);
	
}
	System.out.println(hmp.containsValue(205));
}
public void linkedhashmapper(){
	HashMap hmp = new HashMap();
	
}
public void treemapper(){
	TreeMap tmp = new TreeMap<>();
	
}
public void hashtable(){
	Hashtable hst = new Hashtable<>();
	hst.put(1, null);
}
public static void main(String[] args) {
	Map mp = new Map();
	mp.hashmapper();
	
}
}
