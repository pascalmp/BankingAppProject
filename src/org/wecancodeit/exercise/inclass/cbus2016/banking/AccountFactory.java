package org.wecancodeit.exercise.inclass.cbus2016.banking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccountFactory {

	public Account read(String filePath) throws IOException{
		BufferedReader buffer = new BufferedReader(new FileReader(filePath));
		String name = buffer.readLine();
		String ID = buffer.readLine();
		String infoBalance = buffer.readLine();
		String accountType = buffer.readLine();
		Account account;
		if(accountType.equals("Checking")) {
			account = new Checking(name, ID, infoBalance );
    	} else if(accountType.equals("Savings")){
			account = new Savings(name, ID, infoBalance);
		} else {
			account = new Credit(name, ID, infoBalance);
		}
		return account;
	}
}
