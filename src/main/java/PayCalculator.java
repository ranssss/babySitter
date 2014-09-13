
public class PayCalculator {

	
	
	private PaymentHours calcPayment ;

	public PayCalculator(PaymentHours paymentHours) {
		calcPayment = paymentHours;
	}

	public int calPay(int start, int end, int bedTime) {
		return calcPayment.calculate(start, end, bedTime);
	}

}
