/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class ArraysDemo {

    public static void main(String[] args) {

        int[] ints = {40, 30, 6, 29, 50};
        float[] floats = {50.2f, 40.2f, 5525.0f, 676.65f};
        double[] doubles = {125.5, 215, 0.23, 25.00};
        long[] longs = {12502145l, 25415l, 212121l, 2121215454l};

        try {
            System.out.println("totals:");
            System.out.println("integers: " + ArrayOperations.getTotal(ints));
            System.out.println("floats: " + ArrayOperations.getTotal(floats));
            System.out.println("doubles: " + ArrayOperations.getTotal(doubles));
            System.out.println("longs: " + ArrayOperations.getTotal(longs));
            System.out.println();
            System.out.println("Average:");
            System.out.println("integers: " + ArrayOperations.getAverage(ints));
            System.out.println("floats: " + ArrayOperations.getAverage(floats));
            System.out.println("doubles: " + ArrayOperations.getAverage(doubles));
            System.out.println("longs: " + ArrayOperations.getAverage(longs));
            System.out.println();
            System.out.println("Highest Number:");
            System.out.println("integers: " + ArrayOperations.getHighest(ints));
            System.out.println("floats: " + ArrayOperations.getHighest(floats));
            System.out.println("doubles: " + ArrayOperations.getHighest(doubles));
            System.out.println("longs: " + ArrayOperations.getHighest(longs));
            System.out.println();
            System.out.println("Lowest Number:");
            System.out.println("integers: " + ArrayOperations.getLowest(ints));
            System.out.println("floats: " + ArrayOperations.getLowest(floats));
            System.out.println("doubles: " + ArrayOperations.getLowest(doubles));
            System.out.println("longs: " + ArrayOperations.getLowest(longs));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
