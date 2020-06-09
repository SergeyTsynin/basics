package M1_Basics_of_software_code_development.branching;

public class Task2 {
    /*
     * Найти max{min(a, b), min(c, d)}.
     */
    private static int solution1(int a, int b, int c, int d) {
        return getMax(getMin(a, b), getMin(c, d));
    }

    private static int getMin(int a, int b) {
        return (a < b) ? a : b;
    }

    private static int getMax(int a, int b) {
        return (a > b) ? a : b;
    }

    // solution2 > use Math.min() + Math.max()
    // solution3 > use Integer.min() + Integer.max()
}
