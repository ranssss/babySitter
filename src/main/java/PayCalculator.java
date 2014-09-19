public class PayCalculator {

	public int calPay(int startTime, int endTime, int bedTime) {

		int totalPay = 0;
		int hourPay = 0;

		for (int time = startTime; time < endTime; time++) {

			if (time < bedTime) {
				hourPay = 12;
			} else if (time >= bedTime && time < 12) {
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
