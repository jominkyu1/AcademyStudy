package while_;

import java.util.Scanner;

public class OtherQuiz07 {
	public static void main(String[] args) {
		//숫자 맞추기
		Scanner sc = new Scanner(System.in);
		int randomNum = (int)(Math.random()*10);//Random함수
		int inputNum = 0, count = 0;
		
		System.out.print("시도 할 횟수?: ");
		count = sc.nextInt();
		
		while(true)
		{
			if(count==0) {
				System.out.println("횟수 초과.");
				break;
			}else {
				System.out.print("입력: ");
				inputNum = sc.nextInt();
			}
			if(inputNum == randomNum){
				System.out.println("정답"); break;
			}else if(inputNum < randomNum){
				System.out.println(inputNum + "보다 큼");
			}else {
				System.out.println(inputNum + "보다 작음");
			}
			count--;
		}
		
	}
}
