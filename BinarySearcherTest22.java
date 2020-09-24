public class BinarySearcherTest22 {
    public static void main(String[] args) {
        int[] testArray = new int[100];
        for(int i = 0; i < 100; i++) {
            testArray[i] = i;
        }
        System.out.println(new BinarySearcherTest22().binarySearch(testArray, 1));
    }

    public int binarySearch(int[] intArray, int value) {
        int minIdx = 0;
        int maxIdx = intArray.length - 1;
        int curIdx = (minIdx + maxIdx) / 2;
        int operationsCounter = 0;

        while (true) {
            operationsCounter++;
            if(value > intArray[curIdx]) {
                minIdx = curIdx;
                curIdx = (minIdx + maxIdx) / 2;
                continue;
            }
            else if(value < intArray[curIdx]) {
                maxIdx = curIdx;
                curIdx = (minIdx + maxIdx) / 2;
                continue;
            }
            else break;
        }
        return operationsCounter;
    }
}
