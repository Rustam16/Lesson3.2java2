package com.company;


public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
            while (true) {
            System.out.println(bankAccount.getAmount());
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException a) {
                System.out.println(a.getMessage());
                try {
                    bankAccount.withDraw((int) (a.getRemainingAmount()));
                } catch (LimitException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
    }
}
