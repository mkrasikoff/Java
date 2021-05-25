class MyThread implements Runnable { // так как класс MyThread реализует интерфейс Runnable, объекты этого типа могут выполняться в отдельны потоках

	String thrdName;

	MyThread(String name) {
		thrdName = name;
	}

	public void run() { // точка входа в поток - отсюда начинают выполняться потоки
		System.out.println(thrdName + " - запуск");
		try {
			for(int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("B " + thrdName + ", счетчик: " + count);
			}
		}
		catch(InterruptedException exc) {
			System.out.println(thrdName + " - прерван");
		}
		System.out.println(thrdName + " - завершение");
	}
}

class UseThreads {
	public static void main(String[] args) {
		System.out.println("Запуск основого потока");

		MyThread mt = new MyThread("Child #1"); //  создание исполняемого объекта
		Thread newThrd = new Thread(mt); // формирование потока для этого объекта

		newThrd.start();

		for(int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException exc) {
				System.out.println("Прерывание основого потока");
			}
		}
		System.out.println("завершение основого потока");
	}
}

