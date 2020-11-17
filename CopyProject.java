import java.io.*;
import java.util.*; // для использования Scanner

class CopyClass {

	String save_name_in; // для сохранения имени входного файла (копирумого)
	String save_name_out; // для сохранения имени выходного файла (скопированного)

	CopyClass(String file_name) { // конструктор - при создании объекта класса - мы передадим ему имя файла
		save_name_in = file_name;
	}

	void method() { // основной рабочий метод
		try {
			FileInputReader text_file = new FileInputReader(save_name_in);
			text_file.close();
		}
		catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода.")
		}
}

class CopyProject {
	public static void main(String[] args) {

		String name_in; // переменная для ввода имени пользователем

		Scanner object1 = new Scanner(System.in); // создаем объект Scanner для поддержки ввода

		System.out.println("Введите имя текстового файла, который вы хотите скопировать."); // текстовая строчка
		name_in = object1.nextLine(); // предложить ввод для пользователя, сохранить введенное в name_in

		CopyClass object2 = new CopyClass(name_in); // создать объект класса CopyClass, в который параметром вводим name_in
		
	}
}