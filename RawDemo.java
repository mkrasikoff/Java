class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	T getob() {
		return ob;
	}
}

class RawDemo {
	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		Gen<String> strOb = new Gen<String>("Тестирование сообщений");
		Gen raw = new Gen(new Double(98.6)); // создание базоваго типа обобщения

		double d = (Double) raw.getob(); // требуется приведение так как тип неизвестен (я так понял так как мы не указали тип - он НЕИЗВЕСТЕН но ЯВЛЯЕТСЯ DOUBLE (!!!))
		System.out.println("значение: " + d);

		int i = (Integer) raw.getob(); // наш тип по прежнему неизвестен но мы то знаем что он Double - поэтому в этой строчке ошибка

		raw = iOb;
		d = (Double) raw.getob();

		strOb = raw; // мы можем присваивать ссылки так как формально тип указан один и тот же, но на самом деле они разные
		String str = strOb.getob(); // поэтому при вызове 

		
	}
}

