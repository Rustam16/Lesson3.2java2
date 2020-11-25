package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        Scanner sc= new Scanner(System.in);
            while (true) {
            System.out.println(bankAccount.getAmount());
            try {
                bankAccount.withDraw(6000);
                sc.nextInt();
            } catch (LimitException a) {
                System.out.println(a.getMessage()+sc.nextInt());
                try {
                    sc.nextInt();
                    bankAccount.withDraw((int) (a.getRemainingAmount()));
                } catch (LimitException e) {
                    System.out.println(e.getMessage());
                    System.out.println(sc.nextLine());
                }
                break;
            }
        }
    }
}
