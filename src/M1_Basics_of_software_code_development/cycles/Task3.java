package M1_Basics_of_software_code_development.cycles;

public class Task3 {

    /*
     * Найти сумму квадратов первых ста чисел.
     */
    private static int squaresSumSeries1(int lim) {
        return (lim * (lim + 1) * (2 * lim + 1)) / 6;
    }

    // и цикл
    private static int squaresSumSeries2(int lim) {
        int result = 0;
        for (int i = 1; i <= lim; i++) {
            result += (i * i);
        }
        return result;
    }
}
