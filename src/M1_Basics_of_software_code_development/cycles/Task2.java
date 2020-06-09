package M1_Basics_of_software_code_development.cycles;

public class Task2 {

    /*
     * Вычислить значения функции на отрезке [а,b] c шагом h:
     * y =  x: x  > 2
     * y = -x: x <= 2
     */
    private static double[] function(double a, double b, double h) {
        int size = (int) Math.round((b - a + 1.0) / h);
        double[] result = new double[size];
        double value = a;
        for (int i = 0; i < size; i++) {
            result[i] = (value > 2) ? value : -value;
            System.out.println(value);
            value += h;
        }
        return result;
    }
}
