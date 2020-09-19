import java.util.*;

public class Alphabetical {

    public static String addLetters(String... letters) {
        StringBuilder stringFromLetters = new StringBuilder(); // stringbuild need to make a char array
        ArrayList<Integer> arrayListInteger = new ArrayList(); // arraylist to integers from chararray
        int result = 0;

        for(String s: letters) {
        	stringFromLetters.append(s);
        }

        char[] charArray = String.valueOf(stringFromLetters).toCharArray(); // from String build to char array

        for(char ch: charArray) {
        	arrayListInteger.add(Integer.valueOf(ch));
        }

        if(arrayListInteger.size() == 0) {
        	return "z";
        }

        for(int i = 0; i < arrayListInteger.size(); i++) {
        	result = result + (arrayListInteger.get(i) - 96);
        	while(result > 26) {
        		result = result - 26;
        	}
        }

        return String.valueOf((char) (result + 96));
    }

    public static void main(String[] args) {
    	System.out.println(addLetters("a", "b", "c")); // need 6 result
    	System.out.println(addLetters("d", "a", "e")); // need 10 result
    	System.out.println(addLetters("z", "b", "a")); // need 3 result
    	System.out.println(addLetters("z")); // need z result
    	System.out.println(addLetters()); // need z result
    }

}