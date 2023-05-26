package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestClass02 {
	public static void main(String[] args) {
		//HashMap<String, String> map = new HashMap<>();
		LinkedHashMap<String, String> map = new LinkedHashMap<>(); //LinkedHashMap은 순서를 유지
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "20만원");
		
		System.out.println(map);
		System.out.println("에어컨가격: " + map.get("에어컨"));
		
		System.out.println("===========");
		System.out.println(map.keySet()); //key만
		System.out.println(map.values()); //value만
		
		Set<String> key = map.keySet(); //Set자료형으로만 (HashSet과 동일)
		Iterator<String> it = key.iterator();
		
		System.out.println("==반복문==");
		String k;
		while(it.hasNext()) {
			k = it.next();
			System.out.println(k+":"+map.get(k));
		}
	}
}
