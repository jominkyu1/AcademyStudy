package if_;

import java.util.Scanner;

///4조 문제
public class OtherQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int scoreK, scoreE, scoreM, result;
		float avg;
		String name;
		
		System.out.print("이름: ");
		name = input.next();
		
		System.out.print("국어: ");
		scoreK = input.nextInt();
		
		System.out.print("영어: ");
		scoreE = input.nextInt();
		
		System.out.print("수학: ");
		scoreM = input.nextInt();
		
		result = scoreK + scoreE + scoreM;
		avg = result/3;
		
		System.out.println(name + "님의 총 점수는 " + result + "점 입니다.");
		System.out.printf("평균점수: %.2f", avg);

	}
}
