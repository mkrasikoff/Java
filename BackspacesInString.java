public class BackspacesInString {
	public String cleanString(String s) {
		
    	return s.replaceAll("#","");
	}
	public static void main(String[] args) {
		System.out.println(new BackspacesInString().cleanString("abc#d##c")); // need ac
	}
}

