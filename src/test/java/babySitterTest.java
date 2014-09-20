import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class BabySitterTest {

	private static final int BEDTIME = 8;

	@Test
	public void shouldGetPaid12PerHourUntilBedtime() {
		PayCalculator calc = new PayCalculator(6,7,BEDTIME);
		assertEquals(12, calc.calcPay());
	}

	@Test
	public void shouldGetPaid8PerHourBetweenBedAndMidnight() {
		PayCalculator calc = new PayCalculator(8,10,BEDTIME);
		assertEquals(16, calc.calcPay());
	}

	@Test
	public void shouldGetPaid16PerHourAfterMidnight() {
		PayCalculator calc = new PayCalculator(12,14,BEDTIME);
		
		assertEquals(32, calc.calcPay());
	}
	
	@Test
	public void shouldGetPaidCorrectlyWhenTheyStayAllNight() {
		PayCalculator calc = new PayCalculator(7,17,BEDTIME);
		
		assertEquals(124, calc.calcPay());
	}
	
}
