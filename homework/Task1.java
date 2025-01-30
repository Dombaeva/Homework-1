package dmdev.amina.cs.homeworc;

/**
 * 8В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 **/

public class Task1 {
    public static void main(String[] args) {
        int minutes = 9;
        getPartHour(minutes);
    }

//    public static void getPartHour(int minute) {
//        if (0 <= minute && minute <= 14) {
//            System.out.println("The first part of the hour");
//        } else if (15 <= minute && minute <= 29) {
//            System.out.println("The second part of the hour");
//        } else if (30 <= minute && minute <= 44) {
//            System.out.println("The third part of the hour");
//        } else if (45 <= minute && minute <= 59) {
//            System.out.println("A quarter of an hour");
//        } else {
//            System.out.println("invalid value");
//        }
//
//    }
//}

    public static void getPartHour(int minute) {
        int part = minute / 15;
        if (part == 0) {
            System.out.println("The first part of the hour");
        } else if (part == 1) {
            System.out.println("The second part of the hour");
        } else if (part == 2) {
            System.out.println("The third part of the hour");
        } else if (part == 3) {
            System.out.println("A quarter of an hour");
        } else {
            System.out.println("invalid value");
        }

    }
}
