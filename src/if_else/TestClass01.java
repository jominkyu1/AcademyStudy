package if_else;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =0;
		
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		if(num % 3 == 0)
		{
			System.out.println("3의 배수");
		}else
		{
			System.out.println("3의 배수 아님.");
		}		
		/////////////////////////////////////
		
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		if(num > 0 && num < 100)
		{
			System.out.println("정상");
		}
		else
		{
			System.out.println("비정상");
		}
	}
}