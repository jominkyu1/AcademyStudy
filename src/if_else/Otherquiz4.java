package if_else;

import java.util.Scanner;

public class Otherquiz4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mymoney, mychoice, howmany, totalprice;
		
		System.out.println("1. 콜라(500원) 2. 사이다(700원) 3. 아이스티(1000원)");
		System.out.print("소유한 돈: ");
		mymoney = input.nextInt();
		
		if(mymoney<500) System.out.println("잔액이 부족합니다.");
		else
		{		
			System.out.print("주문 번호: ");
			mychoice = input.nextInt();
			if(mychoice==1) mychoice=500;
			else if(mychoice==2) mychoice=700;
			else if(mychoice==3) mychoice=1000;
			else mychoice =0;
		
			System.out.print("수량: ");
			howmany = input.nextInt();
		
			totalprice = mychoice*howmany;
		
			if(mymoney<totalprice) System.out.println((totalprice-mymoney) + "원이 부족합니다.");
			else if(totalprice == 0) System.out.println("잘못된 입력입니다.");
			else if(mymoney>=totalprice) System.out.println("총 주문금액은 " + totalprice + "원이며, 거스름돈은 " + (mymoney-totalprice) + "원입니다. ");
			else System.out.println("잘못된 입력입니다.");
		}
	}
}
