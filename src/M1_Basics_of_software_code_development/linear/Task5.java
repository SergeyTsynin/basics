package M1_Basics_of_software_code_development.linear;

public class Task5 {
    /*
     * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
     * данное значение длительности в часах, минутах и секундах в следующей форме:
     * ННч ММмин SSc.
     */
    private static String getHHMMSS(int seconds) {
        int hrs = seconds / 3600;
        if (hrs > 99) hrs = 99;
        int min = seconds / 60 % 60;
        int sec = seconds % 60;
        return String.format("%02dч %02dмин %02dc.", hrs, min, sec);
    }

}
