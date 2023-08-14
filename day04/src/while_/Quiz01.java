package while_;

import java.util.Scanner;

import com.sun.tools.javac.Main;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = 0;
		
		stest();
		System.out.print("일: ");
		day = sc.nextInt();
		
		
		while(day>7) {
			day -= 7;
			}
		
		switch(day){ // or (day%7)
		case 1: System.out.print("월요일입니다"); break;
		case 2: System.out.print("화요일입니다"); break;
		case 3: System.out.print("수요일입니다"); break;
		case 4: System.out.print("목요일입니다"); break;
		case 5: System.out.print("금요일입니다"); break;
		case 6: System.out.print("토요일입니다"); break;
		case 7: System.out.print("일요일입니다"); break;
		}
	}
	public static void stest() {
		System.out.println("TEST");
	}
}

