import java.util.*;

public class BalancedNum {

    public static String balancedNum(long number) {

    	ArrayList<String> arrayString = new ArrayList(); // list need to check array size
    	String stringNumber = String.valueOf(number); // long number to string, because we need to use a split() method
    	int size, digitsAmount;
    	int leftSum = 0;
    	int righSum = 0;

    	for(String s: stringNumber.split("")) {
    		arrayString.add(s);
    	}

    	size = arrayString.size();

    	if((size % 2) == 0) {
    		digitsAmount = (size / 2) - 1;
    	}
    	else {
    		digitsAmount = (size - 1) / 2;
    	}

    	for(int i = 0; i < digitsAmount; i++) {
    		leftSum = Integer.parseInt(arrayString.get(i)) + leftSum;
    		righSum = Integer.parseInt(arrayString.get(size - i - 1)) + righSum;
    	}

    	if(leftSum == righSum) {
    		return "Balanced";
    	}
        else return "Not Balanced";
    }

    public static void main(String[] args) {
    	System.out.println(balancedNum(780496)); // NEED "Balanced"
    	System.out.println(balancedNum(78496));	 // NEED "Balanced"
    	System.out.println(balancedNum(180496)); // NEED "Not Balanced"
    }
}