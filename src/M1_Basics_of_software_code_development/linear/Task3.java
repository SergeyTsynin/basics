package M1_Basics_of_software_code_development.linear;

public class Task3 {
    /*
     * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
     *  ((sin x + cos y)/(cos x - sin y)) * tg xy
     */
    private static double function(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
    }
}
