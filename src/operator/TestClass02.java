package operator;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		String s = (num%2 == 0) ? "짝수" : "홀수"; //삼항연산자
		System.out.println(num + " -> " + s);
		
		//입력한 수가 3의 배수인지 구분하기
		System.out.print("3의 배수 확인: ");
		num = input.nextInt();
		
		String c = (num%3 == 0) ? "3의 배수" : "3의 배수 아님";
		System.out.println(num + "은 " + c);
	}
}
