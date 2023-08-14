package set_get;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Quiz01_Method q = new Quiz01_Method();
		Scanner sc = new Scanner(System.in);
		
		String name;
		int sum, avg, kor, eng, math;
		char grade;
		
		//입력
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		//set
		q.setName(name);
		q.setKor(kor);
		q.setEng(eng);
		q.setMath(math);
		
		//연산
		q.sum();
		q.avg();
		q.grade();
		
		//get
		name = q.getName();
		sum = q.getSum();
		avg = q.getAvg();
		grade = q.getGrade();
		
		//출력
		System.out.println("이름: "+name);
		System.out.println("==========");
		System.out.println("총합: "+sum);
		System.out.println("평균: "+avg);
		System.out.println("등급: "+grade);
		
		sc.close();
		
	}
}
