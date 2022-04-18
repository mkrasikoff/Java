class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
      
      for(int i = 0; i < accounts.length; i++) {
         int sum = 0;
         for(int j = 0; j < accounts[i].length; j++) {
            sum = sum + accounts[i][j];
         }
         accounts[i][0] = sum;
      }

      int richestMan = 0;
      
      for(int i = 0; i < accounts.length; i++) {
         if (accounts[i][0] > accounts[richestMan][0]) {
            richestMan = i;
         }
      }

      return accounts[richestMan][0];
   }
}