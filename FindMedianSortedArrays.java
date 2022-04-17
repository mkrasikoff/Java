class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

      /*
      Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

      The overall run time complexity should be O(log (m+n)) = 0(log (nums1.size() + nums2.size()))
       */

      List<Integer> listWithNumbers = new ArrayList<>();
      Double result;

      for(int number: nums1) {
         listWithNumbers.add(number);
      }
	  
      for(int number: nums2) {
         listWithNumbers.add(number);
      }

      Collections.sort(listWithNumbers);
      int listSize = listWithNumbers.size();

      if(listSize == 1) return (double) listWithNumbers.get(0);
      if(listSize % 2 == 1) {
         result = (double) (listWithNumbers.get(listSize / 2 + 1) - 1);
      }
      else {
         result = (((double) listWithNumbers.get(listSize / 2 - 1))
                 + ((double) listWithNumbers.get(listSize / 2))) / 2;
      }

      return result;
   }
}
