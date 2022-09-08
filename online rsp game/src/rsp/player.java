package rsp;

public interface player {
	
	int rock = 0;
	int sissor = 1;
	int paper = 2;

	String[] rspList = {"Rock","Sissor","Paper"};
	
	public Hand getHand();
	public void setHand(String hand);
	public void setHand();
	public int whichWin(player player);
	public int getUid();
}
