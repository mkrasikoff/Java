class Chapter3ex1 {
	public static void main(String[] args) throws java.io.IOException {
		int probels = 0;
		char symbols;
		do {
			symbols = (char) System.in.read();
			System.out.println("Вы ввели символ: " + symbols);
		} while (symbols != '.');	

		for(int i = 1000; i > 0; i = i - 2) {
			System.out.println(i);
		}	
	}
}

