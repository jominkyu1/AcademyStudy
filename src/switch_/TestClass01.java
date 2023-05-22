package switch_;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		/* 처리속도가 if문보다 빠름
		 switch(값){
		 	case 1: 문장, break;
		 	case 2: 문장, break;
		 	case 3: 문장, break;
		 	default: 문장 (=else)
		 }
		 */
		Scanner sc = new Scanner(System.in);
		int num =0;
		
		System.out.print("수 입력: ");
		num = sc.nextInt();
		
		
		
		
		switch(num) {
		case 1: System.out.println("1입력"); break;
		case 2: System.out.println("2입력"); break;
		default: System.out.println("그 외의 값");
		}
		
		System.out.println("다음 문장");
	}
}
