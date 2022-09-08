package rsp;

import java.util.Scanner;

public class TestRsp {

	public static void main(String[] args) {
		System.out.println("ok");
		Scanner sc = new Scanner(System.in);
		
		Person man = new Person(12);
		computer com = new computer(23);
		
		String input = "a";
		
		while (true) {
			input = sc.nextLine();
			
			if (!(input.equals("0") || input.equals("1") ||input.equals("2") ||input.equals("q"))) {
				System.out.println("you can choose only q,0,1,2");
				continue;
			}
			if (input.equals("q"))
				break;
			
			man.setHand(input);
			com.setHand();
			
			int uid = man.whichWin(com);

			System.out.println("You : "+man.getHand().getName()+"\nOppenent : "+com.getHand().getName());
			
			if(uid == man.getUid())
				System.out.println("you win");
			else if(uid == com.getUid())
				System.out.println("you lose");
			else
				System.out.println("draw");
		}
		
	}

}
