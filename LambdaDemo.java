interface MyValue { // создаем функциональный интерфейс
	double getValue(); // единственный абстрактный метод в интерфейсе - функция интерфейса
}

interface MyParamValue { // еще один функциональный интерфейс
	double getValue(double v); // функция этого интерфейса
}

class LambdaDemo {
	public static void main(String[] args) {
		MyValue myVal; // объявление ссылки на итерфейс

		myVal = () -> 98.6; // простое лямбда-выражение

		System.out.println("Постоянное значение: " + myVal.getValue());

		MyParamValue myPval = (n) -> 1.0 / n; // лямбда-выражение с параметром

		System.out.println("Обратная величина 4 равна " + myPval.getValue(4.0));
		System.out.println("Обратная величина 8 равна " + myPval.getValue(8.0));

		myPval = (n) -> Math.random();
	}
}