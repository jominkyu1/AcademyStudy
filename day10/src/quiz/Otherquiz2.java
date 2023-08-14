package quiz;

import java.util.Scanner;

class primenumber{
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int a = sc.nextInt();
		sc.close();
		
		return a;
	}
	public void calcNum(int a) {
		int counter=0;
		
		for (int i = 1; i < a; i++) if(a%i==0) counter++;
		
		if(counter==1) System.out.println("소수(prime number)");
		else System.out.println("소수 아님");
	}
}

public class Otherquiz2 {
	public static void main(String[] args) {
		primenumber p = new primenumber();
		//소수계산
		int baseNum = p.inputNum();
		p.calcNum(baseNum);
	}
}
