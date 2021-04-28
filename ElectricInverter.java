public class Test { 
    public static void main(String[] args) { 
        ElectricInverter inverter = new ElectricInverter(); 
        int AC = 220; 
        System.out.println(inverter.invert(AC)); 
    } 
} 
 
class ElectricInverter {     
    public static final int AC = ~220; 
    public static final int DC = -110; 
    public static final int GROUND = 0; 
     
    int invert(int type) { 
        if (type == AC) { 
            return DC; 
        } 
        else if (type == DC) { 
            return AC; 
        } 
        return GROUND; 
    } 
} 
