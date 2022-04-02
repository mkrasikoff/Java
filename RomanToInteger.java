class RomanToInteger {
    public int romanToInt(String romanNumber) {

      Map<Character,Integer> numbersMap = new HashMap<>();

      numbersMap.put('I',1);
      numbersMap.put('V',5);
      numbersMap.put('X',10);
      numbersMap.put('L',50);
      numbersMap.put('C',100);
      numbersMap.put('D',500);
      numbersMap.put('M',1000);

      int result = 0;

      for (int i = 0; i < romanNumber.length(); i++) {
         char ch = romanNumber.charAt(i);

         if (i > 0 && numbersMap.get(ch) > numbersMap.get(romanNumber.charAt(i - 1))) {
            result += numbersMap.get(ch) - 2 * numbersMap.get(romanNumber.charAt(i - 1));
         }
         else result += numbersMap.get(ch);
      }

      return result;
   }
}
