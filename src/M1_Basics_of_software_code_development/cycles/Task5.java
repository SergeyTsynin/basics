package M1_Basics_of_software_code_development.cycles;

public class Task5 {

    /*
     * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
     * заданному е. Общий член ряда имеет вид: a[n] = (1/2^n)+(1/3^n)
     */
    private static double function(int n, double e) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            double member = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (member >= e) {
                result += member;
            }
        }
        return result;
    }
}
