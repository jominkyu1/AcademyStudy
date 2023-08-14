package array_list;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OtherQuiz {
	public static void main(String[] args) {
		ArrayList<String> arrName = new ArrayList<>();
		ArrayList<String> arrNum = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String temp = null;
		int input =0;
		boolean willContinue = true;

	while(willContinue) {
		System.out.println("1. 연락처 등록");
		System.out.println("2. 연락처 보기");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 모든 연락처 보기");
		System.out.println("5. 종료");
		System.out.print("==> ");
		
		try {
			input = sc.nextInt();
			if(input>5) continue;
		}
		catch(InputMismatchException e){
			System.out.println("잘못 입력\n\n");
			sc.nextLine();
		};

		switch(input) {
		case 1:
			System.out.print("이름: ");
			temp = sc.next();
			
			if(arrName.contains(temp)) {
				System.out.println("중복된 이름이 있습니다.");
			}else {
				arrName.add(temp); 
				System.out.print("연락처: ");
				temp = sc.next();
				arrNum.add(temp);
			}
			break;
		case 2:
			if(arrName.size()==0) {
				System.out.println("등록된 사용자가 없습니다.");
			}
			else {
				System.out.print("이름: ");
				temp = sc.next();
				if(arrName.contains(temp)) {
					System.out.println("연락처: " + arrNum.get(arrName.indexOf(temp)));
				}
				else {
					System.out.println("목록에 없습니다.");
				}
			}
			break;
		case 3:
			System.out.print("삭제할 이름 입력: ");
			temp = sc.next();
			if(arrName.contains(temp)) {
				int i = arrName.indexOf(temp);
				System.out.println(arrName.remove(i)+":"+arrNum.remove(i)+" 삭제완료");
			}
			else {
				System.out.println("일치하는 이름이 없습니다.");
			}
			break;
		case 4:
			if(arrName.size()==0){
				System.out.println("목록이 없습니다.");
			}
			else {
				for(int i=0; i<arrName.size(); i++) {
				System.out.println(arrName.get(i) + ":" + arrNum.get(i));
				}
			}
			break;
		case 5:
			System.out.println("종료합니다.");
			willContinue = false;
		}
	}
	sc.close();
	}
}
