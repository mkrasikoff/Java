import java.io.*; // импортируем все пакеты чтобы все классы были доступны

class KtoD { // обьявляем класс
	public static void main(String[] args) { // обозначем его как главный
		String str; // строковая переменная
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //  создаем специальную оболочку чтобы использовать все методы и свойства потока ISR и успешно делать вводы в консоли
		System.out.println("Признак конца ввода - строка 'stop' "); // строчка с текстом

		try (FileWriter fw = new FileWriter("test.txt")) { // оператор try с ресурсами, чтобы наш файл test.txt точно закрылся и не черпал ресурс
			do { // цикл do-while
				System.out.print(": "); // строчка с текстом без переноса
				str = br.readLine(); // используем метод ввода и заносим то что ввели в переменную str
				if(str.compareTo("stop") == 0) break; // если при сравнении содержимого str со stop возвращается ноль - разрушить цикл
				str = str + "\r\n"; // добавляем к строчке перенос
				fw.write(str); // записываем содержимое str в test.txt
			} while(str.compareTo("stop") != 0); // пока ноль не возвращается при сравнении
		} catch (IOException exc) { // пытаемся поймать исключение ввода вывода
			System.out.println("Ошибка ввода-вывода: " + exc); // что делать если поймали
		}
	}
}