public class Order {
	public static String order(String words) {
		List stringList = new ArrayList();

		for(String s: words.split()) {

		}
		StringBuilder strBuild = new StringBuilder();

	}
	public static void main(String[] args) {
		System.out.println(order("is2 Thi1s T4est 3a")); // need return "Thi1s is2 3a T4est"
	}
}

/*

"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"

*/