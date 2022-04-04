class WeakestRows {
    public int[] kWeakestRows(int[][] matrix, int k) {
      
      Map<Integer, Integer> soldiers = new TreeMap<>();
      
      int rowNumber = 0;
      
      for(int[] row: matrix) {
         
         int count = 0;
         
         for(int soldier: row) {
            
            if (soldier == 1) count++;
         }
         
         soldiers.put(rowNumber++, count);
      }

      SortedSet<Map.Entry<Integer, Integer>> sortedSoldiers = entriesSortedByValues(soldiers);

      return sortedSoldiers.stream().limit(k).mapToInt(Map.Entry::getKey).toArray();
   }

   private static <K,V extends Comparable<? super V>> SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
      SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<>((e1, e2) -> {
         int res = e1.getValue().compareTo(e2.getValue());
         return res != 0 ? res : 1;
      });
      sortedEntries.addAll(map.entrySet());
      return sortedEntries;
   }
}
