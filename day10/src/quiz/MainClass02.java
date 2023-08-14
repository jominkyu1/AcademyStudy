package quiz;

import java.util.ArrayList;
import java.util.Scanner;

class Test{
	public ArrayList<String> inputName() {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int count = 5;
		
		for (int i = 0; i < count; i++) {
			System.out.println("이름 입력");
			String str = sc.next();
			arr.add(str);
		}
		sc.close();
		return arr;
	}
	
	public void outputName(ArrayList<String> iArr) {
		for (int i = 0; i < iArr.size(); i++) {
			System.out.printf("%d번 이름: %s\n", i+1, iArr.get(i));
		}
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		Test t = new Test();
		ArrayList<String> arrName = new ArrayList<>();
		arrName = t.inputName();
		
		//System.out.println(arrName);
		
		t.outputName(arrName);
	}
}
