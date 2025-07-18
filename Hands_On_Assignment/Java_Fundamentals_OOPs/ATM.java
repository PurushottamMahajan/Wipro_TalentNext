package tasksprograms;

import java.util.Scanner;

//User class
class User {
 private String name;
 private String accountNumber;
 private ATMAccount account;

 public User(String name, String accountNumber, ATMAccount account) {
     this.name = name;
     this.accountNumber = accountNumber;
     this.account = account;
 }

 public String getName() {
     return name;
 }

 public ATMAccount getAccount() {
     return account;
 }

 public String getAccountNumber() {
     return accountNumber;
 }
}

//ATM Account class
class ATMAccount {
 private double balance;
 private int pin;

 public ATMAccount(double balance, int pin) {
     this.balance = balance;
     this.pin = pin;
 }

 public boolean authenticate(int inputPin) {
     return this.pin == inputPin;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("₹" + amount + " deposited successfully.");
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 public void withdraw(double amount) {
     if (amount <= 0) {
         System.out.println("Invalid withdrawal amount.");
     } else if (amount > balance) {
         System.out.println("Insufficient balance!");
     } else {
         balance -= amount;
         System.out.println("₹" + amount + " withdrawn successfully.");
     }
 }
}

//ATM class
public class ATM {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Creating a user and ATM account
     ATMAccount account = new ATMAccount(10000, 1234); // ₹10,000 and PIN = 1234
     User user = new User("Ravi Kumar", "SBIN123456", account);

     System.out.println("Welcome, " + user.getName());
     System.out.print("Enter 4-digit PIN: ");
     int inputPin = sc.nextInt();

     if (user.getAccount().authenticate(inputPin)) {
         int choice;
         do {
             System.out.println("\n==== ATM Menu ====");
             System.out.println("1. Check Balance");
             System.out.println("2. Deposit");
             System.out.println("3. Withdraw");
             System.out.println("4. Exit");
             System.out.print("Choose: ");
             choice = sc.nextInt();

             switch (choice) {
                 case 1:
                     System.out.println("Available Balance: ₹" + user.getAccount().getBalance());
                     break;
                 case 2:
                     System.out.print("Enter amount to deposit: ₹");
                     double deposit = sc.nextDouble();
                     user.getAccount().deposit(deposit);
                     break;
                 case 3:
                     System.out.print("Enter amount to withdraw: ₹");
                     double withdraw = sc.nextDouble();
                     user.getAccount().withdraw(withdraw);
                     break;
                 case 4:
                     System.out.println("Thank you for using ATM!");
                     break;
                 default:
                     System.out.println("Invalid choice. Try again.");
             }
         } while (choice != 4);
     } else {
         System.out.println("Invalid PIN. Access denied.");
     }

     sc.close();
 }
}

