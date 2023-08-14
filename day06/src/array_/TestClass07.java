package array_;

import java.util.Scanner;

public class TestClass07 {
	public static void main(String[] args) {
		//짝수 입력시: index가 짝수번째인 값 출력(0,2,4) 10, 13, 25
		//홀수 입력시 홀수번째				(1,3,5) 54, 17, 30
		Scanner sc = new Scanner(System.in);
		String odd_even = null;
		int[] arr = new int[] {10, 54, 13, 17, 25, 30};
		
		System.out.print("홀수, 짝수: ");
		odd_even = sc.next();
		/*
		if(odd_even.equals("짝수")) {
			for(int i=0; i<arr.length; i+=2) System.out.println(i + "인덱스: " + arr[i]);
		}else {
			for(int i=1; i<arr.length; i+=2) System.out.println(i + "인덱스: " + arr[i]);
		}
		*/
		
		int i = odd_even.equals("짝수")? 0 : 1;
		
		for(; i<arr.length; i+=2) System.out.println(arr[i]);
	}
}