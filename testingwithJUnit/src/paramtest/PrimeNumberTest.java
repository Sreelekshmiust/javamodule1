package paramtest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
	public class PrimeNumberTest {
		
		
		private final Integer inputnumber;
		private final boolean expectedResult;
		private Primenumber primenumber;
	
	@Before
	public void initialize() {
		primenumber =new Primenumber();
	}
	
	public PrimeNumberTest(Integer inputnumber, boolean expectedResult) {
		super();
		this.inputnumber = inputnumber;
		this.expectedResult = expectedResult;
	}
@Parameterized.Parameters
public static Collection primeNumbers()
{
	return Arrays.asList(new Object[][] {
		{2,true},
		{6,false},
		{19,true},
		{22,false},
		{23,true},
		{24,false},
		{10,false}}
		);
}
	



	@Test
	public void testValidator() {
		System.out.println("Paramterized number is" +inputnumber);
		assertEquals(expectedResult,primenumber.validate(inputnumber));
	}

}
