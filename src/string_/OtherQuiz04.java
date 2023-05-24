package string_;

public class OtherQuiz04 {
	public static void main(String[] args) {
		String str = "It is a fun java programming";
		
		int total = str.length();
		int aNum=0, gNum=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a') {aNum++; continue;}
			if(str.charAt(i) == 'g') gNum++;
		}
		
		System.out.printf("총 개수: %d\na 개수: %d\ng 개수: %d", total, aNum, gNum);
	}
}
