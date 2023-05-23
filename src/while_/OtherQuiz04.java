package while_;

public class OtherQuiz04 {
	public static void main(String[] args) {
		
		int rat = 2; //쥐당 먹는양 20
		int rice = 100*1000;
		int day = 1;
		
		
		while(true)
		{
			if(rat*20>rice) 
			{
				float percent = ((float)rice/(rat*20))*rat;
				System.out.println(day+"일차에 " + (int)(rat-percent) + "마리 아사");
				rat += (int)percent;
				break;
			}
			rice -= rat*20;
			
			if(day%10==0) rat *= 2;
			day++;
		}
		System.out.printf("쥐: %d마리\n", rat);
		System.out.printf("%d일차", day);
	}
}
