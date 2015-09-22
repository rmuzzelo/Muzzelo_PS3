package MainPackage;

import org.junit.Before;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;



public class AccountTest {
	//creates an instance of Account
	Account c;
	
	@Before
	public void setUp() throws Exception {
		c = new Account(1122, 20000);
	}
	
	@After
	public void tearDown() throws Exception {
		c = null;
	}
	
	
	@Test
	public void testAccount() throws InsufficientFundsException {
		double annual = 0.045;
		//Tests withdraw and deposit methods
		c.withdraw(2500);
		assertTrue("Method doesn't work",c.getbalance()==17500);
		c.deposit(3000);
		assertTrue("Method doesn't work",c.getbalance()==20500);
		//Prints monthly interest rate and date created
		System.out.print("The monthly interest rate is " + c.getMonthlyInterestRate(annual));
		System.out.print("\n");
		System.out.print("The date the account was created on " + c.getDatecreated());
		
	}

}
