package M4_Programming_with_classes.primitive_classes_and_objects;

public class Time {
    /*
     * Составьте описание класса для представления времени.
     * Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
     * с проверкой допустимости вводимых значений.
     * В случае недопустимых значений полей поле устанавливается в значение 0.
     * Создать методы изменения времени на заданное количество часов, минут и секунд.
     */

    private int hour;
    private int minute;
    private int second;

    private final int MAX_HOUR = 24;
    private final int MAX_MINUTE = 60;
    private final int MAX_SECOND = 60;
    private final int MAX_TIME = MAX_HOUR * MAX_MINUTE * MAX_SECOND;

    private void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    private void setHour(int hour) {
        this.hour = checkRange(hour, MAX_HOUR);
    }

    private void setMinute(int minute) {
        this.minute = checkRange(minute, MAX_MINUTE);
    }

    private void setSecond(int second) {
        this.second = checkRange(second, MAX_SECOND);
    }

    private void plusHours(int hours) {
        minusHours(-hours);
    }

    private void plusMinutes(int minutes) {
        minusMinutes(-minutes);
    }

    private void plusSeconds(int seconds) {
        minusSeconds(-seconds);
    }

    private void minusHours(int hours) {
        minusMinutes(hours * MAX_MINUTE);
    }

    private void minusMinutes(int minutes) {
        minusSeconds(minutes * MAX_SECOND);
    }

    private void minusSeconds(int seconds) {
        int diff = (timeToSeconds() - seconds) % MAX_TIME;
        if (diff >= 0) {
            secondsToTime(diff);
        } else {
            secondsToTime(MAX_TIME + diff);
        }
    }

    private int checkRange(int newValue, int MAX_HOUR) {
        if (newValue < 0 || newValue >= MAX_HOUR) {
            return 0;
        } else {
            return newValue;
        }
    }

    private int timeToSeconds() {
        return second + minute * MAX_SECOND + hour * MAX_MINUTE * MAX_SECOND;
    }

    private void secondsToTime(int seconds) {
        this.second = seconds % MAX_SECOND;
        this.minute = seconds / MAX_SECOND % MAX_MINUTE;
        this.hour = seconds / (MAX_MINUTE * MAX_SECOND) % MAX_HOUR;
    }
}
