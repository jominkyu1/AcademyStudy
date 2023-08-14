package for_;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("반복할 횟수?: ");
		num = sc.nextInt();
		
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=0; i<=num;i++ ) {
			System.out.println(i+"번 반복");
			sum += i;
			
			if(i%2 == 0) {
				evenSum += i;
			}else {
				oddSum += i;
			}
		}
		
		
		
		System.out.printf("1~%d까지\n", num);
		System.out.println("짝수 합: " + evenSum);
		System.out.println("홀수 합: " + oddSum);
		System.out.println("총합: " + sum);
		
	}
}
