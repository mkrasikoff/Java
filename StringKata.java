public class StringKata {
	public static boolean solution(String str, String ending) {

		char[] strArray = str.toCharArray(); // 3
		char[] endingArray = ending.toCharArray(); // 2 // 1
		int currentEndingIndex = endingArray.length - 1;
		int difference = strArray.length - endingArray.length;

		while(currentEndingIndex >= 0) { 
			if(difference < 0) return false;
			if(strArray[currentEndingIndex + difference] != endingArray[currentEndingIndex]) {
				return false;
			}
			currentEndingIndex--;
			/*
				strArray[index]		endingArray[index] (1 case)		endingArray[index] (2 case)
					2							1							0
					1							0							-
					0							-							-
			*/
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(solution("abc", "bc")); // need true // first case
		System.out.println(solution("abc", "d")); // need false	// second case
	}
}