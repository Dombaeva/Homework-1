package homework3;

import java.util.Arrays;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива
 * и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */
public class Task2Arrays {
    public static void main(String[] args) {
        char[] symbols = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] intArray = convertChar(symbols);
        double average = calculateAverage(intArray);
        System.out.println("Среднее арифметическое: " + average);
        printAboveAverage(intArray, average);
    }

    private static int[] convertChar(char[] symbols) {
        int[] intArray = new int[symbols.length];
        for (int i = 0; i < symbols.length; i++) {
            intArray[i] = (int) symbols[i];
        }
        System.out.print(Arrays.toString(intArray));
        return intArray;
    }

    private static double calculateAverage(int[] intArray) {
        int sum = 0;
        for (int value : intArray) {
            sum += value;
        }
        return (double) sum / intArray.length;
    }

    private static void printAboveAverage(int[] intArray, double average) {
        for (int value : intArray) {
            if (value > average) {
                System.out.print(value + " ");
            }
        }


    }
}

