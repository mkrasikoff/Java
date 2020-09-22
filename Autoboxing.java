public class Autoboxing {

    final void method(String s) {
    }

    void method(String s, final int ss) {
        ss++;
    }


    public static void main(String[] args) { 
        Integer oInt1 = null; 
        Integer oInt2 = 0; 
        final int int1 = oInt1; 
        final int int2 = oInt2; 
        System.out.println(int1 == int2); 
    } 
} 
