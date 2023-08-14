package while_;

import java.util.Scanner;

public class OtherQuiz09 {
	public static void main(String[] args) {
		//X그리기
		Scanner sc = new Scanner(System.in);
		int num=0;
		int indexL=0;
		
		System.out.print("입력: ");
		num = sc.nextInt();
		
		int indexR = num-1;
		
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(indexL == j || indexR == j) System.out.print("X ");
				else System.out.print("O ");
			}
			
			indexL++;
			indexR--;
			System.out.println();
		}
	}
}
