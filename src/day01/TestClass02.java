package day01;

public class TestClass02 {
	public static void main(String[] args) {
	/*
	 * escape 문자
	 * 문자열안에서 특수한 기능을 수행
	 * \n : 엔터값과 비슷
	 * \t : 탭 크기만큼 이동(8칸씩 구분)
	 * \" : "(큰 따옴표) 하나 표현
	 * \\ : \(역슬러시) 하나 표현
	 */
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("1\t1234567\t8\t8");
		
		System.out.println("이름\t나이\t주소");
		System.out.println("======================");
		System.out.println("홍길동\t20살\t산골짜기");
		
		System.out.println(111 + "\t" + 222);
		
		System.out.println(" \\ \" ");
		System.out.println("D:\\0511JMK\\java\\workspace\\day01\\src");
	}
}
