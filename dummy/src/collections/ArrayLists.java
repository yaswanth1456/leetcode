package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {
	public void arrayListExample() {
		ArrayList alt = new ArrayList();
		alt.add("demo");
		alt.add(2);
		alt.add(1);
		alt.add("1a");
		alt.add("sa");
		alt.add("d");
		alt.add("d1");
		alt.add("a");
		alt.add(null);

		alt.add(null);
		
	}
	public void linkedLister(){
		LinkedList lid = new LinkedList();
		lid.add(null);
		lid.add(null);
		lid.add("demo");
		lid.add("z");
		lid.add("1z");
		lid.add("2z");
		lid.add(1);
		lid.add("3z");
		lid.add(3);
		lid.remove(1);

	
	
	}


	public static void main(String[] args) {
		ArrayLists al = new ArrayLists();
		al.linkedLister();

	}
}
