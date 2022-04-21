class IntegerToRoman {
    public String intToRoman(int num) {

      StringBuilder stringBuilder = new StringBuilder();
      String[] romans = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
      int[] ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
      int times = 0;

      if(num == 0) {
         stringBuilder.append(0);
         return stringBuilder.toString();
      }

      if(num < 0) {
         stringBuilder.append("-");
         num = -num;
      }

      for (int i = ints.length - 1; i >= 0; i--) {
         times = num / ints[i];
         num %= ints[i];

         while (times > 0) {
            stringBuilder.append(romans[i]);
            times--;
         }
      }
        
      return stringBuilder.toString();
   }
}
