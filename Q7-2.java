class Child {
	int bizNum;
	public Child(int num) {
		bizNum=num;
	}
public void ShowResult(Child player, int n) {
	System.out.println("플레이어 "+n);
	System.out.println("구슬 개수: "+player.bizNum);
	}
}

class Main {
	public static void GameResult(Child winner, Child loser, int num) {
		winner.bizNum+=num;
		loser.bizNum-=num;
		}
	
	public static void main(String[] args) {
	Child player1=new Child(15);
	Child player2=new Child(9);
	// Round 1
	GameResult(player1, player2, 2);
	// Round 2
	GameResult(player2, player1, 7);
	// Result
	player1.ShowResult(player1, 1);
	player2.ShowResult(player2, 2);
	}

}
