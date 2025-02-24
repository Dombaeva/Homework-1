package dmdew.oop.homework6;


/**
 * Создать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 10, 20 и 50.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение
 * - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала
 * выдаётся сумма. Сначала банкомат будет пытаться рассчитаться 50, далее добавит недостающие
 * 20, и только затем 10 (не нужно рассматривать более сложные варианты выдачи наличных,
 * чтобы не усложнять алгоритм).
 */

public class ATM {

    public static final int NOMINAL_10 = 10;
    public static final int NOMINAL_20 = 20;
    public static final int NOMINAL_50 = 50;

    private int nominal10;
    private int nominal20;
    private int nominal50;

    public ATM(int nominal10, int nominal20, int nominal50) {
        this.nominal10 = nominal10;
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
    }

    public void addMoney10(int count10) {
        if (count10 > 0) {
            this.nominal10 += count10;
        }
    }

    public void addMoney20(int count20) {
        if (count20 > 0) {
            this.nominal20 += count20;
        }
    }

    public void addMoney50(int count50) {
        if (count50 > 0) {
            this.nominal50 += count50;
        }
    }

    public int getTotalAmount() {
        return (nominal10 * NOMINAL_10) + (nominal20 * NOMINAL_20) + (nominal50 * NOMINAL_50);
    }

    public boolean withdrawMoney(int issueAmount) {
        int count10 = 0, count20 = 0, count50 = 0;
        int totalAmount = getTotalAmount();

        if (issueAmount <= 0 || issueAmount > totalAmount) {
            System.out.println("Пожалуйста, введите корректную сумму для снятия.");
            return false;
        }
        if (issueAmount > getTotalAmount()) {
            System.out.println("Недостаточно купюр для выдачи суммы");
            return false;
        }
        while (issueAmount >= NOMINAL_50 && this.nominal50 > 0) {
            issueAmount -= NOMINAL_50;
            this.nominal50--;
            count50++;
        }
        while (issueAmount >= NOMINAL_20 && this.nominal20 > 0) {
            issueAmount -= NOMINAL_20;
            this.nominal20--;
            count20++;
        }
        while (issueAmount >= NOMINAL_10 && this.nominal10 > 0) {
            issueAmount -= NOMINAL_10;
            this.nominal10--;
            count10++;
        }

        System.out.println("Выдано:");
        System.out.println("Купюр по 50: " + count50);
        System.out.println("Купюр по 20: " + count20);
        System.out.println("Купюр по 10: " + count10);
        return true;
    }
}
