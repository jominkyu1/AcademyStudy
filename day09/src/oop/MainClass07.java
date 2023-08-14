package oop;

import java.util.Scanner;

class TestClass07{
	public int[] inputNum() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("첫번째 수 입력: ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 입력: ");
		num2 = sc.nextInt();
		int[] arr = {num1, num2};
		return arr;
	}
	
	public int test(int[] arr) {
		int sum=0;
		sum=arr[0]+arr[1];
		return sum;
	}
	public void printNum(int[] arr, int result) {
		System.out.printf("%d+%d=%d", arr[0], arr[1], result);
	}
}

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		
		int[] a = t.inputNum();
		int b = t.test(a);
		t.printNum(a, b);
	}
}
