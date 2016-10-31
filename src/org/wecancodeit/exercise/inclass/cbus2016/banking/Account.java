package org.wecancodeit.exercise.inclass.cbus2016.banking;

/**
 * This is a super class. Things here are shared by super classes
 * 
 * @author WeCanCodeIT
 * 
 */

public class Account {
	
	
    private String name;
	protected String infoBalance;
	protected String ID;

	public Account(String newName, String ID, String InfoBalance) {
		this.name = newName;
		this.ID = ID;
		this.infoBalance = InfoBalance;
	}

	public String getInfoBalance() {

		return infoBalance;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return ID;
	}
	
	
	
 
}
