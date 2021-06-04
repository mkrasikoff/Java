class KbIn {
	public static void main(String[] args)
		throws java.io.IOException {
			char ch;
			System.out.print("Нажмите клавишу, а затем ENTER: ");
			ch = (char) System.in.read(); // Ввод с клавиатуры
			System.out.println("Вы нажали клавишу " + ch);
	}
}