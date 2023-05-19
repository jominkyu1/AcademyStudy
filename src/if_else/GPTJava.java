package if_else;

import java.util.Scanner;

public class GPTJava {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        String start;

	        System.out.print("시작 하시겠습니까.?(Y/N): ");
	        start = input.next();

	        if (start.equalsIgnoreCase("Y")) {
	            int num1, num2;

	            System.out.print("첫번째 65~122까지의 숫자를 입력하세요.: ");
	            num1 = getInputInRange(input, 65, 122);

	            System.out.print("두번째 65~122까지의 숫자를 입력하세요.: ");
	            num2 = getInputInRange(input, 65, 122);

	            System.out.println("결과: " + (char) num1 + (char) num2);
	        } else {
	            System.out.println("종료");
	        }
	    }

	    private static int getInputInRange(Scanner input, int min, int max) {
	        int num = input.nextInt();
	        while (num < min || num > max) {
	            System.out.println("올바른 범위의 숫자를 입력하세요.");
	            num = input.nextInt();
	        }
	        return num;
	    }
	    
}
