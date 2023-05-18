package input;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.print("이름 입력: ");
		name = sc.next();
		System.out.print("나이 입력: ");
		age = sc.nextInt();
		
		
		System.out.println("당신의 이름은 " + name + "이며");
		System.out.println("나이는 " + age + "살 이군요");
	}
}
