package dmdev.amina.cs.homework2;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 **/

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Integer: ");
        final int value = scanner.nextInt();
        countNumbers(value);
    }

    private static void countNumbers(int value) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = value; i != 0; i /= 10) {
            int result = i % 10;
            if (result % 2 == 0) {
                evenCount++;
            } else if (result % 2 == 1) {
                oddCount++;
            }
        }
        System.out.println("Количество четных цифр: " + evenCount);
        System.out.println("Количество нечетных цифр: " + oddCount);
    }
}
