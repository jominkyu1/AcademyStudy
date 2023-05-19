package if_else;

import java.util.Scanner;

public class BingJava {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		  boolean start;

		  System.out.print("시작 하시겠습니까?(true/false): ");

		  start = input.nextBoolean();

		  if (start) {
		   int num1, num2;

		   System.out.print("첫번째 65~122까지의 문자를 입력하세요.: ");
		   num1 = input.nextInt();

		   System.out.print("두번째 65~122까지의 문자를 입력하세요.: ");
		   num2 = input.nextInt();

		   if (num1 >= 65 && num1 <= 122 && num2 >= 65 && num2 <= 122) {
		    System.out.println("결과: " + (char)num1 + (char)num2);
		   } else {
		    System.out.println("올바른 범위의 문자를 입력하세요.");
		   }
		  } else {
		   System.out.println("종료");
		  }

		  input.close();
	}
}
