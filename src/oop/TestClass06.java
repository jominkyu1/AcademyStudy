package oop;

import java.util.ArrayList;

public class TestClass06 {
	public void test1(int n, String s, double d){
		System.out.println("n: " + n);
		System.out.println("s: " + s);
		System.out.println("d: " + d);
	}
	
	public void test2(ArrayList<String> a) {
		System.out.println(a);
	}
	
	public void test3(int num) {
		if(num==1) {
			System.out.println("1111");
			return;
		}else if (num==2) {
			System.out.println("2222");
		}
		System.out.println("다음문장");
	}
	public int test4() {
		int num=0;
		if(num==0) {
			return 100;
		}else {
			System.out.println("다음문장");
			return 50;
		}
	}
	public int[] test5() {
		int[] num = {100, 200, 300};
		return num;
		
	}
}
