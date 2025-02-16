package dmdew.oop.homework5;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Task1 {
    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {

        String value = "abc Cpddd Dio OsfWw";
        System.out.println(deleteIdenticalLetters(value));

    }

    public static String deleteIdenticalLetters(String value) {
        String newValue = value.replace(SPACE, EMPTY).toUpperCase();
        StringBuilder result = new StringBuilder();

        for (int currentIndex = 0; currentIndex < newValue.length(); currentIndex++) {
            if (currentIndex == 0 || newValue.charAt(currentIndex) != newValue.charAt(currentIndex - 1)) {
                result.append(newValue.charAt(currentIndex));
            }
        }
        return result.toString();
    }
}
