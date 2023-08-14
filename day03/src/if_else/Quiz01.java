package if_else;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/* 정수를 입력받아 아래와 같이 출력
		 * 3, 4의 배수입니다
		 * 3의 배수
		 * 4의 배수
		 * 배수 아님
		 * 0은 잘못입력
		 */
		Scanner input = new Scanner(System.in);
		int num=0;
		
		System.out.print("수를 입력하세요.: ");
		num = input.nextInt();
		
		if(num == 0)
		{
			System.out.println("잘못 입력");
		}
		else if(num%3 == 0 && num%4 == 0)
		{
			System.out.println("3과 4의 배수입니다.");
		}
		else if(num%3 == 0)
		{
			System.out.println("3의 배수입니다.");
		}
		else if(num%4 == 0)
		{
			System.out.println("4의 배수입니다.");
		}
		else
		{
			System.out.println("3과 4의 배수가 아닙니다.");
		}

	}
}
