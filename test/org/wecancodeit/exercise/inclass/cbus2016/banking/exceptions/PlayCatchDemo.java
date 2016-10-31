package org.wecancodeit.exercise.inclass.cbus2016.banking.exceptions;

import org.junit.Test;

public class PlayCatchDemo {
	
	@Test
	public void throwExceptionsForMe(){
		firstMethod();
	}

	private void firstMethod() {
		System.out.println("Yay! First Method");
		secondMethod();
		
	}
	
	private void secondMethod(){
		System.out.println("Yay! Second Method");
		thirdMethod();
	}

	private void thirdMethod() {
		System.out.println("Yay! third Method");
	}
	
	

}
