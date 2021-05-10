import java.util.Arrays;

public class MyMergeSort {
    public static void main(String[] args) {
        int[] array = {0, 35, 19, 1, 4, 8, 6, 7, 4, 5, 2, 11, 3, 8, 14};

		System.out.println("Before sort: ");
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		long timeBeforeSort = System.currentTimeMillis();

		array = new MyMergeSort().sort(array);

		System.out.println("After sort: ");
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();	
		System.out.println("Затраченное время на сортировку: " + 
			((double) System.currentTimeMillis() - timeBeforeSort) / 1000 + " с.");
    }
 
    public static int[] sort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];

        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }
 
    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);
        
        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}