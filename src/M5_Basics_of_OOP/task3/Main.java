package M5_Basics_of_OOP.task3;

public class Main {
    /**
     * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
     * выходных и праздничных днях
     */
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.createNewDay(2000, 12, 31, true);
        calendar.createNewDay(2001, 12, 10, false);
        calendar.displayDayInformation(0);
        calendar.displayDayInformation(1);
    }
}
