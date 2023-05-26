package map;

import java.util.HashMap;
import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		String key, value;
		
		System.out.print("저장할 키: ");
		key = sc.next();
		System.out.print("저장할 값: ");
		value = sc.next();
		
		map.put(key, value);
		System.out.println(map);
		
		
		System.out.print("찾을 키?: ");
		key = sc.next();
			if(map.containsKey(key)) System.out.println(map.get(key));
			else System.out.println("없는 키");
	}
}
