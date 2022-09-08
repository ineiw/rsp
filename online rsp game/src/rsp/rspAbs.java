package rsp;

public abstract class rspAbs implements player {

	Hand hand = new Hand();
	int uid;
	
	@Override
	public Hand getHand() {
		return this.hand;
	}

	@Override
	public int whichWin(player player) {
		if ((this.getHand().getId()+1)%3 == player.getHand().getId())
			return this.getUid();
		else if((this.getHand().getId()+2)%3 == player.getHand().getId())
			return player.getUid();
		return -1;
	}

	@Override
	public int getUid() {
		return this.uid;
	}

}
