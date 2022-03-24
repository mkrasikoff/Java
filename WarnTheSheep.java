public class WarnTheSheep {

  public static String warnTheSheep(String[] array) {
    
    if(array[array.length - 1].equals("wolf")) return "Pls go away and stop eating my sheep";
    
    for(int i = array.length - 1; i >= 0; i--) {
      
      if(array[i].equals("wolf")) {
        return "Oi! Sheep number " + (array.length - 1 - i) + "! You are about to be eaten by a wolf!";
      } 
    }
    
    return "";
  }
}
