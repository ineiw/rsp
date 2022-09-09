package rsp;

// 플레이어 인터페이스
public interface player {
	
	int rock = 0;
	int sissor = 1;
	int paper = 2;

	String[] rspList = {"바위","가위","보"}; // 위 정수형 값과 인덱싱 해주기위해 string 배열 선언
	
	public Hand getHand(); // hand 형 값 가져오기
	public void setHand(String hand); // hand 세팅
	public void setHand(); // 랜덤으로 hand 세팅
	public int whichWin(player player); // 플레이어 중 이긴사람의 uid 리턴
	public int getUid(); // uid 가져오기
}
