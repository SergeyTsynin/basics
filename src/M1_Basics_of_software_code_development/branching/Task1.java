package M1_Basics_of_software_code_development.branching;

public class Task1 {
    /*
     * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
     * он прямоугольным.
     */
    private static void checkTriangle(double alpha, double beta) {
        System.out.println(alpha + beta);
        if (alpha + beta >= 180.0 || alpha <= 0 || beta <= 0) {
            System.out.println("Нет такого треугольника.");
        } else {
            System.out.println("Такой треугольник существует.");
            if (alpha == 90 || beta == 90 || alpha + beta == 90) {
                System.out.println("И он прямоугольный");
            }
        }
    }
}
