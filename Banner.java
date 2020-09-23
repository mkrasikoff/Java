// Упражнение 15.1.
// Простой аплет баннера
// В этом аплете создается поток, управляющий прокруткой текста сообщения,
// хранящегося в переменной msg, справа налево в окне аплета

import java.awt.*;
import java.applet.*;
/*
<applet code = "Banner" width=300 height=50>
</applet>
*/

public class Banner extends Applet implements Runnable { // это необходимо чтобы аплет создал второй поток исполнения, используемый для прокрутки текста по горизонтали
	String msg = " Java rules the Web ";
	Thread t;
	boolean stopFlag;

	public void init() { // инициализация
		t = null;
	}

	public void start() { // старт - поток теперь занимает память
		t = new Thread(this);
		stopFlag = false; // переменная, позволяющая узнать - запустили ли мы программу
		t.start(); // обычный запуск потока, вызов метода run() из него
	}

	public void run() { // точка входа в поток, выполняющий анимацию баннера
		for( ; ; ) {
			try {
				repaint(); // repaint я так понял что вызывает paint - обновляет инофрмацию на экране
				Thread.sleep(250);
				if(stopFlag) break; // постоянная проверка потока на то, работает ли он
			}
			catch(InterruptedException exc) {}
		}
	}

	public void stop() { // остановить поток или приостановить
		stopFlag = true; // ставим маячок на стоп - это приводит к завершению выполнения метода run().
		t = null; // возможно, нулл - обозначение того что переменная ничего не должна делать - делаем отвязку для автоматической очистки (?)
	}

	public void paint(Graphics g) {
		char ch;
		ch = msg.charAt(0);
		msg = msg.substring(1, msg.length());
		msg += ch;
		g.drawString(msg, 50, 30);
	}
}

