package M4_Programming_with_classes.primitive_classes_and_objects;

public class DecimalCounter {
    /*
     * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
     * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
     * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
     * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
     */
    private int value;
    private final int MIN_VALUE;
    private final int MAX_VALUE;

    public static void main(String[] args) {
        DecimalCounter counter0 = new DecimalCounter(0, 5, -10);
        System.out.println(counter0.getValue());
        DecimalCounter counter1 = new DecimalCounter(0, 5);
        System.out.println(counter1.getValue());
        counter1.increment();
        System.out.println(counter1.getValue());
        counter1.decrement();
        System.out.println(counter1.getValue());
    }

    private DecimalCounter(int min, int max, int value) {
//        if (MAX_VALUE <= MIN_VALUE) throw new Exception("wrong counter range");
        this.value = value;
        MIN_VALUE = min;
        MAX_VALUE = max;
        putValueIntoRange();
    }

    private DecimalCounter(int min, int max) {
//        if (MAX_VALUE <= MIN_VALUE) throw new Exception("wrong counter range");
        value = min;
        MIN_VALUE = min;
        MAX_VALUE = max;
    }

    private int getValue() {
        return value;
    }

    private void increment() {
        value++;
        putValueIntoRange();
    }

    private void decrement() {
        value--;
        putValueIntoRange();
    }

    private void putValueIntoRange() {
        if (value < MIN_VALUE) value = MAX_VALUE;
        if (value > MAX_VALUE) value = MIN_VALUE;
    }
}
