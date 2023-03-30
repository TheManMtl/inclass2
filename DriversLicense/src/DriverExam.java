/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class DriverExam {

    private char[] answers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
    //private char[] answers = {'B', 'D', 'A', 'A', 'C'};
    private char[] studentAnswers;

    public char[] getAnswers() {
        return answers;
    }

    public void setAnswers(char[] answers) {
        this.answers = answers;
    }

    public char[] getStudentAnswers() {
        return studentAnswers;
    }

    public void setStudentAnswers(char[] studentAnswers) {
        this.studentAnswers = studentAnswers;
    }

    public boolean passed() {
        return totalCorrect() >= 15;
    }

    public int totalCorrect() {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == studentAnswers[i])
                score++;
        }
        return score;
    }

    public int totalIncorrect() {
        return answers.length - totalCorrect();
    }
}
