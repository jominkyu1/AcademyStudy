package random;

import java.util.Random;

public class TestClass01 {
	public static void main(String[] args) {
		// random: 0.00 ~ 0.99 사이
		for(int i=0; i<5; i++) {
			double ran = Math.random();
			System.out.println((int)(ran*100)); //0~99
		}
		System.out.println("==============");
		for(int i=0; i<5; i++) {
			int n = (int)(Math.random()*10+10); //10~19
			System.out.println(n);
		}
		System.out.println("=============");
		Random rand = new Random();
		for(int i=0; i<5; i++) {
			System.out.println(rand.nextInt(10)); //0~10
		}
	}
}
