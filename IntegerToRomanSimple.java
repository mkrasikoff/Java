class IntegerToRomanSimple {
	
    public String intToRoman(int num) {
		
      String[] M = new String[] {"", "M", "MM", "MMM"};
      String[] C = new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      String[] X = new String[] {"", "X", "XX", "XXX", "LX", "L", "LX", "LXX", "LXXX", "LC"};
      String[] I = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

      return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[(num % 10)];
   }
}
