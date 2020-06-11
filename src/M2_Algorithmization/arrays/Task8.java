package M2_Algorithmization.arrays;

public class Task8 {

    /*
     * Даны действительные числа а1 ,а2 ,..., аn.
     * Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
     */
    // стоит заметить, что в условии нет речи о созранении исходного порядка.
    private static int[] removeMinElements(int[] sequence) {
        int min = getMin(sequence);
        int newLen = sequence.length - getQty(sequence, min);
        int[] result = new int[newLen];

        int counter = 0;
        for (int value : sequence) {
            if (value != min) {
                result[counter] = value;
                counter++;
            }
        }
        return result;
    }

    private static int getMin(int[] sequence) {
        int result = sequence[0];
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] < result) {
                result = sequence[i];
            }
        }
        return result;
    }

    private static int getQty(int[] sequence, int min) {
        int result = 0;
        for (int value : sequence) {
            if (value == min) {
                result++;
            }
        }
        return result;
    }
}
