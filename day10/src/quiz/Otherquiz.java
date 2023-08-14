package quiz;

import java.util.Scanner;

class reverse{
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		sc.close();
		return num;
	}
	public String calcNum(int a) {
		String calcReverse="Reverse: ";
		while(a>0) {
			calcReverse += a%10;
			a /= 10;
		}
		return calcReverse;
	}
	public void printNum(String str) {
		System.out.println(str);
	}
}

public class Otherquiz {
	public static void main(String[] args) {
		//숫자를 입력받아 역수로 출력
		reverse r = new reverse();
		
		int baseNum = r.inputNum();
		String str = r.calcNum(baseNum);
		r.printNum(str);
	}
}
