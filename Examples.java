public class Examples {
    
    public static void main(String[] args) {
      MyThread mt1 = new MyThread("Поток 1");
      MyThread mt2 = new MyThread("Поток 2");
      MyThread mt3 = new MyThread("Поток 3");
      MyThread mt4 = new MyThread("Поток 4");
      MyThread mt5 = new MyThread("Поток 5");
      
      Thread tmt1 = new Thread(mt1);
      Thread tmt2 = new Thread(mt2);
      Thread tmt3 = new Thread(mt3);
      Thread tmt4 = new Thread(mt4);
      Thread tmt5 = new Thread(mt5);
      
      tmt1.start();
      tmt2.start();
      tmt3.start();
      tmt4.start();
      tmt5.start();
      
      ThreadTest tt = new ThreadTest();
      new Thread(tt.MyFunctionalThread).start();
      new Thread(tt.MyThread).start();
      System.out.println("Строчка в main.");
    }   
}

class MyThread implements Runnable {
    String name;
    
    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Запущен поток с именем " + name);
    }
    
}

class ThreadTest {

	Runnable MyFunctionalThread = () -> {
		System.out.println("Запущен поток через лямбду.");
	};

	Runnable MyThread = new Runnable() {
            
            public void run() {
                System.out.println("Запущен поток через анонимный класс.");
                try {
                	Thread.sleep(100000);
                }
                catch(Exception e) {
                }
            }
	};
}
