package rsp;

public class computer extends rspAbs {

	public computer(int uid) { // 컴퓨터 생성자로 uid 세팅
		this.uid = uid;
	}

	@Override // 랜덤으로 hand 객체 세팅
	public void setHand() {
		int rand = (int)(Math.random()*3);
		this.hand.setHand(rand,rspList[rand]);
	}

	@Override // person 을 위한 hand 세팅 함수
	public void setHand(String hand) {
		// TODO Auto-generated method stub
		
	}
}
