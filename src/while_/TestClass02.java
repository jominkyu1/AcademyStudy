package while_;

public class TestClass02 {
	public static void main(String[] args) {
		boolean bool = true;
		
		for(int i=0;bool;i++)
		{
			System.out.println("execute"+i);
			
			if(i==5)
			{
				System.out.println(i);
				break;
			}
		}
		
		System.out.println("==========");
		
		int j=0;
		while(bool)
		{
			System.out.println("execute"+j);
			
			if(j==5) 
			{
				System.out.println(j);
				break;
			}
			j++;
		}
		
		
	}
}
