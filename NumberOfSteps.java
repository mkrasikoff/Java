class NumberOfSteps {
   public int numberOfSteps(int num) {

      int steps = 0;

      if(num < 0) {
         return steps;
      }

      while(num != 0) {
         if(num % 2 == 0) {
            num = num / 2;
            steps = steps + 1;
         }
         if(num % 2 == 1) {
            num = num - 1;
            steps = steps + 1;
         }
      }

      return steps;
   }
}
