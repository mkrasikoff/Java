public class MyArrayList<T> {
	public static void main(String[] args) {
		MyArrayList<Integer> myArrayList = new MyArrayList<>();

		for(int i = 1; i <= 25; i++) {
			myArrayList.add(i);	
		}
		
		System.out.println("After we add numbers to array: ");
		myArrayList.showArray();

		myArrayList.delete(15);

		System.out.println("After we delete first number from array: ");
		myArrayList.showArray();

		myArrayList.delete(15);

		System.out.println("After we delete second number from array: ");
		myArrayList.showArray();

	}

	private Object[] array;
	private int capacity = 10;
	private int currentLast = 0;

	MyArrayList() {
		array = new Object[capacity];
	}

	public T get(int idx) {
		return (T) array[idx];
	}

	public void add(T item) {
		if(currentLast + 1 == capacity) {
			capacity *= 2;
			Object[] newArray = new Object[capacity];

			for(int i = 0; i < currentLast; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}
		array[currentLast] = item;
		currentLast++;
	}

	public void delete(int idx) {
		Object[] tempArray = new Object[capacity];
		tempArray = array;

		for(int i = idx; i < currentLast - 1; i++) {
			array[i] = tempArray[i + 1];
		}

		array[currentLast - 1] = null;
		currentLast--;
		tempArray = null;
	}

	public int size() {
		return currentLast;
	}

	public void showArray() {
		for(int i = 0; i < currentLast; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}