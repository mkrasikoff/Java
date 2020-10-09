class Chapter5ex3 {
	public static void main(String[] args) {
		double sum = 0;
		double x[] = {5, 4, 7, 8, 23, 12, 1, 9, 2, 6};
		for(int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		System.out.println(sum);
	}
}