package M2_Algorithmization.arrays;

import java.util.Arrays;

public class Task6 {

    /*
     * Задана последовательность N вещественных чисел.
     * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
     */
    private static double sumOfSomething(double[] sequence) {
        double result = 0;
        for (int i = 1; i < sequence.length; i++) {
            if (numberIsPrime(i + 1)) {
                result += sequence[i];
            }
        }
        return result;
    }

    private static boolean numberIsPrime(int num) {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
