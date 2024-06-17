package lab9;

import java.util.UUID;

class BankAccount {
 private UUID accountId;
 private String accountType;
 private double balance;

 // Constructors
 public BankAccount(String accountType) {
     this.setAccountId(UUID.randomUUID());
     this.setAccountType(accountType);
     this.balance = 0.0;
 }
 public void deposit(double amount) {
     balance += amount;
 }

 public void deposit(double amount, String depositType) {
     if (depositType.equalsIgnoreCase("cash")) {
         balance += amount;
     } else {
         System.out.println("Invalid deposit type.");
     }
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
     } else {
         System.out.println("Insufficient balance.");
     }
 }

 public double checkBalance() {
     return balance;
 }

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public UUID getAccountId() {
	return accountId;
}

public void setAccountId(UUID accountId) {
	this.accountId = accountId;
}
}
public class BankAccountManagement {
 public static void main(String[] args) {
     BankAccount savingsAccount = new BankAccount("Savings");
     BankAccount checkingAccount = new BankAccount("Checking");
     savingsAccount.deposit(1000.0);
     savingsAccount.withdraw(200.0);
     System.out.println("Savings Account Balance: " + savingsAccount.checkBalance());

     checkingAccount.deposit(500.0, "cash");
     System.out.println("Checking Account Balance: " + checkingAccount.checkBalance());
 }
}

