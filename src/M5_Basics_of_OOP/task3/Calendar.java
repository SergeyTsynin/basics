package M5_Basics_of_OOP.task3;

import java.util.ArrayList;

public class Calendar {
    private ArrayList<Day> date = new ArrayList<>();
    private Day day;

    private class Day {
        private int year;
        private int month;
        private int day;
        private boolean isHoliday;

        void save(int year, int month, int day, boolean isHoliday) {
            this.year = year;
            this.month = month;
            this.day = day;
            this.isHoliday = isHoliday;
        }

        void dislplay() {
            System.out.println(year + "." + month + "." + day + " holiday=" + isHoliday);
        }
    }

    public void createNewDay(int y, int m, int d, boolean isHoliday) {
        day = new Day();
        day.save(y, m, d, isHoliday);
        date.add(day);
    }

    public void displayDayInformation(int dayNumber) {
        date.get(dayNumber).dislplay();
    }
}
