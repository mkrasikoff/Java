import java.util.*;

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		List<Integer> elementsList = new ArrayList();

		for(int i: elements) {
			elementsList.add(i);
		}

		for(int i = 0; i < elementsList.size(); i++) {
			int numberCount = 0;
			System.out.println("Текущий elementsList.size(): " + elementsList.size());
			System.out.println("Текущий элемент по i: " + elementsList.get(i));
			for(int j = 0; j < elementsList.size(); j++) {
				System.out.print(" Текущий элемент по j: " + elementsList.get(j));
																										for(int k = 0; k < elementsList.size(); k++) {
																											System.out.println(" ПЕЧАТАЕМ ВНУТРИ: " + elementsList.get(k));
																										}
				if(elementsList.get(i) == elementsList.get(j)) {
					numberCount++;
				}
				if(numberCount > maxOccurrences) {
					System.out.println("Я зашел в блок для удаления.");
					elementsList.remove(j);
					j--;
					numberCount--;
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < elementsList.size(); i++) {
			System.out.println(elementsList.get(i));
		}

		return null;
	}
	public static void main(String[] args) {
		System.out.println(deleteNth(new int[] { 20, 37, 20, 21 }, 1)); // need 20, 37, 21
		System.out.println(deleteNth(new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3)); // need 1, 1, 3, 3, 7, 2, 2, 2
		System.out.println(deleteNth(new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3)); // need 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5
	}
}

/* 	
		assertArrayEquals(
				new int[] { 20, 37, 21 },
				EnoughIsEnough.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
		);
		assertArrayEquals(
				new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
				EnoughIsEnough.deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )
		assertArrayEquals(
				new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
				EnoughIsEnough.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
		);	
		);
*/