# ATM

Create an application that will simulate an ATM's operations.

There must be at least the following classes:

ATM - contains methods to prompt user and receive input from the user. The only class in which the System.out.printtln statements are allowed in is the ATM class. The ATM class must not know any information about the user. It will simply create an Account class and print information from the Account class.

The ATM class will allow the user to make a deposit, make a withdraw or check the balance.The ATM class must also display the results of any transaction or inquiry.

Account class - contains the account number, user name, balance,PIN. Deposits and withdraws must update the balance.

The main method will simply call the ATM class and the  ATM class will  interact with the user and with the Account class. There should be MINIMAL logic in the main method.

The screen should print out just like the ATMs you've used in real life. It should prompt you to enter your account number (since we can't insert the card) and enter your PIN.

The ATM class should validate the PIN and the Account Number. If the user enters the incorrect PIN three times the ATM should lock the user out so they can't log in with the correct PIN on the fourth try. Simply hardcode three account numbers and their PINs and use if statements to ensure the user has entered the correct PIN.

