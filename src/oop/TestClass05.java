package oop;

public class TestClass05 {
					   //매개변수(parameter)
	public void sumFunc(int num) {		
		int sum=0;
		for (int i = 0; i <= num; i++) {
			sum+=i;
		}
		
		System.out.printf("1부터 %d까지의 합: %d\n", num, sum);
	}
	public int sumFunc2(int num, int num2) {		
		int sum=0;
		for (int i = 0; i <= num; i++) {
			sum+=i;
		}
		//메소드를 종료하는 기능
		//return 다음에 값이 있으면, 값을 돌려줌
		return sum;
	}
}