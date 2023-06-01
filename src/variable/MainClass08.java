package variable;
class Common{
	static final String PATH = "C:\\TEST폴더\\";
}

class AAA{
	public void test() {
		Common c = new Common();
		System.out.println(c.PATH+"AAA 접근하여 작업합니다.");
	}
}

class BBB{
	public void test() {
		System.out.println(Common.PATH+"BBB 접근하여 작업합니다.");
	}
}

public class MainClass08 {
	public static void main(String[] args) {
		AAA a = new AAA();
		BBB b = new BBB();
		a.test(); b.test();
	}
}