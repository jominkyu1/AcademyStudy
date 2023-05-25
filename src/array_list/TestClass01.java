package array_list;

import java.util.ArrayList;

public class TestClass01 {
	/* 
 	컬렉션 프레임워크(collection framework)
	- 데이터들을 편리하게 사용할 수 있게 만든 기능
	- 표준화된 클래스를 이용
	
	 Collection (배열과 비슷)
	 - 다수의 데이터들을 의미
	 - 무한한 데이터의 집합
	 
	 Framework
	 - 디자인 패턴
	 - 표준화된 프로그래밍 방식
	 - List, Set, Map (컬렉션 프레임워크의 핵심 인터페이스)
	 
	 List -> ArrayList
	 - 순서가 있는 데이터의 집합 (index 사용 가능)
	 - 데이터의 중복이 가능
	 - 처리속도가 배열보다 느림
 */
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		System.out.println(arr.size()); //배열의 length
		arr.add("1111");
		arr.add("2222");
		arr.add("3333");
		System.out.println(arr.size());
		
		System.out.println(arr.get(0));
		System.out.println(arr.contains("2222"));
		
		System.out.println("=== arr ===");
		System.out.println(arr);
		//arr.remove("1111");
		arr.remove(0);
		System.out.println("1111삭제 후: "+arr);
	}
}
