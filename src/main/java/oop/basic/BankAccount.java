package oop.basic;

public class BankAccount {
    double balance;

    public BankAccount() {
        this.balance = balance;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount)
    {
        balance=balance+amount;
    }

    public void withdraw(double amount)
    {
        balance=balance-amount;
    }

}
