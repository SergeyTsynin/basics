package M1_Basics_of_software_code_development.branching;

public class Task3 {
    /*
     * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
     */
    private static boolean isOnLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (x2 == x1 && y2 == y1) return true;
        return ((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1));
    }
}
