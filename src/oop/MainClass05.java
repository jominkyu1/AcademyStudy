package oop;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		//참조형 변수 생성(참조대상은 객체)
		TestClass05 t = new TestClass05();
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자 입력: ");
		num = sc.nextInt();
		
		t.sumFunc(num);// 인자전달(arguments)
		
		int s = t.sumFunc2(num, 0);
		System.out.printf("1부터 %d까지의 합: %d", num, s);
	}
}
