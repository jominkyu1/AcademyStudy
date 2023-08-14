package quiz;

import java.util.Scanner;

class aValue{
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int a = sc.nextInt();
		sc.close();
		return a;
	}
	public void calcNum(int a) {
		if(a==0) System.out.println("0==0");
		else if(a>0) System.out.println("절대값: " + a);
		else if(a<0) {
			a = a-a-a;
			
			System.out.println("절대값: " + a);
		}
	}
}
public class Otherquiz3 {
	//절대값구하기(Absolute value)
	public static void main(String[] args) {
		aValue av = new aValue();
		
		int baseNum = av.inputNum();
		av.calcNum(baseNum);
	}
}
