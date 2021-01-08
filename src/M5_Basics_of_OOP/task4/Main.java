package M5_Basics_of_OOP.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
     * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
     * дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
     * выбора сокровищ на заданную сумму.
     */
    private static Treasure[] treasuresCave = new Treasure[10];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command;
        fillCave();

        do {
            System.out.println("\r\nСведения о сокровищах\r\n" +
                    "1 - Show all\r\n" +
                    "2 - Show the most expensive\r\n" +
                    "3 - Get for sum\r\n" +
                    "0 - Exit");
            command = reader.readLine().trim();
            switch (command) {
                case "1":
                    showAll();
                    break;
                case "2":
                    System.out.println(getTheMostExpensive());
                    break;
                case "3":
                    System.out.println("Please enter sum");
                    command = reader.readLine().trim();
                    try {
                        int sum = Integer.valueOf(command);
                        System.out.println("selected:");
                        for (Treasure treasure : selectForSum(sum)) {
                            System.out.println(treasure);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Next time please enter the number\r\n");
                    }
                    break;
            }
        } while (!command.equals("0"));
    }

    private static void fillCave() {
        for (int i = 0; i < 10; i++) {
            treasuresCave[i] = new Treasure();
        }
    }

    private static void showAll() {
        for (Treasure treasure : treasuresCave) {
            System.out.println(treasure);
        }
    }

    private static Treasure getTheMostExpensive() {
        Treasure result = treasuresCave[0];
        for (int i = 1; i < treasuresCave.length; i++) {
            if (treasuresCave[i].getPrice() > result.getPrice()) {
                result = treasuresCave[i];
            }
        }
        return result;
    }

    private static Treasure[] selectForSum(int sum) {
        List<Treasure> heap = new ArrayList<>(Arrays.asList(treasuresCave));
        List<Treasure> result = new ArrayList<>();
        Collections.sort(heap);

        do {
            for (int i = 0; i < heap.size(); i++) {
                Treasure treasure = heap.get(i);
                if (treasure.getPrice() < sum) {
                    sum -= treasure.getPrice();
                    result.add(treasure);
                    heap.remove(treasure);
                    break;
                }
            }
        } while (sum > heap.get(heap.size() - 1).getPrice());

        return result.toArray(new Treasure[0]);
    }
}
