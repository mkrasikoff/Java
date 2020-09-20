class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        int result = p0;
        int yearsCount = 0;
        while(result < p) {
        	int growth = (int) ((double) result * (percent / 100)) + aug;
        	result += growth;
        	yearsCount++;
        }
        return yearsCount;
    }

    public static void main(String[] args) {
    	System.out.println(nbYear(1500, 5, 100, 5000)); // need 15
    	System.out.println(nbYear(1_500_000, 2.5, 10_000, 2_000_000)); // need 10
    	System.out.println(nbYear(1_500_000, 0.25, 1000, 2_000_000)); // need 94
    }

    /*
		public void test1() {
		        System.out.println("Fixed Tests: nbYear");    
		        testing(Arge.nbYear(1500, 5, 100, 5000),15);
		        testing(Arge.nbYear(1_500_000, 2.5, 10000, 2_000_000), 10);
		        testing(Arge.nbYear(1_500_000, 0.25, 1000, 2_000_000), 94);
    }
    */
}