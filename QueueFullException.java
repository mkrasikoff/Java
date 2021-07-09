class QueueFullException extends Exception { // класс для обработчки исключения полной очереди, по сути - создаем собственное исключение, наследуя Exception
	int size; // переменная для хранения размера

	QueueFullException(int s) { size = s; } // конструктор для указания размера

	public String toString() { // создаем метод toString для того чтобы написать текст ошибки (?)
		return "\nОчередь заполнена. Максимальный размер очереди: " + size;
	}
}
