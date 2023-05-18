package if_;

import java.util.Scanner;
//정수를 입력받고 음수면 음수, 0이면 0, 양수면 양수로 출력하고 짝수 홀수 여부 출력 
public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.print("숫자: ");
		num = input.nextInt();
		
		if (num > 0 && num%2 == 0 ) System.out.println("양수, 짝수");
		if (num > 0 && num%2 != 0 ) System.out.println("양수, 홀수");
		if (num < 0) System.out.println("음수");
		if (num == 0) System.out.println("0");
	}
}
