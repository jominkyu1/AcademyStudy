package while_;

import java.util.Scanner;

public class TestClass04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		
		while(true)
		{
			System.out.print("10~20사이 입력: ");
			num = sc.nextInt();
			
			if(num<10 || num>20) 
			{
				System.out.println("다시 입력..");
				continue;
			}
			break;
		}
		System.out.println("num: "+num);
		///////////////////////////////////////////
		
		while(true)
		{
			System.out.print("10~20사이 입력: ");
			num = sc.nextInt();
			
			if(num>=10 && num<=20) 
			{
				break;
			}
			System.out.println("다시 입력..");
		}
		System.out.println("num: "+num);
	}
}
