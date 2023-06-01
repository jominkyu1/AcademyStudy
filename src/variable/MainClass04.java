package variable;
class Ex04{
	private String name;
	
	public void input() {
		this.name = "홍길동";
	}
	
	public void print() {
		System.out.println(this.name);
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		Ex04 e = new Ex04();
		
		e.input();
		e.print();
		
	}
}
