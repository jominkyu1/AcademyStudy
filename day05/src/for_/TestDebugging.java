package for_;

public interface TestDebugging {
	public static void main(String[] args) {
		//debugging(F11)
		int sum =0;//break point(멈춤)
		
		//F6 = 한줄씩 실행
		//F5 = 한줄씩 실행(메소드를 만나면 해당 코드로 이동)
		//Ctrl+F2 디버깅 종료
		System.out.println("시작");
		
		for(int i=0;i<10;i++)
		{
			sum += i;
			//F8(Run) = 디버깅중 연산 끝내고 다음 break point로 이동
		}
		
		System.out.println(sum+"\n끝");
	}
}
