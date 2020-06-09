package M1_Basics_of_software_code_development.branching;

public class Task4 {
    /*
     * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
     * отверстие.
     */
    private static boolean willABrickCrawlTrough(int a, int b, int x, int y, int z) {
        return (x < a && y < b || y < a && x < b) ||
                (x < a && z < b || z < a && x < b) ||
                (y < a && z < b || z < a && y < b);
    }
}
