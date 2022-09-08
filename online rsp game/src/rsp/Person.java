package rsp;

public class Person extends rspAbs{

	public Person(int uid) { // 생성자로 uid 세팅
		this.uid = uid;
	}

	@Override
	public void setHand(String input) { // string 형 변수 input을 int 형으로 바꾼후 id 와 name 으로 각각세팅하여 저장
		int id = Integer.parseInt(input);
		this.hand.setHand(id,rspList[id]);
	}

	@Override
	public void setHand() { // computer 를 위한 랜덤 세팅 함수
		// TODO Auto-generated method stub
		
	}
}
