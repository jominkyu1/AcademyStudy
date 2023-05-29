package oop;

import java.util.Scanner;

/*
 * method : 어떠한 기능을 가지고 있는 것
 * - 소괄호가 있으면 대부분 어떠한 기능이라고 보면된다.
 * - method 이름은 변수 이름 만드는 방식과 동일
 * - 해당 기능의 내용과 부합한 이름으로 만든다.
 * - 합성어면 합성어의 첫 문자는 대문자 ex) sumFunction();
 * */
class TestClass04{
	public void test() {
		System.out.println("test 호출");
	}
	public void sumFunc() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자 입력: ");
		num = sc.nextInt();
		
		int sum=0;
		for (int i = 0; i <= num; i++) {
			sum+=i;
		}
		
		System.out.printf("1부터 %d까지의 합: %d", num, sum);
		sc.close();
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
		t.test();
		System.out.println("메인시작");
		t.sumFunc();
		System.out.println("\n메인종료");
	}
}
