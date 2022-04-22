class ContainerWithTheMostWater {
    public int maxArea(int[] height) {

      int currentMaxSquare = 0;
      for(int i = 0; i < height.length - 1; i++) {

         for(int j = height.length - 1; j > i; j--) {

            int current;
            if (height[i] >= height[j]) {

               current = height[j] * (j - i);
            }
            else current = height[i] * (j - i);

            if (current > currentMaxSquare) currentMaxSquare = current;
         }
      }

      return currentMaxSquare;
   }
}
