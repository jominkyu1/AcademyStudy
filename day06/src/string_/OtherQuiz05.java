package string_;

import java.util.Arrays;

public class OtherQuiz05 {
	public static void main(String[] args) {
		String str = new String("tESt sTring     change      first");
		String changeStr = new String();
		changeStr = str.toLowerCase();
		
		
		String[] arrStr = changeStr.split(" ");
		
		System.out.println(Arrays.asList(arrStr));
		
		for(int i=0;i<arrStr.length;i++) { //소문자범위체크
			System.out.println(arrStr[i]);
			
			char ch = Character.toUpperCase(arrStr[i].charAt(0));
			
			System.out.println(ch);
			System.out.println(Arrays.asList(arrStr));	
		}
		System.out.println(Arrays.asList(arrStr));
		
		//System.out.println(arrStr[0].charAt(0));
	}
}

