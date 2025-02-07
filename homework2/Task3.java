package dmdev.amina.cs.homework2;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 **/

public class Task3 {
    public static void main(String[] args) {
        int salary = 600;
        double vanyaAccount = 0;
        double brokerAccount = 0;
        int expenses = 300;
        double investmentPercent = 0.10;
        double investmentReturn = 0.02;
        int interval = 6;
        int salaryIncreaseAmount = 400;
        int totalMonths = 38;

        getVanyaAccount(vanyaAccount, interval, salary, totalMonths, salaryIncreaseAmount, investmentPercent, expenses, brokerAccount, investmentReturn);
    }

    private static void getVanyaAccount(double vanyaAccount, int interval, int salary, int totalMonths, int salaryIncreaseAmount, double investmentPercent, int expenses, double brokerAccount, double investmentReturn) {
        for (int i = 1; i <= totalMonths; i++) {
            if (i % 6 == 0) {
                salary += salaryIncreaseAmount;
            }
            double investment = salary * investmentPercent;
            vanyaAccount += salary - expenses - investment;
            brokerAccount += investment;

            brokerAccount *= (1 + investmentReturn);

        }
        System.out.println("Счет Вани: " + vanyaAccount);
        System.out.println("Брокер счет: " + brokerAccount);
        System.out.println("Общая сумма: " + (vanyaAccount + brokerAccount));

    }
}