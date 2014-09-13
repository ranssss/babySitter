
public class PaymentAfterMidnight implements PaymentHours {

	@Override
	public int calculate(int startTime, int endTime, int bedTime) {
		return (endTime - startTime) * 16;
	}

}
