package variable;

public class TestClass03 {
	public static void main(String[] args) {
		/*
		 * 형변환
		 * 
		 * */
		
		int num = 65;
		
		System.out.println( num );
		System.out.println( (char)num );
		
		char ch = 'A', ch3; 
		int ch2;
		num = 5;
		
		ch2 = ch + num ;
		ch3 = (char)(ch + num) ;
		
		System.out.println(ch2);
		System.out.println(ch3);
		
		// float f1 = 1.11; 8->4바이트 불가능
		float f1 = (float)1.11;
		float f1_2 = 1.11f;
		double dou = 1.11;
		
		String name = "홍길동";
		System.out.println("당신의 이름은: " + name);
		
	}
}
