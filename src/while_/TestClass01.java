package while_;

public class TestClass01 {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		
		while(i<=10)
		{
			sum += i;
			i++;
		}
		
		System.out.printf("1~10까지의 합: %d\n", sum);
		/////////////////////////////////////////
		
		int sum2 = 0;
		
		for(int j=0;j<=10;j++)
		{
			sum2 += j;
		}
		System.out.printf("1~10까지의 합: %d", sum2);
	}
}
