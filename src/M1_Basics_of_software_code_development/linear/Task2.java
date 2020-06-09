package M1_Basics_of_software_code_development.linear;

public class Task2 {
    /*
     * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
     *      (b+sqrt(b^2+4ac))/2a-a^3*c+b^-2
     */
    private static double function(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a)
                - (Math.pow(a, 3) * c)
                + (1 / Math.pow(b, 2));
    }
}
