package set_get;

import java.util.Scanner;

public class MainClass01_Method {
	Scanner sc = new Scanner(System.in);
	private String name, addr;
	private int age;
	
	public void input() {
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("주소: ");
		addr = sc.next();
		System.out.print("나이: ");
		age = sc.nextInt();
	}
	
	public void print() {
		System.out.println("이름: "+name);
		System.out.println("주소: "+addr);
		System.out.println("나이: "+age);
	}
	//set
	public void setAge(int a) {
		age=a;
	}
	//get
	public int getAge() {
		return age;
	}
}
