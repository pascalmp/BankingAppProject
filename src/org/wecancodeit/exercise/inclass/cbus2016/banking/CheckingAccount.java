package org.wecancodeit.exercise.inclass.cbus2016.banking;

public class CheckingAccount extends Account {

	public CheckingAccount(String newName, String ID, String InfoBalance) {
		super(newName, ID, InfoBalance);
		// TODO Auto-generated constructor stub
	}

	public void depositFunds(int transaction) {
		// same as balance = balance + transaction
		int balance = transaction;
	}

	public void withdrawFunds(int transaction) {
		int balance = transaction;
	}

}
