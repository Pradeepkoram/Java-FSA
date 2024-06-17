package bank1;

import bank.BankAccount;

//Private and protected class
public class ATM {
 private int privateVar = 30;
 protected int protectedVar = 40;

 private void privateMethod() {
     System.out.println("Private method in ATM");
 }

 protected void protectedMethod() {
     System.out.println("Protected method in ATM");
 }

 public static void main(String[] args) {
     ATM atm = new ATM();

     // Accessing private and protected members within the same class
     System.out.println("Private variable: " + atm.privateVar);
     System.out.println("Protected variable: " + atm.protectedVar);
     atm.privateMethod();
     atm.protectedMethod();

     // Accessing public and default members from BankAccount class in different package
     BankAccount bankAccount = new BankAccount();
     System.out.println("Public variable from BankAccount: " + bankAccount.publicVar);
     System.out.println("Default variable from BankAccount: " + bankAccount.defaultVar);
     bankAccount.publicMethod();
     bankAccount.defaultMethod();
 }
}

