package homework3;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */
public class Task3Arrays {
    public static void main(String[] args) {
        int[] values = {-4, 0, 1, 9, 0, -18, 3};
        System.out.println("Изначальный массив: " + Arrays.toString(values));
        getNegativeNumbers(values);
        getPositiveNumbers(values);
        getZeros(values);
    }

    private static int[] getNegativeNumbers(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                count++;
            }
        }
        int[] negativeArrays = new int[count];
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                negativeArrays[index] = values[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(negativeArrays));
        return negativeArrays;
    }

    private static int[] getPositiveNumbers(int[] values) {
        int count2 = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                count2++;
            }
        }
        int[] positiveArrays = new int[count2];
        int index2 = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                positiveArrays[index2] = values[i];
                index2++;
            }
        }
        System.out.println(Arrays.toString(positiveArrays));
        return positiveArrays;
    }

    private static int[] getZeros(int[] values) {
        int count3 = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                count3++;
            }
        }
        int[] zeros = new int[count3];
        int index3 = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                zeros[index3] = values[i];
                index3++;
            }
        }
        System.out.println(Arrays.toString(zeros));
        return zeros;
    }

}

