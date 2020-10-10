class Queue { // класс реилазующий доступ к стеку

	public int save_size;
	private int operation = 0;
	private int stack_massive[];
	private int i;
	private int save_pop;

	Queue(int size) { // реализуем конструктор
		int stack_massive_contructor[] = new int[size];
		stack_massive = stack_massive_contructor;
		save_size = size;
		operation = size - 1;

		for(i = 0; i < size; i++) { // создали объект класса Queue, чтобы пользоваться теми методами которые я написал
			push(3 + 2 * i - (22 - i));
		}

		System.out.println();
		System.out.println("Значения занесенные в массив: ");

		for(int x = 0; x < stack_massive.length; x++) {
			System.out.print(stack_massive[x] + " ");
		}

		System.out.println();

		System.out.println();

		for(int x = 0; x < stack_massive.length; x++) {
			pop();
		}

		System.out.println();
		System.out.println("Теперь в массиве следующие значения: ");

		for(int x = 0; x < stack_massive.length; x++) {
			System.out.print(stack_massive[x] + " ");
		}

		System.out.println();
	}

	private void push(int number) { // метод вставляющий число в очередь ; number - число которое мы хотим положить
		stack_massive[save_size - save_size + operation] = number; 
		operation--;
		if(operation < 0) operation = 0;
	}
	private void pop() { // метод достающий число из очереди
		save_pop = stack_massive[operation];
		stack_massive[operation] = 0;
		System.out.println("Вы достали число: " + save_pop + "\nТеперь на его месте 0");
		operation++;
	}
}

class Chapter6ex3 { // главный класс
	public static void main(String[] args) {

		Queue queue_object = new Queue(10);

		System.out.println();
		System.out.println("Программа работает верно :)");
	}
}