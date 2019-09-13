package collections;

import java.util.HashSet;

public class SetImplimentations {
public void hashSetExample(){
	HashSet hst = new HashSet();
	hst.add(null);
	hst.add(null);
	hst.add(null);
	hst.add(1);
	hst.add("1a");
	hst.add("z1");
	hst.add("x1");
	hst.add("1xx");
	hst.add("a");
	System.out.println(hst);
}
public void linkedHashSetExample(){}
public void treeSetExample(){}
public static void main(String[] args) {
	SetImplimentations sim = new SetImplimentations();
	sim.hashSetExample();
}
}
