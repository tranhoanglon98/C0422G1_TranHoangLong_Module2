package bai_tap.clean_code_refactoring;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        final int love = 0;
        final int fifteen = 1;
        final int thirty = 2;
        final int forty = 3;
        String score = "";
        int tempScore;
        boolean isDeuce = player1Score == player2Score;
        if (isDeuce) {
            switch (player1Score) {
                case love:
                    score = "Love-All";
                    break;
                case fifteen:
                    score = "Fifteen-All";
                    break;
                case thirty:
                    score = "Thirty-All";
                    break;
                case forty:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (player1Score > forty || player2Score > forty) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) score = "Advantage " + player1Name;
            else if (minusResult == -1) score = "Advantage " + player2Name;
            else if (minusResult >= 2) score = "Win for " + player1Name;
            else score = "Win for " + player2Name;
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    score += "-";
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case love:
                        score += "Love";
                        break;
                    case fifteen:
                        score += "Fifteen";
                        break;
                    case thirty:
                        score += "Thirty";
                        break;
                    case forty:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
