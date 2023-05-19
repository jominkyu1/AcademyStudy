package if_else;

import java.util.Scanner;

public class Otherquiz2 {
	public static void main(String[] args) {
		//30분까지 5천원 이후 5분마다 1500원
		Scanner input = new Scanner(System.in);
		int num1; 
		int num2;
		
		System.out.println("말을 탈 시간?(분): ");
		num1 = input.nextInt();
		
		if (num1<=30) 
		{
			System.out.println("5천원");
		}
		else
		{
			num1 -= 30; 
			num2 = num1/5*1500 + 5000; //5분마다 1500원 + 5000원
			
			System.out.print(num2 + "원");
		}
	}
}
