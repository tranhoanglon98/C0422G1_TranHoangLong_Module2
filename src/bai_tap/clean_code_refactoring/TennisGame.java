package bai_tap.clean_code_refactoring;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        final int love = 0;
        final int fifteen = 1;
        final int thirty = 2;
        final int forty = 3;
        StringBuilder score = new StringBuilder();
        int tempScore;
        boolean isDeuce = player1Score == player2Score;
        if (isDeuce) {
            switch (player1Score) {
                case love:
                    score = new StringBuilder("Love-All");
                    break;
                case fifteen:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case thirty:
                    score = new StringBuilder("Thirty-All");
                    break;
                case forty:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (player1Score > forty || player2Score > forty) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) {
                score = new StringBuilder("Advantage " + player1Name);
            } else if (minusResult == -1) {
                score = new StringBuilder("Advantage " + player2Name);
            } else if (minusResult >= 2) {
                score = new StringBuilder("Win for " + player1Name);
            } else {
                score = new StringBuilder("Win for " + player2Name);
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    score.append("-");
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case love:
                        score.append("Love");
                        break;
                    case fifteen:
                        score.append("Fifteen");
                        break;
                    case thirty:
                        score.append("Thirty");
                        break;
                    case forty:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}
