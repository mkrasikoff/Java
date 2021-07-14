class Potatoes {
    public static int potatoes(int p0, int w0, int p1) {
        double massWeight = w0 - w0 * (0.01 * (double) p0);
        System.out.println(massWeight);
        double inPercent = massWeight / (100 - p1);
        System.out.println(inPercent);
        double potatoWeight = 100 * massWeight * inPercent;
        System.out.println(potatoWeight);
        return (int) potatoWeight;
    }
    public static void main(String[] args) {
    	System.out.println(potatoes(82, 127, 80)); // need 50
    }
}