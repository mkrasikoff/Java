class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

      List<Integer> listWithNumbers = new ArrayList<>();

      for(int number: nums1) {
         listWithNumbers.add(number);
      }

      for(int number: nums2) {
         listWithNumbers.add(number);
      }
      
      Collections.sort(listWithNumbers);

      int listSize = listWithNumbers.size();

      if(listSize == 1) {
         return (double) listWithNumbers.get(0);
      }

      if(listSize % 2 == 1) {
         return (double) (listWithNumbers.get(listSize / 2));
      }
      else {
         return (((double) listWithNumbers.get(listSize / 2 - 1))
                 + ((double) listWithNumbers.get(listSize / 2))) / 2;
      }
   }
}
