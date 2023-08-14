package quiz;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


class Test1{
	public HashMap<String, String> inputNum() {
		HashMap<String, String> hs = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 횟수?: ");
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.print((i+1) + "번 숫자 입력: ");
			String str = sc.next();
			
			hs.put((i+1)+"번의 숫자", str);
		}
		
		sc.close();
		return hs;
	}
	public void outputNum(HashMap<String, String> hs) {
		Set<String> hsSet = hs.keySet();
		Iterator<String> itSet = hsSet.iterator();
		int sum =0;
		int multi=1;
		
		for (int j = 0; j < hs.size(); j++) {
			String str = itSet.next();
			
			sum += Integer.parseInt(hs.get(str));
			multi *= Integer.parseInt(hs.get(str));
		}
		
		System.out.println("=====\n"+hs+"\n=====");
		System.out.println("총 더한 값: " + sum);
		System.out.println("총 곱한 값: " + multi);
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		
		HashMap<String, String> hash = t.inputNum();
		t.outputNum(hash);
		
	}
}
