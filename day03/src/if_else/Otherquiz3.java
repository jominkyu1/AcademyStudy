package if_else;

import java.util.Scanner;

public class Otherquiz3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 =0;
		int num2 =0;;
		
		System.out.println("1. 아메리카노 2. 라떼 3. 아이스티");
		num1 = input.nextInt();
		
		if (num1==1)
		{
			System.out.println("1. 핫 2. 아이스");
			num2 = input.nextInt();
			
			if(num2==1) System.out.println("따뜻한 아메리카노 나왔습니다.");
			if(num2==2) System.out.println("아이스 아메리카노 나왔습니다.");
		}
		
		if (num1==2)
		{
			System.out.println("1. 핫 2. 아이스");
			num2 = input.nextInt();
			
			if(num2==1) System.out.println("따뜻한 라떼 나왔습니다.");
			if(num2==2) System.out.println("아이스 라떼 나왔습니다.");
		}
		
		if (num1==3)
		{
			System.out.println("1. 핫 2. 아이스");
			num2 = input.nextInt();
			
			if(num2==1) System.out.println("따뜻한 아이스티 나왔습니다.");
			if(num2==2) System.out.println("아이스 아이스티 나왔습니다.");
		}
	}
}
