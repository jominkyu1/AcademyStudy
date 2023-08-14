package for_;

import java.util.Scanner;

public class OtherQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxNum=0;
		int count=0;
		int allCount=0;
		
		System.out.print("숫자 입력: ");
		maxNum = sc.nextInt();
		System.out.println("=====");
		
		for(int i=2; i<=maxNum;i++) 
		{	//2~maxNum
			for(int j=2;j<=i;j++)
			{
				if(i%j==0) count++; //나머지가0이 나오면 count증가
			}
			if(count==1) //나머지가0이 나온숫자의 갯수가 1개(본인)밖에 없다면 출력
			{
				allCount++;
				System.out.print(i+ ", ");
			}
			count=0;
		}
		System.out.printf("\n=====\n총 %d개", allCount);
	}
}