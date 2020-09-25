interface NumericFunc {
	int func(int n);
}

class BlockLambdaDemo {
	public static void main(String[] args) {
		NumericFunc smallestF;
		smallestF = (n) -> { // данное лямбда-выражение возвращает наименьший положительный делитель заданного числа
			int result = 1;
			n = n < 0 ? -n : n;

			for(int i = 2; i <= n / i; i++) {
				if((n % i) == 0) {
					result = i;
					break;
				}
			}
			return result;
		};

		System.out.println("Наименьшим делителем 12 является " + smallestF.func(12));
		System.out.println("Наименьшим делителем 11 является " + smallestF.func(11));
	}
}