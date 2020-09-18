class Aaaa { 
    private Double x = 2.0; 
    public static void multX(Aaaa a, Double n) { 
        a.setX(a.getX()*n); 
    } 
    public Double getX() { return x; } 
    public void setX(Double xn) { x = xn; } 
    public static void trippleValue(Double x) { 
        x*=3; 
    } 
    public static Aaaa resetX(Aaaa a) { 
        a = new Aaaa(); 
        return a; 
    } 
    public static void main(String[] args) { 
        Double x = 4.0; 
        trippleValue(x); 
        Aaaa anA = new Aaaa(); 
        multX(anA,x); 
        resetX(anA); 
        System.out.println(anA.getX()); 
        try {
        System.out.println(28.0/0.0);
        System.out.println(28.0/0.0 - 28.0/0.0);
        System.out.println(Integer.parseInt("42"));
        System.out.println(Integer.valueOf("42x"));
        }
        catch(Exception e) {System.out.println("Ошибка");}

        switch(10) { 
   case 1: 
       System.out.println("1"); 
       break; 
   case 2: 
   break;
       System.out.println("2"); 
       
   default: 
    
       System.out.println("default"); 
} 

    }  
} 