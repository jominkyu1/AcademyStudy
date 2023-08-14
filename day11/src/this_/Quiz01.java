package this_;

import java.util.Scanner;

class TestClass02{
	Scanner sc = new Scanner(System.in);
	
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	
	public void input() {
		System.out.print("이름: ");
		this.name = sc.next();
		System.out.print("국어: ");
		this.kor = sc.nextInt();
		System.out.print("영어: ");
		this.eng = sc.nextInt();
		System.out.print("수학: ");
		this.math = sc.nextInt();
		
		this.op();
	}
	
	public void op() {
		this.sum = (this.kor + this.eng + this.math);
		this.avg = (this.sum)/3;
		
		if(this.avg>=90) this.grade = "A";
		else if (this.avg>=80) this.grade = "B";
		else this.grade = "C";
		
		this.print();
	}
	
	public void print() {
		System.out.printf("====\n%s님\n- 합계: %d\n- 평균: %d\n- 등급: %s\n\n", this.name, this.sum, (int)this.avg, this.grade);
		sc.close();
		//this.input();
	}
}

public class Quiz01 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		t.input();
	}
}
