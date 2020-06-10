package M1_Basics_of_software_code_development.cycles;

public class Task6 {

    /*
     * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
     */
    private static void showSymbols() {
        for (int i = 0x20; i <= 0xFFFF; i++) {
            System.out.println(i + " - " + (char) i);
        }
    }
}
