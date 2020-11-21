class Decomp {
	public static String decompose(String nrStr, String drStr) {
		StringBuilder finalResult = new StringBuilder("[");
		int nrInt = Integer.parseInt(nrStr);
		int drInt = Integer.parseInt(drStr);

		if(nrInt == 0) {
			finalResult.append("]");
			return finalResult.toString();
		}

		if(nrInt % drInt == 0) {
			finalResult.append(Integer.toString(nrInt / drInt) + "]");
			return finalResult.toString();
		}
		for (int i = 2; i < 1_000_000; i++) {
			if(nrInt <= i && drInt % i == 0) {
				finalResult.append("");
				nrInt -= 1;
				drInt /= i;
			}
		}
		return finalResult.toString();
	}
	public static void main(String[] args) {
		System.out.println(decompose("3", "4")); // need [1/2, 1/4]
		System.out.println(decompose("12", "4")); // need [3]
		System.out.println(decompose("0", "2")); // need []
		System.out.println(decompose("9", "10")); // need [1/2, 1/3, 1/15]
	}
}