package M1_Basics_of_software_code_development.branching;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(function(3));
    }

    /*
     * Вычислить значение функции:
     *  x^2-3x+9  если x <= 3
     *  1/(x^3+6) если x > 3
     */
    private static double function(double x) {
        if (x <= 3) {
            return Math.pow(x, 2) - 3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) + 6);
        }
    }
}
