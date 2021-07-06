import java.util.Arrays;

public class QuickSortTest22 {
    public static void main(String[] args) {
        int[] array = {3,7,5,4,1,3,6};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array, int left, int right) {
        int index = 0;
        if(array.length > 1) {
            index = partition(array, left, right);
            if(left < index - 1) {
                quickSort(array, left, index - 1);
            }
            if(index < right) {
                quickSort(array, index, right);
            }
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2];
        while (left <= right) {
            while (array[left] < pivot){
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}