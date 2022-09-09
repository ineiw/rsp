package rsp;

import java.util.Scanner;

public class TestRsp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Person 과 computer 객체 생성
		Person man = new Person(12);
		computer com = new computer(23);
		
		// input 입력 받기
		String input = "a";
		
		while (true) {

			System.out.println("==============\n[바위 : (0) , 가위 : (1) , 보자기 : (2) , 나가기 : (q)]");
			input = sc.nextLine(); // 입력받기
			
			// 0,1,2,q 만 받기
			if (!(input.equals("0") || input.equals("1") ||input.equals("2") ||input.equals("q"))) {
				System.out.println("q,0,1,2 중 하나를 고르시오.");
				continue;
			}
			if (input.equals("q")) // q 면 while 문 탈출 
				break;
			
			man.setHand(input); // setHand 함수로 인풋변수 값 세팅하기
			com.setHand(); // com 의 setHand 로 랜덤하게 값 세팅하기
			
			int uid = man.whichWin(com); // man 과 com 중 이긴 플레이어의 uid 저장

			System.out.println("나 : "+man.getHand().getName()+"\n상대방 : "+com.getHand().getName()+"\n=============="); // 상태 출력
			
			if(uid == man.getUid()) // man 이 이겻으면 win 출력
				System.out.println("WIN");
			else if(uid == com.getUid()) // man 이 졋으면 lose 출력
				System.out.println("LOSE");
			else // 비겼으면 draw 출력
				System.out.println("DRAW");
	      
		}
		
	}

}
