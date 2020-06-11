package M2_Algorithmization.arrays_of_arrays;

public class Task4 {

    /*
     * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     *      1   2   3  ...  n
     *      n  n-1 n-2 ...  1
     *      1   2   3  ...  n
     *      n  n-1 n-2 ...  1
     *      .   .   .  ...  .
     *      n  n-1 n-2 ...  1
     */
    private static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            b[n - i - 1] = i + 1;
        }
        for (int i = 0; i < n; i += 2) {
            result[i] = a;
            result[i + 1] = b;
        }
        return result;
    }
}
