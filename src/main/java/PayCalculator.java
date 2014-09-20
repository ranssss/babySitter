public class PayCalculator {

	private static final int AFTER_MIDNIGHT_RATE = 16;
	private static final int AFTER_BED_RATE = 8;
	private static final int STANDARD_RATE = 12;
	private int start;
	private int end;
	private int bed;

	public PayCalculator(int startTime, int endTime, int bedtime) {
		start = startTime;
		end = endTime;
		bed = bedtime;
	}

	public int calcPay() {

		int totalPay = 0;
		int hourPay = 0;

		for (int currentHour = start; currentHour < end; currentHour++) {

			if (beforeBedtime(currentHour)) {
				hourPay = STANDARD_RATE;
			} else if (betweenBedtimeAndMidnight(currentHour)) {
				hourPay = AFTER_BED_RATE;
			} else {
				hourPay = AFTER_MIDNIGHT_RATE;
			}

			totalPay += hourPay;
			hourPay = 0;
		}
		
		return totalPay;
	}

	private boolean betweenBedtimeAndMidnight(int hour) {
		return hour >= bed && hour < 12;
	}

	private boolean beforeBedtime(int hour) {
		return hour < bed;
	}

}
