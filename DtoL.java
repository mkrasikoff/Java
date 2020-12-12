class DtoL {
	public static void main(String[] args) {
		long L;
		double D;
		D = 100123285.0;
		L = D; // Ошибка, так как double не преобразуется автоматически в тип long
		System.out.println("L и D: " + L + " " + D);
	}
}