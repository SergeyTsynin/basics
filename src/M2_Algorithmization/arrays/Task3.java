package M2_Algorithmization.arrays;

public class Task3 {

    /*
     * Дан массив действительных чисел, размерность которого N.
     * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
     */
    private static int[] calculateSums(int[] sequence) {
        int[] result = new int[]{0, 0, 0}; // {-,0,+}
        for (int value : sequence) {
            if (value > 0) {
                result[2]++;
            } else if (value == 0) {
                result[1]++;
            } else {
                result[0]++;
            }
        }
        return result;
    }
}
