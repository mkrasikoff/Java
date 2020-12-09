public class Derived 
{    void f(int a) 
     { 
        System.out.println("int"); 
     } 
    void f(Integer a) 
   { 
       System.out.println("Integer"); 
   } 
    void f(Object a) 
    { 
       System.out.println("Object"); 
    } 
    static public void main(String[] args) 
   {     
       Object i = new Integer(10); 
       new Derived().f(i); 
   } 
     
} 