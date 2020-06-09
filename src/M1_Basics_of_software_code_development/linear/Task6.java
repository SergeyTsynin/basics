package M1_Basics_of_software_code_development.linear;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(isPainted(-3, 1));
    }

    /*
     * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
     * принадлежит закрашенной области, и false — в противном случае:
     */
    private static boolean isPainted(int x, int y) {
        if (y == -1 && x == 0) return false;
        int absX = (x > 0) ? x : -x;
        if (y < 0) {
            return (y >= -3) && (absX <= 4);
        } else {
            return (y <= 4) && (absX <= 2);
        }
    }
}
