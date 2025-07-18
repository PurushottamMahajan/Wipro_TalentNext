package tasksprograms;

import java.util.*;

//Interface
interface Account {
 void deposit(double amount);
 void withdraw(double amount);
 void calculateInterest();
 void viewBalance();
 String getAccountType();
 int getAccountNumber(); // new method for account number
}

//SavingAccount class
class SavingAccount implements Account {
 private int accountNumber;
 private double balance;
 private double interestRate;

 public SavingAccount(int accountNumber, double initialBalance, double interestRate) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
     this.interestRate = interestRate;
 }

 public int getAccountNumber() {
     return accountNumber;
 }

 public String getAccountType() {
     return "Saving Account";
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited to Saving: ₹" + amount);
 }

 public void withdraw(double amount) {
     if (amount > balance) {
         System.out.println("Insufficient balance in Saving account.");
     } else {
         balance -= amount;
         System.out.println("Withdrawn from Saving: ₹" + amount);
     }
 }

 public void calculateInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest added to Saving: ₹" + interest);
 }

 public void viewBalance() {
     System.out.println("Saving Account Balance: ₹" + balance);
 }
}

//CurrentAccount class
class CurrentAccount implements Account {
 private int accountNumber;
 private double balance;
 private double overdraftLimit;

 public CurrentAccount(int accountNumber, double initialBalance, double overdraftLimit) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
     this.overdraftLimit = overdraftLimit;
 }

 public int getAccountNumber() {
     return accountNumber;
 }

 public String getAccountType() {
     return "Current Account";
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited to Current: ₹" + amount);
 }

 public void withdraw(double amount) {
     if (amount > balance + overdraftLimit) {
         System.out.println("Withdrawal exceeds overdraft limit in Current account.");
     } else {
         balance -= amount;
         System.out.println("Withdrawn from Current: ₹" + amount);
     }
 }

 public void calculateInterest() {
     System.out.println("No interest for Current accounts.");
 }

 public void viewBalance() {
     System.out.println("Current Account Balance: ₹" + balance);
 }
}

//Bank class
class Bank {
 private List<Account> accounts = new ArrayList<>();
 private int nextAccountNumber = 1001;

 public void addAccount(Account account) {
     accounts.add(account);
     System.out.println(account.getAccountType() + " [Acc No: " + account.getAccountNumber() + "] added to the bank.\n");
 }

 public int generateAccountNumber() {
     return nextAccountNumber++;
 }

 public void showAllAccounts() {
     System.out.println("\n--- All Accounts in Bank ---");
     if (accounts.isEmpty()) {
         System.out.println("No accounts in the bank.");
     } else {
         for (Account acc : accounts) {
             System.out.println(acc.getAccountType() + " [Acc No: " + acc.getAccountNumber() + "]");
             acc.viewBalance();
         }
     }
 }
}

//Main class
public class BankingSystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Bank bank = new Bank();

     while (true) {
         System.out.println("\n=== Bank Menu ===");
         System.out.println("1. Create Saving Account");
         System.out.println("2. Create Current Account");
         System.out.println("3. Display All Accounts");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         int choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter initial balance: ₹");
                 double savBal = sc.nextDouble();
                 System.out.print("Enter interest rate (%): ");
                 double rate = sc.nextDouble();
                 int accNum1 = bank.generateAccountNumber();
                 SavingAccount sa = new SavingAccount(accNum1, savBal, rate);
                 bank.addAccount(sa);
                 accountOperations(sa, sc);
                 break;

             case 2:
                 System.out.print("Enter initial balance: ₹");
                 double curBal = sc.nextDouble();
                 System.out.print("Enter overdraft limit: ₹");
                 double overdraft = sc.nextDouble();
                 int accNum2 = bank.generateAccountNumber();
                 CurrentAccount ca = new CurrentAccount(accNum2, curBal, overdraft);
                 bank.addAccount(ca);
                 accountOperations(ca, sc);
                 break;

             case 3:
                 bank.showAllAccounts();
                 break;

             case 4:
                 System.out.println("Thank you! Exiting.");
                 sc.close();
                 return;

             default:
                 System.out.println("Invalid choice. Try again.");
         }
     }
 }

 // Account operation handler
 public static void accountOperations(Account account, Scanner sc) {
     while (true) {
         System.out.println("\n-- Account Operations for Acc No: " + account.getAccountNumber() + " --");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. View Balance");
         System.out.println("4. Calculate Interest");
         System.out.println("5. Back to Main Menu");
         System.out.print("Choose: ");
         int op = sc.nextInt();

         switch (op) {
             case 1:
                 System.out.print("Enter amount to deposit: ₹");
                 account.deposit(sc.nextDouble());
                 break;
             case 2:
                 System.out.print("Enter amount to withdraw: ₹");
                 account.withdraw(sc.nextDouble());
                 break;
             case 3:
                 account.viewBalance();
                 break;
             case 4:
                 account.calculateInterest();
                 break;
             case 5:
                 return;
             default:
                 System.out.println("Invalid option. Try again.");
         }
     }
 }
}
