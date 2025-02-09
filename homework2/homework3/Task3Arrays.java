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
        getNumbers(values);
    }
    private static void getNumbers(int[] values) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                count1++;
            } else if (values[i] > 0) {
                count2++;
            } else if (values[i] == 0) {
                count3++;
            }
        }
        int[] negativeArrays = new int[count1];
        int[] positiveArrays = new int[count2];
        int[] zeros = new int[count3];

        int index = 0;
        int index2 = 0;
        int index3 = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                negativeArrays[index] = values[i];
                index++;
            } else if (values[i] > 0) {
                positiveArrays[index2] = values[i];
                index2++;
            } else if (values[i] == 0) {
                zeros[index3] = values[i];
                index3++;
            }
            {

            }
        }
        System.out.println(Arrays.toString(negativeArrays));
        System.out.println(Arrays.toString(positiveArrays));
        System.out.println(Arrays.toString(zeros));

    }
}

