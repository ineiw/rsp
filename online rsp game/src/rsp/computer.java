package rsp;

public class computer extends rspAbs {

	public computer(int uid) {
		this.uid = uid;
	}

	@Override
	public void setHand() {
		int rand = (int)(Math.random()*3);
		this.hand.setHand(rand,rspList[rand]);
	}

	@Override
	public void setHand(String hand) {
		// TODO Auto-generated method stub
		
	}
}
