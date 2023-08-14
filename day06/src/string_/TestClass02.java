package string_;

import java.util.Arrays;

public class TestClass02 {
	public static void main(String[] args) {
		String str = new String("test");
		String str2 = "test";
		// same
		
		String id = "a aa    ";
		String inputId = "a aa";
		
		System.out.println(id.equals(inputId));
		System.out.println(id+".");
		System.out.println(id.trim()+".");
		
		String addr = "서울/010 1234 5678/홍길동";
		String[] adds = addr.split("/");
		
		
		String repl = addr.replace("/", "==>");
		System.out.println(repl);
	}
}
