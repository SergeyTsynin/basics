package M2_Algorithmization.arrays;

public class Task2 {

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
