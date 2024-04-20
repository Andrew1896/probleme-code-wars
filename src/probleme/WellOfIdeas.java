package probleme;

public class WellOfIdeas {

    public static String checkIdea(String[] x) {
        int goodIdea = 0;
        for (String idea : x) {
            if (idea.equals("good")) {
                goodIdea++;
            }
        }
        if (goodIdea == 1 || goodIdea == 2) {
            return "Publish!";
        } else if (goodIdea > 2) {
            return "I smell a series!";
        } else {
            return "Fail!";
        }
    }

    public static void main(String[] args) {
        String[] idea = {"good", "bad", "bad", "good"};
        String result = checkIdea(idea);
        System.out.println(result);
    }
}
