public class Arithmophobia {
    static public boolean AmIAfraid(final String day, final int num) {
        switch(day) {
        	case "Monday":
        		if(num == 12) return true;
        		break;
        	case "Tuesday":
        		if(num > 95) return true;
        		break;
        	case "Wednesday":
        		if(num == 34) return true;
        		break;
        	case "Thursday":
        		if(num == 0) return true;
        		break;
        	case "Friday":
        		if((num % 2) == 0) return true;
        		break;
        	case "Saturday":
        		if(num == 56) return true;
        		break;
        	case "Sunday":
        		if(num == 666 || num == -666) return true;
        		break;
        }
        return false;
    }

    public static void main(String[] args) {
    	System.out.println(AmIAfraid("Monday", 13)); // need false
    	System.out.println(AmIAfraid("Sunday", 2)); // need false
    	System.out.println(AmIAfraid("Tuesday", 2)); // need false
    }

    /*

    doTest("Monday", 13, false);
        doTest("Sunday", -666, true);
        doTest("Tuesday", 2, false);
        doTest("Tuesday", 965, true);
        doTest("Friday", 2, true);

    Monday --> 12

	Tuesday --> numbers greater than 95

	Wednesday --> 34

	Thursday --> 0

	Friday --> numbers divisible by 2

	Saturday --> 56

	Sunday --> 666 or -666 

    */
}