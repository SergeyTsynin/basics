package M2_Algorithmization.arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] seq = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(seq));
        System.out.println(limitArray(seq, 6));
        System.out.println(Arrays.toString(seq));
    }

    /*
     * Дана последовательность действительных чисел а1 ,а2 ,..., ап.
     * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
     */
    private static int limitArray(int[] sequence, int lim) {
        int changes = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > lim) {
                sequence[i] = lim;
                changes++;
            }
        }
        return changes;
    }
}
