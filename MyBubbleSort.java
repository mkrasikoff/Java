public class MyBubbleSort {
	public static void main(String[] args) {
		int[] array = {0, 35, 19, 1, 4, 8, 6, 7, 4, 5, 2, 11, 3, 8, 14};

		System.out.println("Before sort: ");
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		long timeBeforeSort = System.currentTimeMillis();

		array = new MyBubbleSort().sort(array);

		System.out.println("After sort: ");
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Затраченное время на сортировку: " + 
			((double) System.currentTimeMillis() - timeBeforeSort) / 1000 + " с.");		
	}

	public void swap(int[] array, int firstIdx, int secondIdx) {
		int temp = array[firstIdx];
		array[firstIdx] = array[secondIdx];
		array[secondIdx] = temp;
	}

	public int[] sort(int[] array) {
		boolean needToSort = true;
		while(needToSort) {
			needToSort = false;
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					needToSort = true;
				}
			}
		}
		return array;
	}
}
