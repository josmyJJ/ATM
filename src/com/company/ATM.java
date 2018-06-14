package com.company;

import java.util.ArrayList;

public class ATM {

    private ArrayList<Account> accounts;

    public ATM(){
        this.accounts = new ArrayList<>();
    }

    public void addATM(Account oneAccount){
        this.accounts.add(oneAccount);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }


    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public boolean accExists(int accountNum, int accPin){
        for(Account x: this.accounts)
            if (accountNum == x.getAccNumber() && (accPin == x.getAccPin() ))
                return true;
        return false;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "accounts=" + accounts +
                '}';
    }

}
