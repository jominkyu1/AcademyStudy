package for_;

import java.util.Scanner;

public class OtherQuiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxStar =0;
		
		System.out.print("중앙 별의 갯수?: ");
		maxStar = sc.nextInt();
		
		for(int i=0;i<maxStar;i++) 
		{
			for(int j=0;j<i+1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<maxStar-1;i++)
		{
			for(int j=0;j<(maxStar-1)-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
