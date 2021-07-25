public interface ICharQ {
	void put(char ch) throws QueueFullException;
	char get() throws QueueEmptyException;
}

// добавление обработчиков исключений в класс очереди
class QueueFullException extends Exception { // исключение при попытке поместить элемент в заполненную очередь
	int size;

	QueueFullException(int s) {
		size = s;
	}

	public String toString() {
		return "\nОчередь заполнена. Максимальный размер очереди: " + size;
	}
}

class QueueEmptyException extends Exception { // исключение при попытке извлечь элемент из пустой очереди

	public String toString() {
		return "\nОчередь пуста.";
	}
}

class FixedQueue implements ICharQ {
	private  char q[]; // массив для хранения элементов очереди
	private int putloc, getloc; // вставка и извлечение элементов

	public FixedQueue(int size) { // создание пустой очереди заданного размера
		q = new char[size + 1]; // выделить память для очереди
		putloc = getloc = 0;
	}
	public void put(char ch) throws QueueFullException { // поместить символ в очередь
		if(putloc == q.length - 1) throw new QueueFullException(q.length - 1);
		putloc++;
		q[putloc] = ch;
	}
	public char get() throws QueueEmptyException { // извлечь символ из очереди
		if(getloc == putloc) throw new QueueEmptyException();
		getloc++;
		return q[getloc];
	}
}

class QExcDemo {
	public static void main(String[] args) {
		FixedQueue q = new FixedQueue(10);
		char ch;
		int i;
		try {
			for(i = 0; i < 11; i++) {
				System.out.print("Попытка сохранения: " + (char) ('A' + i));
				q.put((char) ('A' + i));
				System.out.println(" - OK");
			}
			System.out.println();
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		try {
			for(i = 0; i < 11; i++) {
				System.out.print("Получение очередного символа: ");
				ch = q.get();
				System.out.println(ch);
			}
		}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
	}
}