package while_;

import java.util.Scanner;

public class OtherQuiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0, i =0;
		
		System.out.print("입력: ");
		num = sc.nextInt();
		
		while(i<num)
		{
			for(int j=i+1;j<=num;j++)
			{
				System.out.print(j + " ");
			}
			
			for(int k=0;k<i;k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
			i++;
		}
	}
}
