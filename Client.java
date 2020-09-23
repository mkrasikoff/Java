public class Client {
    static void doCalc(byte...a) {
        System.out.print("byte...");
    }
    static void doCalc(long a, long b) {
        System.out.print("long, long");
    }
    static void doCalc(Byte s1, Byte s2) {
        System.out.print("Byte, Byte");
    }
    public static void main(String[] args) {
        byte b = 5;
        doCalc(b, b);
        System.out.println();

        String st1 = "hello";
        String st2 = "hello";

        st2 += "HI";

        System.out.println(st1);
        System.out.println(st2);        
    }
}