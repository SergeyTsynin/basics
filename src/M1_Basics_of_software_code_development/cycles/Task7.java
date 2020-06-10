package M1_Basics_of_software_code_development.cycles;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int m = scanner.nextInt();
        System.out.println("Input second number");
        int n = scanner.nextInt();
        showDividersForNumbersInRange(m, n);
    }

    /*
     * Для каждого натурального числа в промежутке от m до n вывести все делители,
     * кроме единицы и самого числа. m и n вводятся с клавиатуры.
     */
    private static void showDividersForNumbersInRange(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.print("for number: " + i + " div.: ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
