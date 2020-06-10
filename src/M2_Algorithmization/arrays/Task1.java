package M2_Algorithmization.arrays;

public class Task1 {

    /*
     * В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
     */
    private static int sumOfElements(int[] sequence, int k) {
        int sum = 0;
        for (int value : sequence) {
            if (value % k == 0) sum += value;
        }
        return sum;
    }
}
