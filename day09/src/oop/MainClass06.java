package oop;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		t.test1(10, "안녕", 1.1);
		System.out.println("===========test2");
		ArrayList<String> arr = new ArrayList<>();
		arr.add("안녕"); arr.add("하세요");
		t.test2(arr);
		System.out.println("===========test3");
		t.test3(2);
		System.out.println("===========test4");
		int s = t.test4();
		System.out.println(s);
		System.out.println("===========test5");
		System.out.println(Arrays.toString(t.test5()));
		///////////////////////
		System.out.println("===========Parseint");
		String ss = "150";
		System.out.println(ss + 100);
		System.out.println(Integer.parseInt(ss) + 100);
		
	}
}
