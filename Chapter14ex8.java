interface MyFunc<T> {
	T func(T n);
}

class Chapter14ex8 {
	public static void main(String[] args) {

		MyFunc<Integer> Ifactorial = (n) -> {
			int factor = 1;
			for(int i = 2 ; i < n + 1; i++) {
				factor = factor * i;
			}
			return factor;
		};

		MyFunc<Double> Dfactorial = (n) -> {
			double factor = 1.0;
			for(double i = 2.0 ; i < n + 1.0; i++) {
				factor = factor * i;
			}
			return factor;
		};
		System.out.println("Результат: " + Ifactorial.func(6));
		System.out.println("Результат: " + Dfactorial.func(6.0));
	}
}
