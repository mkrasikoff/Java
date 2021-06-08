public class PangramChecker {
	public boolean check(String sentence){
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char[] alphabetArray = alphabet.toCharArray();
		char[] sentenceArray = sentence.toLowerCase().toCharArray();
		boolean mark = false;


		for(int i = 0; i < alphabetArray.length; i++) {
			int counter = 0;
			for(int j = 0; j < sentenceArray.length; j++) {
				if(alphabetArray[i] == sentenceArray[j]) {
					System.out.print(" Yeah, same symbol is " + alphabetArray[i] + " and " + sentenceArray[j] + "|");
					break;
				}
				counter++;
				if(counter == sentenceArray.length) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(new PangramChecker().check("The quick brown fox jumps over the lazy dog.")); // need true
		System.out.println(new PangramChecker().check("You shall not pass!")); // need false
	}
}