public class KeepHydrated  {

  public int Liters(double time)  {
    
    int litres = ((int) time / 2);
  	return litres;
  }

  public static void main(String[] args) {

  	KeepHydrated kh = new KeepHydrated();
  	System.out.println(kh.Liters(6.7));

  }
}