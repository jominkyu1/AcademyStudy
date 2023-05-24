package array_;

import java.util.Scanner;

public class TestClass06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] {10, 54, 13, 17, 25, 30};
		
		String odd_even=null;
		System.out.print("짝수, 홀수 입력: ");
		odd_even = sc.next();
		
		
		switch(odd_even) {
		case "짝수":
			for(int i : arr) if(i%2==0) System.out.println("짝수: "+i);
			break;
		case "홀수":
			for(int i : arr) if(i%2!=0) System.out.println("홀수: "+i);
			break;
		}
		
	}
}
