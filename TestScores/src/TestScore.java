/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class TestScore {

    private int[] scores;

    public TestScore(int[] scores) {
        this.scores = scores;
    }
    public int getTotal() {
        int total = 0;
        for (int j : scores) {
            if (j >= 100 || j < 0) throw new IllegalArgumentException("Invalid Score");
            total += j;
        }
        return total;
    }

    public int getAverage() {
        return getTotal() / scores.length;
    }
}
