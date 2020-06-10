package M1_Basics_of_software_code_development.cycles;

public class Task8 {

    /*
     * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
     */
    // надеюсь, речь не шла о числах с плавающей точкой?
    private static void getDuplicateDigits(double a, double b) {
        String sa = doubleToString(a);
        String sb = doubleToString(b);
        for (char c = '0'; c <= '9'; c++) {
            if (sa.indexOf(c) >= 0 && sb.indexOf(c) >= 0) {
                System.out.println("число " + c + " подходит под условие");
            }
        }
    }

    private static String doubleToString(double d) {
        if (d == (int) d) {
            return Integer.toString((int) d);
        } else {
            return Double.toString(d);
        }
    }
}
