
public class main {
	public static void main(String[] args) {
		int scorePosition1 = calculateHighScorePosition(1500);
		displayHighScorePosition("Onur", scorePosition1);
		int scorePosition2 = calculateHighScorePosition(1000);
		displayHighScorePosition("Onur", scorePosition2);
		int scorePosition3 = calculateHighScorePosition(500);
		displayHighScorePosition("Onur", scorePosition3);
		int scorePosition4 = calculateHighScorePosition(100);
		displayHighScorePosition("Onur", scorePosition4);
		int scorePosition5 = calculateHighScorePosition(25);
		displayHighScorePosition("Onur", scorePosition5);
	}
	public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }
	public static int calculateHighScorePosition(int playerScore){
		int pos = 4;
		if(playerScore >= 1000) {
			pos = 1;
		}else if (playerScore >= 500) {
			pos = 2;
		}else if (playerScore >= 100) {
			pos = 3;
		}
		return pos;
    }
}
