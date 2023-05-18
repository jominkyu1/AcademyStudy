package if_;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =0;
		
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		if (num%2 == 0) System.out.println(num+ "은 짝수");
		if (num%2 != 0) System.out.println(num+ "은 홀수");
		
		System.out.println("다음 문장들 실행");
	}
}
