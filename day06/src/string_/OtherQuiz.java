package string_;

import java.util.Scanner;

public class OtherQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] id = new String[5];
		String[] pwd = new String[5];
		String inputId = null;
		String inputPwd = null;
		int counter =0;
		
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 모든 회원보기");
			
			switch(sc.nextInt()) {
			case 1:
				if(id[0] == null) {System.out.println("회원가입을 먼저 진행해주세요."); break;}
				
				System.out.print("아이디: ");
				inputId = sc.next();
				System.out.print("비밀번호: ");
				inputPwd = sc.next();
				
				for(int i=0; i<id.length; i++) {
					if(inputId.equalsIgnoreCase(id[i]) && inputPwd.equals(pwd[i])) {System.out.println("로그인 성공"); break;}
				}
				System.out.println("다시 입력해주세요.");
				break;
			case 2:
				if(counter==5) {System.out.println("생성 불가"); break;}
				
				System.out.print("생성할 아이디: ");
				inputId = sc.next();
					for(String str : id)
						if(inputId.equals(str)) {System.out.println("중복된 아이디가 있습니다."); break;}
						else {
							System.out.print("생성할 비밀번호: ");
							inputPwd = sc.next();
				
				
							id[counter] = inputId;
							pwd[counter] = inputPwd;
							counter++;
							System.out.println("가입을 축하합니다.");
							break;
						}
				break;
			case 3:
				for(int i=0;i<id.length;i++) 
				{
					System.out.printf("아이디: %s, 비밀번호: %s\n", id[i], pwd[i]);
				}
				System.out.println("=======");
				break;
			}
		}
		
	}
}
