class LongestSubstring {
     public int lengthOfLongestSubstring(String string) {

      if (string.isEmpty()) return 0;

      StringBuilder substring = new StringBuilder();
      int maxLength = 1;

      for(int pointer = 0; pointer < string.length(); pointer++) { // from

         for(int i = pointer; i < string.length(); i++) {

            if(!substring.toString().contains(String.valueOf(string.charAt(i)))) {
               substring.append(string.charAt(i));
            }
            else {
               if(substring.length() > maxLength) {
                  maxLength = substring.length();
               }
               substring = new StringBuilder();
               break;
            }
         }
      }

      return maxLength;
   }
}
