public class PayCalculator {

	private int start;
	private int end;
	private int bed;

	public PayCalculator(int startTime, int endTime, int bedtime) {
		start = startTime;
		end = endTime;
		bed = bedtime;
	}

	public int calPay() {

		int totalPay = 0;
		int hourPay = 0;

		for (int time = start; time < end; time++) {

			if (time < bed) {
				hourPay = 12;
			} else if (time >= bed && time < 12) {
				hourPay = 8;
			} else {
				hourPay = 16;
			}

			totalPay += hourPay;

			hourPay = 0;
		}
		
		return totalPay;
	}

}
