class Child {
	int bizNum;
	public Child(int num) {
		bizNum = num;
	}
	public void ShowResult(Child player, int n) {
		System.out.println("플레이어 " + n);
		if (player.bizNum == 0) {
			System.out.println("파산");
		} else System.out.println("구슬 개수: " + player.bizNum);
	}
}

class Main {
	public static int outPoint = 0;
	public static void GameResult(Child winner, Child loser, int num) {
		winner.bizNum += num;
		loser.bizNum -= num;
		if (loser.bizNum <= 0) {
			loser.bizNum = 0;
			outPoint = 1;
		}
	}

	public static void main(String[] args) {
		Child player1 = new Child(15);
		Child player2 = new Child(9);
		// Round 1
		GameResult(player1, player2, 2);
		if (outPoint != 1) {
			// Round 2
			GameResult(player2, player1, 17);
		}
		// Result
		player1.ShowResult(player1, 1);
		player2.ShowResult(player2, 2);
	}

}
