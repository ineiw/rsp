package rsp;

// Hand 클래스는 id 와 name 인 각각 int 와 string 형을 가진다. id 와 name 을 가져오는 get 함수와 set 함수가 있다. 
public class Hand {
	int id;
	String name;
	
	public void setHand(int id,String name) { // set 함수
		this.id = id;
		this.name = name;
	}
	
	public int getId() { // get 함수
		return this.id;
	}
	
	public String getName() { // get 함수
		return this.name;
	}
}
