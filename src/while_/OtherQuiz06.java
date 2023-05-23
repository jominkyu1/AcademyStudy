package while_;

import java.util.Scanner;

public class OtherQuiz06 {
	public static void main(String[] args) {
		//각 자릿수 총합
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		int sum = 0;
		
		System.out.print("입력: ");
		inputNum = sc.nextInt();
		
		while(inputNum>10)
		{
			sum += inputNum%10;
			inputNum /= 10;
		}
		
		sum += inputNum;
		System.out.println("총합: " + sum);
	}
}