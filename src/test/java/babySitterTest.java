import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class BabySitterTest {

	@Test
	public void shouldGetPaid12PerHourUntilBedtime() {
		PaymentHours paymentHours = new PaymentBeforeBedTime();
		PayCalculator calc = new PayCalculator(paymentHours);
		assertEquals(12, calc.calPay(6,7,8));
		assertEquals(24, calc.calPay(6,8,8));
	}
	
}
