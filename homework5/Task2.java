package dmdew.oop.homework5;


import java.util.Arrays;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2 {
    public static void main(String[] args) {
        String text = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] digitArrays = getArrays(text);
        System.out.println(Arrays.toString(digitArrays));
        System.out.println(getSumArrays(digitArrays));

    }

    private static int[] getArrays(String text) {
        StringBuilder digitString = new StringBuilder();
        for (char i : text.toCharArray()) {
            if (Character.isDigit(i)) {
                digitString.append(i);
            }
        }
        int[] arrayOfDigits = new int[digitString.length()];
        for (int i = 0; i < digitString.length(); i++) {
            arrayOfDigits[i] = Character.getNumericValue(digitString.charAt(i));
        }
        return arrayOfDigits;
    }

    private static int getSumArrays(int[] arrayOfDigits) {
        return Arrays.stream(arrayOfDigits).sum();
    }

}
