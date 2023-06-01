package variable;

class Ex07{
	int num=150; //0 or null로 자동초기화
	
	public static void test() {
		//System.out.println(num);
		System.out.println("TEST");
	}
}
public class MainClass07 {
	public static void main(String[] args) {
		Ex07 e = new Ex07();
		e.test(); // --> Ex07.test();
	}
}
