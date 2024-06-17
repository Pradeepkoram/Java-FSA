package lab2;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in)) {
					String username = "pandu";
					String password = "12345";

					System.out.println("Enter your username:");
					String enteredUsername = scanner.nextLine();

					System.out.println("Enter your password:");
					String enteredPassword = scanner.nextLine();

					if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
					    System.out.println("You have successfully logged in!");
					} else {
					    System.out.println("Incorrect username or password. Please try again.");
					}
				}
		    }
		}


