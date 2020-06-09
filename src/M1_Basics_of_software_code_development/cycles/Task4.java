package M1_Basics_of_software_code_development.cycles;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(squaresMulSeries(200));
    }

    /*
     *  Составить программу нахождения произведения квадратов первых двухсот чисел
     */
    private static BigInteger squaresMulSeries(int lim) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= lim; i++) {
            result = result.multiply(BigInteger.valueOf(i * i));
            System.out.println(i + " " + result);
        }
        return result;
    }
}
