package M2_Algorithmization.arrays_of_arrays;

public class Task2 {

    /*
     * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
     */
    private static void printDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
    }
}
