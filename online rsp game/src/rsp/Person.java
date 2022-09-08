package rsp;

public class Person extends rspAbs{

	public Person(int uid) {
		this.uid = uid;
	}

	@Override
	public void setHand(String input) {
		int id = Integer.parseInt(input);
		this.hand.setHand(id,rspList[id]);
	}

	@Override
	public void setHand() {
		// TODO Auto-generated method stub
		
	}
}
