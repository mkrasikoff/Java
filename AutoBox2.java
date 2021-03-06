class AutoBox2 {

	// предположу что создание методов до main() возможно из за того что они статические (т.е. сделаются еще до старта программы)
	static void m(Integer v) { // задаем метод m, принимающий значение integer и печатающий текст + значение
		System.out.println("m() получил " + v);
	}

	static int m2() { // новый метод для возврата значения int
		return 10;
	}

	static Integer m3() { // новый метод для возврата значения Integer
		return 99; // автоупакова значения 99 в объект типа Integer (КОРОЧЕ ГДЕ INTEGER - ТАМ ОБЪЕКТЫ МУТЯТСЯ)
	}

	public static void main(String[] args) {
		m(199); // передача методу m() значения int, метод m() принимает параметр типа Integer, поэтому значение int автоматически упаковывается

		Integer iOb = m2(); // автоупаковка через значение int возвращенное из метода
		System.out.println("Значение, возвращенное из m2(): " + iOb); // печатаем текст из объекта

		int i = m3(); // далее метод m3() возвращает значение типа Integer, которое автоматически распаковывается и преобразуется в тип int
		System.out.println("Значение, возвращенное из m3(): " + i);

		// далее методу Math.sqrt() в качетсве параметра передается объект iOb, который автоматически распаковывается, а
		// его значение повышается до типа double, которое нужно для метода Math.sqrt()
		iOb = 100; // новый Integer для нашего объекта?
		System.out.println("Корень квадратный из iOb: " + Math.sqrt(iOb)); // Integer >>> int >>> double
	}
}