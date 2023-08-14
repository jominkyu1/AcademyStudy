package set_get;

public class Quiz01_Method {
	private String name;
	private int sum, avg, kor, eng, math;
	private char grade;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void sum() {
		sum = (kor+eng+math);
	}
	public void avg() {
		avg = sum/3;
	}
	public void grade() {
		if(avg>=90) grade = 'A';
		else if(avg>=80) grade = 'B';
		else grade = 'C';
	}

	public String getName() {
		return name;
	}
	public int getSum() {
		return sum;
	}
	public int getAvg() {
		return avg;
	}
	public char getGrade() {
		return grade;
	}
}
