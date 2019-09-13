package exceptionHandling;

import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveDupsLinkedList {
	int llsize = 2;

	public ArrayList<Integer> dupRemover() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		ArrayList<Integer> al = new ArrayList<>();

		list.add(2);
		list.add(2);
		list.add(2);
		list.add(21);
		list.add(21);
		list.add(121);
		list.add(121);
		list.add(122);
		list.add(122);
		list.add(222);
		list.add(232);
		//int temp = list.get(1);
		for (int i = 1; i <= list.size()-1; i++) {
			if (list.get(i-1) == list.get(i)) {
				continue;
			} else {
				al.add(list.get(i));
			}

		}
		return al;

	}
	

	public static void main(String[] args) {
		RemoveDupsLinkedList rmd = new RemoveDupsLinkedList();
		System.out.println(rmd.dupRemover());
	}
}
