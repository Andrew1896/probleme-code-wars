package probleme;

public class TotalPoints {

        public static void main(String[] args) {
            String[] scoruriMeci = {"3:1", "2:2", "0:1", "4:0", "1:2", "3:3", "2:1", "0:4", "1:0", "2:2"};
            int points = calculatePoints(scoruriMeci);
            System.out.println("Numărul total de puncte obținute de Barcelona: " + points);
        }

        public static int calculatePoints(String[] scoruriMeci) {
            int totalPoints = 0;
            for (String match : scoruriMeci) {
                String[] scores = match.split(":");
                int Barcelona = Integer.parseInt(scores[0]);
                int PSG = Integer.parseInt(scores[1]);
                if (Barcelona > PSG) {
                    totalPoints += 3;
                } else if (Barcelona == PSG) {
                    totalPoints += 1;
                }
            }
            return totalPoints;
        }
    }
