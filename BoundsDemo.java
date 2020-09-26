class NumericFns<T extends Number> {
	T num;

	NumericFns(T n) {
		num = n;
	}

	double reciprocal() {
		return 1 / num.doubleValue();
	}

	double fraction() {
		return num.doubleValue() - num.intValue();
	}
}

class BoundsDemo {
	public static void main(String[] args) {

		NumericFns<Integer> iOb = new NumericFns<Integer>(5);

		System.out.println("Обратная величина iob - " + iOb.reciprocal());
		System.out.println("Дробная часть iOb - " + iOb.fraction());
		System.out.println();

		NumericFns<Double> dOb = new NumericFns<Double>(5.25);

		System.out.println("Обратная величина dob - " + dOb.reciprocal());
		System.out.println("Дробная часть dOb - " + dOb.fraction());
		System.out.println();
	}
}