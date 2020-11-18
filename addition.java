public class addition {
    public static void main(String[] args) {

        calculateScore(true, 1000, 5, 500);

        calculateScore(true, 3000, 7, 800);

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score is: " + finalScore);
            return finalScore;
        }
            return -1;
    }
}