package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {
	public void hashmapper() {
		HashMap<String, Integer> hmp = new HashMap<String, Integer>();
		hmp.put("demo", 3);
		hmp.put("namo", 2);
		hmp.put("hero", 3);
		hmp.put("deva", 6);
		
		
		
			
		
		for (Entry<String, Integer> entry : hmp.entrySet()) {
			if (entry.getValue() >= 3) {
				//System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		}

	}

	public void linkedhashmapper() {
		HashMap hmp = new HashMap();

	}

	public void treemapper() {
		TreeMap tmp = new TreeMap<>();
		tmp.put(1, "namo");
		tmp.put(2, "demo");
		tmp.put(33, null);
	}

	public void hashtable() {
		Hashtable hst = new Hashtable<>();
		hst.put(1, "demo");
		hst.put(2, 3);
	}

	public static void main(String[] args) {
		Map mp = new Map();
		mp.hashmapper();

	}
}
