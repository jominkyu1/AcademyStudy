package while_;

import java.util.Scanner;

public class OtherQuiz09 {
	public static void main(String[] args) {
		//X그리기
		Scanner sc = new Scanner(System.in);
		int num=9;
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==j || j==num-i-1) System.out.print("X ");
				else System.out.print("O ");
			}
			System.out.println();
		}
	}
}
