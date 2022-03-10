package com.salesforce;

public class Wallet {

    private int balance;

    public Wallet() {
        this.balance = 0;
    }

    public boolean isEmpty() {
        return this.balance == 0;
    }

    public void addMoney(int amount) {
        if (amount < 0)
            throw new IllegalArgumentException
                ("Cannot accept negative amounts");
        this.balance = amount;
    }

    public void removeMoney(int amount) {
        this.balance -= amount;
    }
}
