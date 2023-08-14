package random;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class OtherQuiz {
	public static void main(String[] args) {
		HashMap<String, String> hMap = new HashMap<>();
		Set<String> key;
		Iterator<String> it;
		Scanner sc = new Scanner(System.in);
		String menu = null, price = null;
		Boolean willContinue = true;
		int i=0;

		//1.중복시 중복처리
		//2.가격출력 후 수정 삭제 나가기버튼
		while(willContinue) {

			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종 료");
			System.out.print(">>>: ");
			try {
				i = sc.nextInt();
				if(i>3) continue;
			}catch(Exception e){
				System.out.println("잘못된 입력 값입니다.\n");
				sc.nextLine();
			}
			switch(i) {
				case 1:
					System.out.print("이름: ");
					menu = sc.next();
					if(hMap.containsKey(menu)) {
						System.out.println("존재하는 메뉴입니다.\n");
						break;
					}
					System.out.print("가격: ");
					price = sc.next();
					hMap.put(menu, price);
					break;
				case 2:
					//System.out.println(hMap);
					key = hMap.keySet();
					it = key.iterator();

					if(it.hasNext()==false) {
						System.out.println("메뉴가 없습니다.\n");
						break;
					}

					while(it.hasNext()) {
						String str = it.next();
						System.out.println(str+": "+hMap.get(str));
					}
					//////////수정삭제나가기
					System.out.print("\n1. 수정 2. 삭제 3. 나가기\n>>>: ");
					int i2 = sc.nextInt();
					switch(i2) {
						case 1:
							System.out.print("수정 할 메뉴이름: ");
							menu = sc.next();
							if(hMap.containsKey(menu)) {
								System.out.print("수정 할 가격: ");
								price = sc.next();
								hMap.put(menu, price);
								System.out.println("수정 완료\n");
								break;
							}else {
								System.out.println("없는 메뉴명입니다. \n");
								break;
							}
						case 2:
							System.out.print("삭제 할 메뉴이름: ");
							menu = sc.next();
							if(hMap.containsKey(menu)) {
								hMap.remove(menu);
								System.out.println("삭제 완료\n");
								break;
							}else {
								System.out.println("없는 메뉴입니다.\n");
								break;
							}
						case 3:
							break;
					}
					break;
				case 3:
					System.out.println("종료");
					sc.close();
					willContinue = false;
			}
		}
	}
}
