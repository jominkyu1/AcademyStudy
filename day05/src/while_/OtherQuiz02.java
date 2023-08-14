package while_;

import java.util.Scanner;

public class OtherQuiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int total = 0;
		
		//입력받은 수 모두 더하기
		while(num!=0)
		{
			System.out.println("입력: ");
			num = sc.nextInt();
			
			total += num;
		}
		System.out.println("총 합: "+total);
		sc.close();
	}

}
