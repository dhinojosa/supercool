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
        this.balance = amount;
    }

    public void removeMoney(int amount) {
        this.balance -= amount;
    }
}
