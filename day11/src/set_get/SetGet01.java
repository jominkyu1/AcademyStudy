package set_get;

import java.util.Scanner;

public class SetGet01 {
	
	public void setName() {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SetGet01_Method member = new SetGet01_Method();
		String name=null;
		String addr=null;
		int age=0;
		
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("주소: ");
		addr = sc.next();
		System.out.print("나이: ");
		age = sc.nextInt();
		
		System.out.println("===Set/Get===");
		
		//set (private 인스턴수변수에 값 전달)
		member.setName(name);
		member.setAddr(addr);
		member.setAge(age);
		
		//get (private 인스턴스변수로부터 값 가져오기)
		System.out.println(member.getName());
		System.out.println(member.getAddr());
		System.out.println(member.getAge());
	}
}
