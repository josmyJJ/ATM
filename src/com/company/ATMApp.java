package com.company;

import java.util.Scanner;

public class ATMApp {
    static Scanner input = new Scanner(System.in);

    //Create an ATM object
    static ATM anAtm = new ATM();

    static int accNumber;
    static int accPin;
    static int repeat;
    static boolean result;

    // create account object
    //static Account acc = new Account();

    public static void main(String[] args) {
        customers();
        //System.out.println(anAtm.getAccounts().toString());
        receiveInput();
    }

    // Get Pin and account number from the user
    public static void receiveInput() {

        do{
            System.out.println("Please Enter your account number: ");
            accNumber = input.nextInt();

            for (Account acc : anAtm.getAccounts()) {
                if (acc.getAccNumber() == accNumber) {
                    // check if the account number exists
                     //{
                        //System.out.println("Correct!");
                        // if account number is correct ask for pin number
                        System.out.println("Enter your pin");
                        accPin = input.nextInt();

                        // check account number and pin combination
                        if (acc.getAccNumber() == accNumber && acc.getAccPin() == accPin) {
                            // welcome the user back
                            System.out.println("Welcome to your account: ");
                            // ask if they want to deposit or withdraw
                            int response;
                            System.out.println("Type 1 for Deposit: ");
                            System.out.println("Type 2 for Withdraw: ");
                            System.out.println("Type 3 to check Balance: ");
                            response = input.nextInt();

                            if (response == 1) {
                                System.out.println("How much do you want to deposit?");
                                double amt = input.nextDouble();
                                // Create a method for depositing
                                acc.getBalance();
                                System.out.printf("You deposited $%.2f\n", amt);
                                // Create a method for balance
                                System.out.println(acc.currBal());
                            } else if (response == 2) {
                                System.out.println("How much do you want to withdraw?");
                                double amt = input.nextDouble();
                                // Create a method for withdraw
                                acc.withdraw(amt);
                                System.out.printf("You withdrew $%.2f\n", amt);
                                // Create a method for checking balance after chcking balance
                                System.out.println(acc.currBal());
                            } else if (response == 3) {
                                // Print out the current balance
                                System.out.println(acc.currBal());
                            } else
                                System.out.println("Invalid Input...!");
                        }
                        // else
                        // ask the user to try again -- while loop
                        // kick the user out if they make more than 3 failed attempts
                    } else {
                        //System.out.println("Dosen't exists");
                    }
                }
            } while (repeat++ <2 );
    }

    // Create customers and add them to the ATM
    public static void customers(){
        // Create some customers
        Account acount1 = new Account(5555, 4545, 34000, "Tom");
        Account acount2 = new Account(5556, 4546, 44000, "Sarah");
        Account acount3 = new Account(5557, 4547, 4000, "John");
        // Add accounts to the
        anAtm.addATM(acount1);
        anAtm.addATM(acount2);
        anAtm.addATM(acount3);
    }
}
