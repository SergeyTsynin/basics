package M1_Basics_of_software_code_development.cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int number = scanner.nextInt();
        System.out.println(partSumSeries1(number));
        System.out.println(partSumSeries2(number));
    }

    /*
     * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
     * все числа от 1 до введенного пользователем числа.
     */
    private static int partSumSeries1(int number) {
        return (number * (number + 1)) / 2;
    }

    // возможно, вы хотели цикл
    private static int partSumSeries2(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

}
