package operator;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		 * %(mod) : 정수 % 정수 = 나머지값 (ex: 짝수, 홀수, 배수 구분 등)
		 *  
		 * */
		
		int n1 = 9;
		int n2 = 2;
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 / (float)n2);
		System.out.println(n1 % n2);
		
		/*
		 * 복합대입연산자
		 * +=, -=, *=, /=, %=
		 */
		System.out.println("=======복합대입연산자=======");
		n1 = n2 = 5;
		
		n1 += 1;	
		System.out.println(n1); // 6
		
		n1 -= 1;
		System.out.println(n1); // 5
		
		n1 *= n2;
		System.out.println(n1); // 25
		
		n1 /= n2;
		System.out.println(n1); // 5
		
		n1 %= n2;
		System.out.println(n1); // 0 
		
		/*
		 * 관계연산자
		 * - true or false 반환
		 * >, <, >=, <=, ==, !=
		 */
		System.out.println("=======관계연산자=======");
		
		int m1 = 10;
		int m2 = 5;
		
		System.out.println( m1 > m2 ); // T
		System.out.println( m1 == m2 ); // F
		System.out.println( m1 == 10 ); // T
		System.out.println( m1 != m2 ); // T
		System.out.println( m1 != 10 ); // F
		
		/*
		 * 논리연산자
		 * ||(or) 	: 하나라도 true면 true 반환
		 * &&(and)	: 모두가 true면 true반환
		 * !(not) 	: 결과 반전 (!true -> false) 
		 */
		System.out.println("=======논리연산자=======");
		
		System.out.println("--|| (OR)--");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		System.out.println("--&& (AND)--");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println(10 > 5 && 10 > 2); // 10 > 5 > 2 (이항연산자로 묶어 계산)
		
		System.out.println("-- ! (NOT)--");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(10 < 5));
		
		/*
		 * 증감연산자
		 * n1++ => n1 = n1 + 1
		 */
		System.out.println("=======증감연산자=======");
		
		n1 = 10;
		n2 = n1++ + 10; // 10 + 10
		
		System.out.println(n1);
		System.out.println(n2);
		
		
		n1 = 10;
		n2 = ++n1 + 10; // 11 + 10
		
		System.out.println(n1);
		System.out.println(n2);
	}
}
