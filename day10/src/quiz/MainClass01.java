package quiz;

import java.util.Scanner;

class Quiz01{
	public void print(String str) {
		System.out.println("당신 이름: " + str);
	}
	
	public String inputName() {
		Scanner sc = new Scanner(System.in);
		String name=null;
		
		System.out.print("이름 입력: ");
		name = sc.next();
		return name;
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		Quiz01 quiz = new Quiz01();
		String str = quiz.inputName();
		quiz.print(str);
	}
}
