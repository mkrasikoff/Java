class Tack { 
    static short s = 17; 
    public Tack(short ss) { 
        new Tack(); 
        s *= ss; 
    } 
    public Tack() { ; } 
} 
public class Briddle extends Tack { 
    public Briddle(int s) { System.out.println(s + 1); } 
    public static void main(String[] args) { 
        Briddle b = new Briddle(3); 
    } 
} 
