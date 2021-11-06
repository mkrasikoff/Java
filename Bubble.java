class Bubble {
	
	public static void main(String[] args) {
		
		int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		String nums_string[] = { "ab", "ac", "dc", "da", "mk", "km", "aa", "ba", "lk", "eo"};
		
		int a, b;
		String t;
		int size;
		
		size = nums_string.length; // количество сортируемых элементов

		// отобразить исходный массив
		System.out.print("Исходный массив:");
		for(int i = 0; i < size; i++)
			System.out.print(" " + nums_string[i]);
		System.out.println();

		// реализовать алгоритм пузырьковой сортировки
		for (a = 1; a < size; a++) {
			for (b = size - 1; b >= a; b--) {
				if(nums_string[b - 1].compareTo(nums_string[b]) > 0) { // если требуемый порядок следования не соблюдается, поменять элементы местами
					t = nums_string[b - 1];
					nums_string[b - 1] = nums_string[b];
					nums_string[b] = t;
				}
			}
		}
		
		// отобразить отсортированный массив
		
		System.out.print("Отсортированный массив:");
		
		for(int i = 0; i < size; i++) {
			
			System.out.print(" " + nums_string[i]);
		}
		
		System.out.println();
	}
}	
