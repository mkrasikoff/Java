class Chapter3ex10 {
	public static void main(String[] args) throws java.io.IOException {
		char symbols_input, symbols_output;
		int place_input, place_output;

		System.out.println("Введите символ: ");

		symbols_input = (char) System.in.read();

		if(symbols_input >= 'a' & symbols_input <= 'z') {
			place_input =  (int) symbols_input;
			place_output = place_input - 32;
			symbols_output = (char) place_output;
			System.out.println("Ваш выведеный символ: " + symbols_output);
		}
		else {
			place_input =  (int) symbols_input;
			place_output = place_input + 32;
			symbols_output = (char) place_output;
			System.out.println("Ваш выведеный символ: " + symbols_output);
		}
	}
}