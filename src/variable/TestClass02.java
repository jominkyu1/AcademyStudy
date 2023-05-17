package variable;

public class TestClass02 {
	public static void main(String[] args) {
		char ch = 'A';
		int num = 123;
		System.out.println("연산 전 ch : " + ch);
		System.out.println("연산 전 num : " + num);
		
		ch = 'B';
		num += 123;
		
		System.out.println("연산 후 ch : " + ch);
		System.out.println("연산 후 numb : " + num);
		
		ch = 'a';
		num = 5;
		
		System.out.println("ch+num => " + (ch + num)); //ASCII CODE
	}
}
