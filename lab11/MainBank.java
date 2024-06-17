package lab11;

//Interface BankingInterface
interface BankingInterface {
 void deposit(double amount);
 void withdraw(double amount);
 double getBalance();
}
class SavingsAccount implements BankingInterface {
 private double balance;
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: $" + amount);
 }
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: $" + amount);
     } else {
         System.out.println("Insufficient funds.");
     }
 }
 public double getBalance() {
     return balance;
 }
}
class CurrentAccount implements BankingInterface {
 private double balance;
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: $" + amount);
 }
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: $" + amount);
     } else {
         System.out.println("Insufficient funds.");
     }
 }
 public double getBalance() {
     return balance;
 }
}

class MainBank {
 public static void main(String[] args) {
     SavingsAccount savingsAccount = new SavingsAccount();
     CurrentAccount currentAccount = new CurrentAccount();
     savingsAccount.deposit(1000);
     System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
     savingsAccount.withdraw(500);
     System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
     currentAccount.deposit(2000);
     System.out.println("Current Account Balance: $" + currentAccount.getBalance());
     currentAccount.withdraw(1000);
     System.out.println("Current Account Balance: $" + currentAccount.getBalance());
 }
}