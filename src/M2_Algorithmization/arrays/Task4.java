package M2_Algorithmization.arrays;

public class Task4 {

    /*
     * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
     */
    private static void arrayMinMaxSwap(int[] sequence) {
        int min = sequence[0];
        int max = sequence[0];
        for (int i = 1; i < sequence.length; i++) {
                if (sequence[i] > max) {
                max = sequence[i];
            }
            if (sequence[i] < min) {
                min = sequence[i];
            }
        }
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == min) {
                sequence[i] = max;
            } else if (sequence[i] == max)
                sequence[i] = min;
        }
    }
}
