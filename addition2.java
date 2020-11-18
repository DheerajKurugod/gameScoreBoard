public class addition2 {

    public static void main(String[] args) {

        int result = calculateHighScorePosition(1500);
        displayHighScorePosition("Alex", result);

        result = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", result);

        result = calculateHighScorePosition(400);
        displayHighScorePosition("Hally", result);

        result = calculateHighScorePosition(50);
        displayHighScorePosition("Moma", result);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
    /*    if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4; */

        //Below code is only with 1 return
        int position = 4; //assuming position 4 will be returned
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
