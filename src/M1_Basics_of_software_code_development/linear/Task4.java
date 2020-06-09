package M1_Basics_of_software_code_development.linear;

public class Task4 {
    /*
     * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
     * дробную и целую части числа и вывести полученное значение числа.
     */
    private static double swap(double R) {
        String[] s = Double.toString(R).split("\\.");
        return Double.parseDouble(s[1] + "." + s[0]);
    }
}
