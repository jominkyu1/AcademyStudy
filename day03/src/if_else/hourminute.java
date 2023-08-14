package if_else;

import java.util.Scanner;

public class hourminute {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hour=0;
		int minute=0;
		
		System.out.print("몇시?: ");
		hour = input.nextInt();
		System.out.print("몇분?: ");
		minute = input.nextInt();
		
		if(hour>24 || hour<0 || minute>=60 || minute<0)
		{ //45분빼기
			System.out.println("잘못된 입력값");
		}
		else 
		{
			minute -= 45;
			if(minute < 0)
			{
				minute += 60;
				hour--;
			}
			if(hour == 24) hour = 0;
			
			//오전오후구분
			if(hour>12) 
			{
				hour -= 12;
				System.out.println("오후 " + hour + "시 " + minute + "분");
			}
			else System.out.println("오전 " + hour + "시 " + minute + "분");
		}
	}
}