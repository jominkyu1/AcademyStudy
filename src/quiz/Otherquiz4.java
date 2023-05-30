package quiz;

import java.util.Scanner;

class mtp{
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int a = sc.nextInt();
		sc.close();
		return a;
	}
	public void calcNum(int x) {
		if(x==0) return;
		if(x%3==0) System.out.println("3의 배수");
		else System.out.println("3의 배수 아님");
	}
}
public class Otherquiz4 {
	//3의 배수인가?
	public static void main(String[] args) {
		mtp m = new mtp();
		int baseNum = m.inputNum();
		m.calcNum(baseNum);
	}
}
