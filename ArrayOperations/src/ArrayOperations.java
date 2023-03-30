/*
 * Ehsan KH. Motlagh
 * student ID: 2340457
 * */

public class ArrayOperations {

    public static int getTotal(int[] values) {
        int total = 0;
        for (int j : values) {
            total += j;
        }
        return total;
    }

    public static float getTotal(float[] values) {
        float total = 0f;
        for (float j : values) {
            total += j;
        }
        return total;
    }

    public static double getTotal(double[] values) {
        double total = 0;
        for (double j : values) {
            total += j;
        }
        return total;
    }

    public static long getTotal(long[] values) {
        long total = 0;
        for (long j : values) {
            total += j;
        }
        return total;
    }

    public static int getAverage(int[] values) {
        return getTotal(values) / values.length;
    }

    public static float getAverage(float[] values) {
        return getTotal(values) / values.length;
    }

    public static double getAverage(double[] values) {
        return getTotal(values) / values.length;
    }

    public static long getAverage(long[] values) {
        return getTotal(values) / values.length;
    }

    public static int getHighest(int[] values) {
        int highest = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i] > highest)
                highest = values[i];
        return highest;
    }

    public static float getHighest(float[] values) {
        float highest = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i] > highest)
                highest = values[i];
        return highest;
    }

    public static double getHighest(double[] values) {
        double highest = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i] > highest)
                highest = values[i];
        return highest;
    }

    public static long getHighest(long[] values) {
        long highest = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i] > highest)
                highest = values[i];
        return highest;
    }

    public static int getLowest(int[] values) {
        int lowest = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i] < lowest)
                lowest = values[i];
        return lowest;
    }

    public static float getLowest(float[] values) {
        float lowest = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i] < lowest)
                lowest = values[i];
        return lowest;
    }

    public static double getLowest(double[] values) {
        double lowest = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i] < lowest)
                lowest = values[i];
        return lowest;
    }

    public static long getLowest(long[] values) {
        long lowest = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i] < lowest)
                lowest = values[i];
        return lowest;
    }

}
