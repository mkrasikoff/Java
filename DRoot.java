public class DRoot {
	public static int digital_root(int n) {
		
		String[] intString = Integer.toString(n).split("");
		int result = 0;
		for(String str: intString) {
			result += Integer.parseInt(str);
		}
		if(result >= 0 && result < 10) {
			return result;
		}
		else return digital_root(result);
	}

	public static void main(String[] args) {
		System.out.println(digital_root(16)); // need 7
		System.out.println(digital_root(456)); // need 6
		System.out.println(digital_root(99958)); // need 40 then 4
		System.out.println(digital_root(0)); // need 0
	}
}
/*

assertEquals( "Nope!" , 7, DRoot.digital_root(16));
assertEquals( "Nope!" , 6, DRoot.digital_root(456));

*/