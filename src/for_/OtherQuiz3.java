package for_;

public class OtherQuiz3 {
	public static void main(String[] args) {
		int a =0;
		
		System.out.printf("★ |\t");
		for(int i=2;i<10;i++)
		{
			System.out.print(i+"\t");
		}
		
		System.out.print("\n  ◈ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
		
		for(int i=2;i<10;i++)
		{
			System.out.printf(i+" |\t");
			for(int j=2;j<10;j++)
			{
				System.out.printf(i*j+"\t");
			}
			System.out.println();
		}
	}
}
