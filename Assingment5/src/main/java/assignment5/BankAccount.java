package assignment5;

import java.util.Scanner;

public class BankAccount {
	String accountname;
	float amount;
	boolean bool;
	Scanner s = new Scanner(System.in);

	BankAccount(String actname) {
		this.accountname = actname;
		System.out.println("Account name: " + this.accountname);
		System.out.print("Please Enter the initial ammount for this " + actname + " account: ");
		this.amount = s.nextFloat();
		if (this.amount <= 0) {
			bool = false;
		} else {
			System.out.println("Initial ammount: " + this.amount);
			bool = true;
		}
		while (bool==false) {
			System.out.println("Invalid amount");
			System.out.print("Enter the initial ammount for this " + actname + " account: ");
			this.amount = s.nextFloat();
			if (this.amount > 0) {
				System.out.println("Initial ammount: " + this.amount);
				bool=true;
			}
		}
	}

	void deposit(float amount) {
		this.amount = this.amount + amount;
		System.out.println("new ammount after deposit: " + this.amount);
	}

	void withdraw(float amount) {
		if (this.amount < amount) {
			System.out.println("Insufficient Balance");
		} else {
			this.amount = this.amount - amount;
			System.out.println("new amount after withdrawal: " + this.amount);
		}
	}

	public static void main(String[] args) {
		Savings s = new Savings();
		s.deposit(5000);
		Checking c = new Checking();
		c.deposit(6000);
		c.withdraw(3000);
	}
}

class Savings extends BankAccount {

	Savings() {
		super("Savings");
	}
}

class Checking extends BankAccount {

	Checking() {
		super("Checking");
	}
}



