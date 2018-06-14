package com.company;

public class Account {
    private int accNumber;
    private int accPin;
    private double balance;
    private String username;

    public Account(){

    }

    public Account(int accNumber, int accPin, double balance, String username) {
        this.accNumber = accNumber;
        this.accPin = accPin;
        this.balance = balance;
        this.username = username;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getAccPin() {
        return accPin;
    }

    public void setAccPin(int accPin) {
        this.accPin = accPin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Deposit - update balance
    // Withdraw - update balance

    void deposit(double num){
        double previousBal = getBalance();
        double newTotal = previousBal + num;
        setBalance(newTotal);
    }

    void withdraw(double num){
        double previous = getBalance();
        double newTotal = previous - num;
        setBalance(newTotal);
    }

    String currBal(){
        return String.format("Your current balance is $%.2f\n", getBalance());
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber=" + accNumber +
                ", accPin=" + accPin +
                ", balance=" + balance +
                ", username='" + username + '\'' +
                '}';
    }
}
