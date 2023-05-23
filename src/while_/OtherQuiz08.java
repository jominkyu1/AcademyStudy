package while_;

import java.util.Scanner;

public class OtherQuiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("입력: "); //삼각형높이
		num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=1;j<num-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++) {
				System.out.print("★");
			}
			for(int j=0;j<i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
