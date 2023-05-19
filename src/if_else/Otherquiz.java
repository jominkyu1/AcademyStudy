package if_else;

import java.util.Scanner;

public class Otherquiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String start;
		
		System.out.print("시작 하시겠습니까.?(Y/N): ");
		int num1,num2;
		start = input.next();
		
		
		if(start.equals("Y"))
		{ //65~122 아스키
			System.out.print("첫번째 65~122까지의 숫자를 입력하세요.: ");
			num1 = input.nextInt();
			if(num1 < 65 || num1 > 122) System.out.println("올바른 범위의 숫자를 입력하세요.");
			else 	
			{
				System.out.print("두번째 65~122까지의 숫자를 입력하세요.: ");
				num2 = input.nextInt();
					if(num2 < 65 || num2 > 122) System.out.println("올바른 범위의 숫자를 입력하세요.");
					else 
					{
						System.out.println("결과: " + (char)num1 + (char)num2);
					}
			}
		}
		else
		{
			System.out.println("종료");
		}
		
	}
}
