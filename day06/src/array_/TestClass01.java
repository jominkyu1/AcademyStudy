package array_;

public class TestClass01 {
	public static void main(String[] args) {
		//array
		//자료형[] 배열명 = new 자료형[]
		//new 키워드로 자료형 생성시 초기화 불필요
		//index 0부터 시작
		
		int[] arr = new int[5];
		
		System.out.println(arr[0]);
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}
