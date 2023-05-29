package oop;

public class MainClass02 {
	public static void main(String[] args) {
		int a;
		TestClass02 num = new TestClass02();
		num.name = "홍길동";
		num.age = 17;
		
		System.out.println("이름: " + num.name);
		System.out.println("나이: " + num.age);
		
	}
}