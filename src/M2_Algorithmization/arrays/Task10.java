package M2_Algorithmization.arrays;

public class Task10 {

    /*
     * Дан целочисленный массив с количеством элементов п.
     * Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
     * Примечание. Дополнительный массив не использовать.
     */
    private static void strangeCompression(int[] seq) {
        for (int i = 1; i < (seq.length / 2) + 1; i++) {
            moveTail(seq, i);
        }
    }

    private static void moveTail(int[] seq, int start) {
        if (seq.length - 1 - start >= 0) {
            System.arraycopy(seq, start + 1, seq, start, seq.length - 1 - start);
        }
        seq[seq.length - 1] = 0;
    }
}
