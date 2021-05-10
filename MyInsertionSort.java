public class MyInsertionSort {
	public static void main(String[] args) {
		int[] array = {0, 35, 19, 1, 4, 8, 6, 7, 4, 5, 2, 11, 3, 8, 14};

		System.out.println("Before sort: ");
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		long timeBeforeSort = System.currentTimeMillis();

		array = new MyInsertionSort().sort(array);

		System.out.println("After sort: ");
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Затраченное время на сортировку: " + 
			((double) System.currentTimeMillis() - timeBeforeSort) / 1000 + " с.");
	}

	public int[] sort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			int currentNumber = array[i];
			for(int j = i - 1; j >= 0; j--) {
				if(currentNumber < array[j]) {
					array[j + 1] = array[j];
					array[j] = currentNumber;
				}
				else break;
			}
		}
		return array;
	}
}