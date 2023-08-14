package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestClass02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("1111");
		arr.add("2222");
		arr.add("3333");
		
		Iterator<String> it = arr.iterator();
		/*
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		*/
		
		while(it.hasNext()) System.out.println(it.next());
		
		HashSet<String> hs = new HashSet<>();
		hs.add("2222");
		hs.add("1111");
		hs.add("3333");
		hs.add("4444");
		System.out.println(hs);
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) System.out.println(i.next());
	}
}
