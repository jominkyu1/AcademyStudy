package while_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String home ="";
		String work = null;
		
		while(true) {
		System.out.println("1. 우리집 등록");
		System.out.println("2. 회사 등록");
		System.out.println("3. 등록 보기");
		
		i = sc.nextInt();
		
		switch(i) {
		case 1:
			System.out.print("입력: ");
			home = sc.next();
			break;
		case 2:
			System.out.print("입력: ");
			work = sc.next();
			break;
		case 3:
			System.out.printf("우리집: %s\n회사: %s\n", home, work);
			break;
		}
	   }
	}
}
