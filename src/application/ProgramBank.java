package application;

import entities.Bank;

import java.util.Scanner;

public class ProgramBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accHolder = sc.nextLine();

        double accValue = 0;

        System.out.print("Is there an initial deposit (y/n)? ");
        String resp = sc.next();

        if (resp.equalsIgnoreCase("y")) {
            System.out.println("Enter initial deposit value: ");
            accValue = sc.nextDouble();
        }

        Bank bank = new Bank(accNumber, accHolder, accValue);

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.println("Enter a deposit value: ");
        int addValue = sc.nextInt();
        bank.depositValue(addValue);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        int wValue = sc.nextInt();
        bank.withdrawValue(wValue);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(bank);


    }
}
