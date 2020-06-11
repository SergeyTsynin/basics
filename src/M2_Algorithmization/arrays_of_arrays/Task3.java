package M2_Algorithmization.arrays_of_arrays;

public class Task3 {

    /*
     *  Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
     */
    private static void printMatrixLine(int[][] a, int k) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[k][i] + " ");
        }
        System.out.println();
    }

    private static void printMatrixColumn(int[][] a, int p) {
        for (int[] ints : a) {
            System.out.print(ints[p] + " ");
        }
        System.out.println();
    }
}
