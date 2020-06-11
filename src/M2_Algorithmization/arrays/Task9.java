package M2_Algorithmization.arrays;

public class Task9 {

    /*
     * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
     * Если таких чисел несколько, то определить наименьшее из них.
     */
    private static int getMinFromMostPopular(int[] sequence) {
        int result = sequence[0];
        int maxFreq = 0;
        for (int value : sequence) {
            int curFreq = getFrequency(sequence, value);
            if (curFreq > maxFreq) {
                maxFreq = curFreq;
                result = value;
            } else if (curFreq == maxFreq && value < result) {
                result = value;
            }
        }
        return result;
    }

    private static int getFrequency(int[] sequence, int num) {
        int result = 0;
        for (int value : sequence) {
            if (value == num) {
                result++;
            }
        }
        return result;
    }
}
