package switch_;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = new String();
		
		System.out.print("문자열 입력: ");
		msg = sc.next();
		
		switch(msg){
			case "안녕": System.out.println("안녕 입력"); break;
			case "하세요": System.out.println(msg + " 입력"); //마지막 break 생략가능
			//default 생략가능
		}
		
		System.out.println("다음 문장");
	}
}
