package input;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수 선언시 초기화
		String name = null;
		int avg = 0;
		int scoreK = 0;
		int scoreE = 0;
		int scoreM = 0;
		
		System.out.print("당신의 이름은 무엇입니까?: ");
		name = sc.next();
		
		System.out.print(name + "님의 국어 점수는?: ");
		scoreK = sc.nextInt();
		
		System.out.print(name + "님의 영어 점수는?: ");
		scoreE = sc.nextInt();
		
		System.out.print(name + "님의 수학 점수는?: ");
		scoreM = sc.nextInt();
		
		avg = scoreK + scoreE + scoreM;
		
		System.out.println("=======================");
		System.out.println("이 름 :\t" + name);
		System.out.println("=======================");
		System.out.println("국 어 :\t" + scoreK);
		System.out.println("영 어 :\t" + scoreE);
		System.out.println("수 학 :\t" + scoreM);
		System.out.println("=======================");
		System.out.println("합 계 :\t" + avg);
		System.out.println("평 균 :\t" + avg/3);
		System.out.println("=======================");
	}
}
