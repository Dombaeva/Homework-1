package dmdev.amina.cs.homework2;
/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 **/

public class Task2 {
    public static void main(String[] args) {
        int value =  1234567;
        System.out.println(reverseNumber(value));

    }
    private static int reverseNumber(int value) {
        int number = 0;
        int result = 0;
        for (int i = value; i > 0; i /= 10) {
            number = (i % 10);
            result = result * 10 + number;
        }
        return result;
    }
}
