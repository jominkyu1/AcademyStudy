package string_;

public class TestClass01 {
	public static void main(String[] args) {
		String str = "Java is 그리고 pro 할만하다.";
		System.out.println("기본 str: "+str);
		
		String upperStr = str.toUpperCase();
		System.out.println("대문자: "+upperStr);
		
		String lowerStr = str.toLowerCase();
		System.out.println("소문자: "+lowerStr);
		
		System.out.println("=============");
		
		
		
		str = "abcd";
		System.out.println("기본 str: "+str);
		System.out.println(str.charAt(0));
		
		char ch = str.charAt(1);
		System.out.println("ch: "+ch);	
		System.out.println("ch-32: " + (char)(ch-32));
		
		char ch2 = ' ';
		System.out.println(ch2 == ' ');
	}
}
