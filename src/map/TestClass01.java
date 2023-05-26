package map;

import java.util.HashMap;

public class TestClass01 {
	/*
 	Map - HashMap
 	- key, value형식으로 만들어진다.
 	- 순서 유지X
 	- 원하는 값은 key를 통해 얻어옴
 	- key중복불가능, value중복가능
 	- key(변수) value(값) 한쌍
 */
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();

		map.put("num", "100");
		map.put("name", "홍길동");
		map.put("addr", "산골짜기");
		
		System.out.println(map);
	
		System.out.println(map.get("num"));
		System.out.println(map.get("name"));
		System.out.println(map.get("addr"));
		
		System.out.println(map.get("없는키")); //null
		System.out.println(map.containsKey("없는키")); //false
		
		System.out.println("========");
		map.put("name", "김개똥"); //Value를 덮어씌움
		map.put("name1", "김개똥");
		System.out.println(map);
		
		System.out.println("=== name1 삭제 ===");
		map.remove("name1");
		System.out.println(map);
	}
}
