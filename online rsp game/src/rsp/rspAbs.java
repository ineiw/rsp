package rsp;

// person 과 computer 에 공통으로 구현되는 메소드와 변수 구현 player 인터페이스 상속 
public abstract class rspAbs implements player {

	Hand hand = new Hand(); // Hand 객체 생성
	int uid; // uid 선언
	
	@Override // hand 형 객체 리턴
	public Hand getHand() {
		return this.hand;
	}

	@Override // 이긴 사람 의 uid 리턴 비기면 -1 리턴
	 /*
	  * 주먹 
	  *  	\
	  *  |	가위
	  * 	/
	  * 보자기
	  * 이므로 바로 다음 값과 다다음 값이 각각 이기고 진다.
	  */
	public int whichWin(player player) { // 인터페이스 player 가 상속되었으니 player 형으로 값 받기 가능
		if ((this.getHand().getId()+1)%3 == player.getHand().getId()) 
			return this.getUid();
		else if((this.getHand().getId()+2)%3 == player.getHand().getId())
			return player.getUid();
		return -1;
	}

	@Override // uid 리턴
	public int getUid() {
		return this.uid;
	}

}
