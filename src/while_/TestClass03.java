package while_;

public class TestClass03 {
	public static void main(String[] args) {
		int i = 0;
		
		while(i<5)
		{
			i++;
			if(i==3)
			{
				System.out.println(3333333);
				//break;
				continue;
			}
			System.out.println("i: " + i);
		}
	}
}
