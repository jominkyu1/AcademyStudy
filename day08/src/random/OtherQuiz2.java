package random;

import java.util.ArrayList;

public class OtherQuiz2 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0; i<6; i++) {
			int ran = (int)(Math.random()*45+1); //1~45
			
			if(arr.contains(ran+"")) i--;
			else {
				arr.add(ran+"");
				System.out.println(i+1+"번째 번호: "+arr.get(i));
			}
		}
		System.out.println("\n로또 번호: " + arr);
	}
}
