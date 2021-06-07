public class MyThread extends Thread { 
    public void run() { 
        System.out.println("I'm Running!"); 
    } 
 
    public static void main(String[] args) { 
        System.out.println("About to run thread"); 
        new MyThread().start(); 
    } 
}