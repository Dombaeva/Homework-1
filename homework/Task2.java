package dmdev.amina.cs.homeworc;

/**
 * Даны 3 переменные:
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * <p>
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 **/

public class Task2 {
    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operation = '+';
        System.out.println(resultsOfOperations(operand1, operand2, operation));
    }

    public static double resultsOfOperations(double operand1, double operand2, char operation) {
        if (operation == '+') {
            return operand1 + operand2;
        } else if (operation == '-') {
            return operand1 - operand2;
        } else if (operation == '*') {
            return operand1 * operand2;
        } else if (operation == '/') {
            return operand1 / operand2;
        } else {
            return operand1 % operand2;
        }
    }
}
