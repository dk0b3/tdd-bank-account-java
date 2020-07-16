package org.xpdojo.bank;

public class Account {
    private int balance = 0;

    public Account() {
    }

    public Account(int amount) {
        this.balance = amount;
    }

    public int balance() {
        return balance;
    }

    public void deposit(int amount) {
        balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        balance = this.balance - amount;
    }

    public void transfer(Account account_to, int amount) {
        account_to.deposit(amount);
        this.balance = this.balance - amount;
    }
}

