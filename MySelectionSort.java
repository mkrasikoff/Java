public class MySelectionSort {
	public static void main(String[] args) {
		int[] array = {0, 35, 19, 1, 4, 8, 6, 7, 4, 5, 2, 11, 3, 8, 14};

		System.out.println("Before sort: ");
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();

		array = new MySelectionSort().sort(array);

		System.out.println("After sort: ");
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();	
	}

	public void swap(int[] array, int firstIdx, int secondIdx) {
		int temp = array[firstIdx];
		array[firstIdx] = array[secondIdx];
		array[secondIdx] = temp;
	}

	public int[] sort(int[] array) {
		for(int i = array.length - 1; i > 0; i--) {
			int maxIdx = 0;
			for(int j = 1; j <= i; j++) {
				if(array[j] > array[maxIdx]) {
					maxIdx = j;
				}
			}
			swap(array, maxIdx, i);
		}
		return array;
	}
}