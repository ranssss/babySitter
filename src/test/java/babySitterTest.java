import static org.junit.Assert.*;

import org.junit.Test;


public class babySitterTest {

	@Test
	public void shouldGetPaid12PerHourUntilBedtime() {
		PayCalculator calc = new PayCalculator();
		assertEquals(12, calc.calPay(6,7,8));
	}
	
}
