package probleme;

public class RockPaperScissor {

    public static String play(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Draw!";
        } else if ((player1.equals("rock") && player2.equals("scissors")) ||
                (player1.equals("paper") && player2.equals("rock")) ||
                (player1.equals("scissors") && player2.equals("paper"))) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }

    public static void main(String[] args) {
        System.out.println(play("scissors", "paper"));
        System.out.println(play("scissors", "rock"));
        System.out.println(play("paper", "paper"));
    }
}
