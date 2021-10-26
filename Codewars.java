public class Codewars {
	
	public static String oddOrEven (int[] array) {
		
		int sum = 0;
		
		for(int x: array) {
			sum += x;
		}

		if((sum % 2) == 0) {
			return "even";
		}
		else if (sum == 0) {
			return "even";
		}
		else return "odd";
	}

	public static void main(String[] args) {

		int[] testArray = { 2, 2, 5, 4 };
		System.out.println(new Codewars().oddOrEven(testArray));
	}
}
