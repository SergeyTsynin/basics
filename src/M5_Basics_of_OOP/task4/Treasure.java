package M5_Basics_of_OOP.task4;

import java.util.Random;

public class Treasure implements Comparable<Treasure> {

    private String name;
    private int price;

    private final String[] N1 = {"золотой", "несравненный", "прекрасный", "умный", "невидимый", "острый", "тупой", "левый"};
    private final String[] N2 = {"топор", "камень", "глаз", "бриллиант", "слиток", "артефакт", "фрукт", "кирпич", "админ"};
    private final String[] N3 = {"удачи", "счастья", "здоровья", "веселья", "мести", "маскировки", "лёгкой смерти"};

    Treasure() {
        this.name = generateName();
        this.price = generatePrice();
    }

    private int generatePrice() {
        Random random = new Random();
        return random.nextInt(32768);
    }

    private String generateName() {
        return getRandomString(N1) + ' ' +
                getRandomString(N2) + ' ' +
                getRandomString(N3);
    }

    private String getRandomString(String[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }

    int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Treasure o) {
        return o.getPrice() - this.getPrice();
    }
}
