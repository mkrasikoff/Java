interface NumericFunc {
	int num(int number);
}

class Chapter14ex7 {
	public static void main(String[] args) {
		NumericFunc x = (n) -> {
			int factor = 1;
			for(int i = 2 ; i < n + 1; i++) {
				factor = factor * i;
			}
			return factor;
		};
		System.out.println("Результат: " + x.num(5));
	}
}