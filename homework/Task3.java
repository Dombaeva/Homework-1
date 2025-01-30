package dmdev.amina.cs.homeworc;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 **/

public class Task3 {
    public static void main(String[] args) {
        int sideA = 6;
        int sideB = 7;

        int side1A = 8;
        int side1B = 9;

        double tringle1 = getArea(sideA, sideB);
        double tringle2 = getArea(side1A, side1B);
        System.out.println("Площадь первого треугольника: " + tringle1);
        System.out.println("Площадь второго треугольника: " + tringle2);
        getMax(tringle1, tringle2);
    }

    public static double getArea(int a, int b) {
        return (a * b) / 2;
    }

    public static void getMax(double tringle1, double tringle2) {
        if (tringle1 > tringle2) {
            System.out.println("Первый треуголник больше");
        } else if (tringle1 == tringle2) {
            System.out.println("Первый треугольник равен второму");
        } else {
            System.out.println("Второй треуголник больше");
        }
    }
}
