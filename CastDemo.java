class CastDemo {
	public static void main(String[] args) {
		double x, y;
		byte b;
		int i;
		char ch;
		x = 10.0;
		y = 3.0;
		i = (int) (x / y); // Привести тип double к типу int
		System.out.println("Целочисленный результат деления x / y: " + i);
		i = 100;
		b = (byte) i; // Информация не теряется - тип byte может содержать 100
		System.out.println("Значение b: " + b);
		i = 257;
		b = (byte) i;
		System.out.println("Значение b: " + b);
		b = 88; // Представление символа X в коде ASCII
		ch = (char) b; // Явное приведение несовместимых типов
		System.out.println("ch: " + ch);
	}
}