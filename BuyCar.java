public class BuyCar {

	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
		int countPassedMonths = 0;
		int countEveryTwoMonths = 1;

		double nowPriceOldCar = startPriceOld;
		double nowPriceNewCar = startPriceNew;
		double nowIHaveMoney = startPriceOld;

		if(startPriceOld > startPriceNew) {
			int[] result = {countPassedMonths, startPriceOld - startPriceNew};
			return result;
		}
		else {
			while(nowIHaveMoney < nowPriceNewCar) {

				
				nowIHaveMoney += (savingperMonth - nowPriceOldCar * (percentLossByMonth / 100));
				nowPriceOldCar -= nowPriceOldCar * (percentLossByMonth / 100);
				nowPriceNewCar -= nowPriceNewCar * (percentLossByMonth / 100);

				countPassedMonths++;
				countEveryTwoMonths++;

				if(countEveryTwoMonths == 2) {
					percentLossByMonth += 0.5;
					countEveryTwoMonths = 0;
				}
			}
		}

		// return new StringBuilder().append("[" + countPassedMonths + ", " + (int) (nowIHaveMoney - nowPriceNewCar) + "]").toString();
		
		return new int[] {countPassedMonths, ((int) nowIHaveMoney - (int) nowPriceNewCar)};
	}

	public static void main(String[] args) {
		System.out.println(nbMonths(2000, 8000, 1000, 1.5)); // need 6, 766
	}
}