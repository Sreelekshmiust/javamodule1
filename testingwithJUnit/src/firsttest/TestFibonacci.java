package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFibonacci {
	
	static Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
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
	public void testFibonacci() {
		
		int inputBase=5; 
		int expectedValue = 3;
		 int actualValue = calc.fibonacci(inputBase);
		 assertEquals(expectedValue,actualValue);
		
		//fail("Not yet implemented");
	}

}
