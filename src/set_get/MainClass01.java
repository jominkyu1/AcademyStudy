package set_get;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		MainClass01_Method mem = new MainClass01_Method();
		Scanner sc = new Scanner(System.in);
		String name=null, addr=null;
		int age=0, num=0;
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 종료");
			System.out.print(">>>: ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				mem.input();
				//set (private 인스턴스 변수 접근)
				mem.setAge(27);
				break;
			case 2:
				mem.print();
				//get 
				System.out.print("GET>>>>");
				System.out.println(mem.getAge());
				break;
			case 3:
				System.out.println("종료합니다.");
				return;
			}
		}
	}
}
