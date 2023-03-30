/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class ScoreDemo {
    public static void main(String[] args) {
        int[] scoresA = {40, 30, 6, 95, 50};
        int[] scoresB = {40, 30, 6, 101, 50};
        TestScore tsA=new TestScore(scoresA);
        TestScore tsB=new TestScore(scoresB);

        try {
            System.out.printf("Student A : Average is: %d\n",tsA.getAverage());
            System.out.printf("Student B : Average is: %d\n",tsB.getAverage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

}
