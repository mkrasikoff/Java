import java.util.*;

public class ConsonantValue {
    public static int solve(final String s) {
    	char[] charArray = s.toCharArray();
    	ArrayList<Integer> intList = new ArrayList();
    	int result = 0;
    	for(char ch: charArray) {
    		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    			intList.add(result);
    			result = 0;
    			continue;
    		}
    		else {
    			result += (int) (ch - 96);
    		}
    	}
    	for(int i = 0; i < intList.size(); i++) {
    		if(intList.get(i) > result) {
    			result = intList.get(i);
    		}
    	}
        return result;
    }
    public static void main(String[] args) {
    	System.out.println((int) 'c'); // -96
    	System.out.println(solve("zodiac"));
    	System.out.println(solve("chruschtschov"));
    	System.out.println(solve("khrushchev"));
    	System.out.println(solve("strength"));
    	System.out.println(solve("catchphrase"));
    	System.out.println(solve("twelfthstreet"));
    	System.out.println(solve("mischtschenkoana"));
    }
}

/*
 		Tester.doTest("zodiac", 26);
        Tester.doTest("chruschtschov", 80);
        Tester.doTest("khrushchev", 38);
        Tester.doTest("strength", 57);
        Tester.doTest("catchphrase", 73);
        Tester.doTest("twelfthstreet", 103);
        Tester.doTest("mischtschenkoana", 80);
*/