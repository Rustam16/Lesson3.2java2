package com.company;

public class BankAccount extends Exception {
    private double amount;

    public double getAmount() {
        return amount;
    }


    public void deposit(double sum) {
        double amount =+ sum;
    }


    public void withDraw(int sum) throws LimitException {
        if (this.amount < sum) {
            throw new LimitException("Limit",sum);
        }

    }
}
