package dmdew.oop.homework6;

import java.util.Scanner;

public class ATMRunner {
    public static void main(String[] args) {

        ATM atm = new ATM(10, 30, 300);
        Scanner sc = new Scanner(System.in);
        System.out.println("Сумма снятия: ");
        atm.addMoney10(2);
        atm.addMoney20(5);
        atm.addMoney50(2);
        atm.withdrawMoney(sc.nextInt());
    }
}
