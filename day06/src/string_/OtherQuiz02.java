package string_;

public class OtherQuiz02 {
	public static void main(String[] args) {
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		System.out.println("====변경 전 str====");
		System.out.println(str);
		System.out.println("====변경 후 str====");
		
		String newStr = str.replace('-', ':');
		String[] arrStr = newStr.split("\n");
		newStr="";

		
		
		for(int i=0;i<arrStr.length;i++) {
			String[] reStr = arrStr[i].split(":");
			newStr += reStr[0] + ":" + reStr[1].replace(reStr[1], "1999년\n");  

		}
		System.out.println(newStr);
	}
}

