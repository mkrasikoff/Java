class FizzBuzz {
    public List<String> fizzBuzz(int num) {

      List<String> result = new ArrayList<>();

      for(int i = 0; i < num; i++) {
         int currentNumber = i + 1;
         result.add(String.valueOf(currentNumber));

         if(currentNumber % 3 == 0) {
            if(currentNumber % 5 == 0) {
               result.set(i, "FizzBuzz");
            }
            else result.set(i, "Fizz");
         }
         else if(currentNumber % 5 == 0) {
            result.set(i, "Buzz");
         }
      }

      return result;
   }
}