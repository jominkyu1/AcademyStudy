package variable;

class Ex06{
	public void test1() {
		System.out.println("test11111");
		test2();
	}
	
	public void test2() {
		System.out.println("test11111");
		test3();
	}
	
	public void test3() {
		System.out.println("test11111");
	}
}

public class MainClass06 {
	int num;
	public static void test1() {
		System.out.println("Main test");
	}
	public void test2() {};
	
	public static void main(String[] args) {
		Ex06 e = new Ex06();
		e.test1();
		test1();
		//test2(); not static error
	}
}
