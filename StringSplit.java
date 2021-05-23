import java.util.*;

public class StringSplit {
    public static String[] solution(String s) {
    	List<String> substringList = new ArrayList();

    	if(s.length() % 2 == 0) {
    		for(int i = 0; i < s.length() - 1; i = i + 2) {
    			substringList.add(s.substring(i, i + 2));
    		}
    	}
    	else {
    		for(int i = 0; i < s.length() - 1; i = i + 2) {
    			substringList.add(s.substring(i, i + 2));
    		}
    		substringList.add(s.substring(s.length() - 1) + "_");
    	}

    	String[] result = new String[substringList.size()];

    	for(int i = 0; i < substringList.size(); i++) {
    		result[i] = substringList.get(i);
    	}
        
        return result;
    }
    public static void main(String[] args) {
    	System.out.println(solution("abc")); // need "ab", "c_"
    	System.out.println(solution("abcdef")); // need "ab", "cd", "ef"
    }
}

/*

StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}

*/