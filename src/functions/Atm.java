package functions;

import java.util.Scanner;

public class Atm {
	static int pin = 2510;
	static int balance = 1500;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the pin");

		int number = scanner.nextInt();
		if (pin == number) {
			menu();
		} else {
			System.out.println("Sorry! you have entered Wrong Pin");
		}
	}

	private static void menu() {
		System.out.println("Press 1 for check the account balance");
		System.out.println("Press 2 for Withdraw the Money");
		System.out.println("Press 3 for Deposit Money");
		System.out.println("Press 4 for Exit");

		int press = scanner.nextInt();

		if (press == 1)
			current_balance();
		else if (press == 2)
			Withdraw_Money();
		else if (press == 3)
			Diposit_Money();
		else if (press == 4) {
//			System.out.println("Have a nice Day!");
			return;
		} else
			System.out.println("Invalid Operation");
	}

	private static void current_balance() {
		System.out.println("Your current balance is " + balance);
		menu();

	}

	private static void Diposit_Money() {
		System.out.println("Enter amount to deposit");
		int DA = scanner.nextInt();
		System.out.println("Deposit successfully");
		balance = balance + DA;
		menu();

	}

	private static void Withdraw_Money() {
		System.out.println("Enter Amount to Withdraw");
		int amount = scanner.nextInt();
		if (amount < balance) {
			System.out.println("Withdrawl successfull");
			balance = balance - amount;
			menu();
		} else
			System.out.println("Insufficient balance/n");
		menu();

	}
}
