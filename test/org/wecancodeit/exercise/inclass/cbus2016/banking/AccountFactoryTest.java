package org.wecancodeit.exercise.inclass.cbus2016.banking;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.wecancodeit.exercise.inclass.cbus2016.banking.Account;

public class AccountFactoryTest {
	
	@Test
	public void shouldReadName() throws IOException{
		
		//arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-in-class-banking\\test\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\AccountCheckingInfo";
		
		//Act
		Account account = underTest.read(filePath);
		String name = account.getName();
		
		//Assert
		Assert.assertEquals("Jojo McCoy", name);
	}
	
	@Test
	public void shouldReadID() throws IOException{
		
		//Arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-in-class-banking\\test\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\AccountCheckingInfo";
		
		//Act
		Account account = underTest.read(filePath);
		String ID = account.getID();
		
		//Assert
		Assert.assertEquals("153677889909", ID);
	}
	
	@Test
	public void shouldReadBalance() throws IOException{
		
		//Arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-in-class-banking\\test\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\AccountCheckingInfo";
		
		//Act
		Account account = underTest.read(filePath);
		String infoBalance = account.getInfoBalance();
		
		//Assert
		Assert.assertEquals("456", infoBalance);
	
	}
	
	@Test
	public void shouldBeCheckingAccount() throws IOException{
		
		//arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-in-class-banking\\test\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\AccountCheckingInfo";
		
		//Act
		Account account = underTest.read(filePath);
		String className = account.getClass().getSimpleName();
		
		//Assert
		Assert.assertEquals("Checking", className);
	}
	
	@Test
	public void shouldBeSavingsAccount() throws IOException{
		
		//arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-in-class-banking\\test\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\AccountSavingsInfo";
		
		//Act
		Account account = underTest.read(filePath);
		String className = account.getClass().getSimpleName();
		
		//Assert
		Assert.assertEquals("Savings", className);
		
	}
	
	@Test
	public void shouldBeCreditAccount() throws IOException{
		
		//arrange
		AccountFactory underTest = new AccountFactory();
		String filePath = "C:\\Users\\WeCanCodeIT\\workspace\\java-cbus-in-class-banking\\test\\org\\wecancodeit\\exercise\\inclass\\cbus2016\\banking\\AccountCreditInfo";
		
		//Act
		Account account = underTest.read(filePath);
		String className = account.getClass().getSimpleName();
		
		//Assert
		Assert.assertEquals("Credit", className);
		
	}
	
}
