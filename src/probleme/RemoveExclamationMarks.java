package probleme;

public class RemoveExclamationMarks {

        public static void main(String[] args) {
            String text = "Barcelona, felicitări!!! pentru costigarea Champions League !!";
            String textFaraSemneExclamare = removeExclamationMarks(text);
            System.out.println("Textul fără semne de exclamare: " + textFaraSemneExclamare);
        }

        public static String removeExclamationMarks(String str) {
            return str.replaceAll("!", "");
        }
    }

