package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		arr.add("감자");
		arr.add("고구마");
		arr.add("순대");
		arr.add("김밥");
		
		System.out.println(arr);
		System.out.print("찾는 값 입력: ");
		String name = sc.next();
		
		System.out.println(arr.indexOf(name));
		System.out.println(arr.contains(name));
		
		System.out.println("======");
		System.out.println(arr);
		
		int index;
		System.out.print("변경 할 위치?: ");
		index = sc.nextInt();
		System.out.print("변경할 값?: ");
		name = sc.next();
		arr.set(index, name);
		
		System.out.println("변경 후: "+arr);
	}
}
