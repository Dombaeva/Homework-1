package homework3;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class Task1Arrays {
    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};
        deleteNegativeNumbers(values);

    }

    private static void deleteNegativeNumbers(int[] values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                result++;
            }
        }
        int[] newArrays = new int[result];
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                newArrays[count] = values[i];
                newArrays[count] *= newArrays.length;
                count++;
            }
        }
        System.out.println(Arrays.toString(newArrays));
    }
}