package lab4;

import java.util.Scanner;

public class BankingApplication {
    private static double balance = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next();
            
            switch(choice) {
                case "1":
                    deposit();
                    break;
                case "2":
                    withdraw();
                    break;
                case "3":
                    checkBalance();
                    break;
                case "4":
                    System.out.println("Thank you for using our banking application!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (!choice.equals("4"));
        
        scanner.close();
    }
    
    static void deposit() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter amount to deposit: ");
			double amount = scanner.nextDouble();
			balance += amount;
		}
        System.out.println("Amount deposited successfully.");
    }
    
    static void withdraw() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter amount to withdraw: ");
			double amount = scanner.nextDouble();
			if (amount > balance) {
			    System.out.println("Insufficient balance!");
			} else {
			    balance -= amount;
			    System.out.println("Amount withdrawn successfully.");
			}
		}
    }
    
    static void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}