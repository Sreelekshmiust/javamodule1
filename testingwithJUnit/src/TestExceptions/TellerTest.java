package TestExceptions;

import static org.junit.Assert.*; 

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TellerTest {
	
	Teller teller = new Teller();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testValidateUnAcceptedCurrency() {
		teller.validateTransaction("AUSD", 100);
	}

	@Test(expected = InvalidTransactionAmountException.class)
	public void testValidateNegativeAmount() {
		teller.validateTransaction("EUR", -100);
		
	}

}
