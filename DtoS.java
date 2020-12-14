import java.io.*; // импорт пакетов

class DtoS { // новый класс
	public static void main(String[] args) { // гланый метод
		String s; // строковая переменная
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) { // оболочка для успешного ввода строк из консоли (преобразований байтовых/строковых)
			while((s = br.readLine()) != null) { // присвоить переменной s то что есть в файловой строчке и пока оно не равно пустому месту
				System.out.println(s); // написать значение s
			}
		}
		catch (IOException exc) { // перехватываем ошибку ввода-вывода тк она генерируется в классе FileReader и др
			System.out.println("Ошибка ввода-вывода: " + exc); // что сделать если ошибка
		}
	}
}