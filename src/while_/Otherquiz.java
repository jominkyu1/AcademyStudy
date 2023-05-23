package while_;

import java.util.Scanner;

public class Otherquiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0, count =0;
		
		System.out.print("입력: ");
		num = sc.nextInt();
		//약수 구하기
		
		for(int i=2; i<num;i++) 
		{
			if(num%i==0) 
			{
				System.out.print(i+", "); 
				count++;
			}
		}
		System.out.printf("\n%d개", count);
	}

}
