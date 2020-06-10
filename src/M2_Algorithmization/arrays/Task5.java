package M2_Algorithmization.arrays;

public class Task5 {

    /*
     * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
     */
    private static void showDigitIfMoreThanSerial(int[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > i + 1) {
                // почти печать. только в консоль.
                System.out.println(sequence[i]);
            }
        }
    }
}
