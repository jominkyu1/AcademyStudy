package oop2;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1_method {
	public ArrayList<String> inputName() {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력: ");
		int i1 = sc.nextInt();
		arr.add(i1+"");
		System.out.print("두번째 숫자 입력: ");
		int i2 = sc.nextInt();
		arr.add(i2+"");
		System.out.print("세번째 숫자 입력: ");
		int i3 = sc.nextInt();
		arr.add(i3+"");
		
		
//		System.out.println(arr);
		
		return arr;
		
	}
	public void outputName(ArrayList<String> arr) {
		int i=0;
		
		for (int j = 0; j < arr.size(); j++) {
			i += Integer.parseInt(arr.get(j));
		}
		
		System.out.println(i);
	}
}
