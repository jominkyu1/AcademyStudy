package while_;

import java.util.Scanner;

public class OtherQuiz03 {
	public static void main(String[] args) {
		//두 수 최대공약수
		Scanner sc = new Scanner(System.in);
		int num1 =0, num2 =0, result =0;
		
		
		System.out.print("첫번째 수: ");
		num1 = sc.nextInt();
		System.out.print("두번째 수: ");
		num2 = sc.nextInt();
		
		
		int minNum = (num1<num2)? num1 : num2;
		
		System.out.print("약수: ");
		for(int i=1;i<=minNum;i++)
		{
			if(num1%i == 0 && num2%i == 0)
			{
				System.out.print(i+", ");
				result = i;
			}
		}
		System.out.println("\n최대공약수: " + result);
		System.out.println("최소공배수: " + num1*num2/result);
		
	}
}
