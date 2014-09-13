import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class BabySitterTest {

	private static final int BEDTIME = 8;
	private PaymentHours paymentHours;

	@Test
	public void shouldGetPaid12PerHourUntilBedtime() {
		paymentHours = new PaymentBeforeBedTime();
		PayCalculator calc = createPaymentCalculator();
		assertEquals(12, calc.calPay(6,7,BEDTIME));
		assertEquals(24, calc.calPay(6,8,BEDTIME));
	}

	@Test
	public void shouldGetPaid8PerHourBetweenBedAndMidnight() {
		paymentHours = new PaymentAfterBedTimeBeforeMidnight();
		PayCalculator calc = createPaymentCalculator();
		assertEquals(8, calc.calPay(8,9,BEDTIME));
		assertEquals(16, calc.calPay(8,10,BEDTIME));
	}

	private PayCalculator createPaymentCalculator() {
		PayCalculator calc = new PayCalculator(paymentHours);
		return calc;
	}
	
	
}
