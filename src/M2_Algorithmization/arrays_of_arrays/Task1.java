package M2_Algorithmization.arrays_of_arrays;

public class Task1 {

    /*
     * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
     */
    // исхожу из того, что матрица квадратная. надеюсь это не проблема?
    private static void printOddColumns(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i += 2) {
            if (matrix[0][i] > matrix[size - 1][i]) {
                for (int[] ints : matrix) {
                    System.out.print(ints[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
