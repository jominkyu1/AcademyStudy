package if_else;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		String s1, s2;
		Scanner input = new Scanner(System.in);
		System.out.print("첫 문자열 입력: ");
		s1 = input.next();
		
		System.out.print("두 문자열 입력: ");
		s2 = input.next();
		
		if (s1.equals(s2)) //문자열 내용비교는 ==대신 equals (true or false 반환)
		{
			System.out.println("s1과 s2는 같다");
		}
		else
		{
			System.out.println("s1과 s2는 같지않다.");
		}
		System.out.println("다음 문장");
	}
}
