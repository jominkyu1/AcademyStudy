package if_else;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num =0;
		
		System.out.print("수 입력: ");
		num = input.nextInt();
		
		if(num > 0)
		{
			System.out.println("0보다 크다");
			if(num <100)
			{
				System.out.println("0보다 크고 100보다 작다.");
			}
			else
			{
				System.out.println("0과 100보다 크다.");
			}
		}
		else
		{
			System.out.println("0보다 작다");
		}
	}
}
