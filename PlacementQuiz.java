public class PlacementQuiz {
    private static final String[] questions = {
            "What is the output of the following Java code?\n" +
                    "public class Main {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        System.out.println(\"Hello, world!\");\n" +
                    "    }\n" +
                    "}\n",
            "What is the default value of boolean variable in Java?",
            "Which of the following is not a Java keyword?"
    };
    private static final String[] answers = {"A", "B", "C"};

    public static String[] getQuestions() {
        return questions;
    }

    public static String[] getAnswers() {
        return answers;
    }

    public static int calculateScore(String[] userAnswers) {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (userAnswers[i].equals(answers[i])) {
                score++;
            }
        }
        return score;
    }
}
