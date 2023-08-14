package oop;

public class MainClass03 {
	/* ### 접근 제한자 ###
	 * Private
	 * - 클래스 내부에서만 접근가능
	 * Public
	 * - 클래스 내,외부에서 모두 접근가능
	 * Protected
	 * - 일반적인 경우에는 private와 동일하게 클래스 내부에서 접근
	 * - 상속시에는 상속받은 자식에서도 접근가능
	 * - private 와 public의 중간정도 범위
	 * default(키워드가 없는경우)
	 * - 동일한 패키지 내에서 접근 가능 
	 * */
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.age = 20;
	}
}
