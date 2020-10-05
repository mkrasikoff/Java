import java.awt.*; // содержит менеджер компоновки - то как будут располагаться элементы
import java.awt.event.*; // содержит интерфейсы для получения событий (и обработки)
import javax.swing.*; // импортируем все компоненты swing

class CBDemo implements ItemListener {
	JLabel jlabSelected;
	JLabel jlabChanged;
	JCheckBox jcbAlpha;
	JCheckBox jcbBeta;
	JCheckBox jcbGamma; // сделали ссылочные переменные для того чтобы иметь к ним доступ за пределами конструктора

	CBDemo() {
		JFrame jfrm = new JFrame("Demonstrate Check Boxes"); // создаем исходный контейнер высшего уровня
		jfrm.setLayout(new BorderLayout()); // задать объект FlowLayout для (как?) менеджера компоновки
		jfrm.setSize(280, 120); // размеры окна
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // что делать при закрытии

		jlabSelected = new JLabel(""); // создать пустые метки (надписи)
		jlabChanged = new JLabel("");

		jcbAlpha = new JCheckBox("Alpha"); // делаем флажки с подписями
		jcbBeta = new JCheckBox("Beta");
		jcbGamma = new JCheckBox("Gamma");

		jcbAlpha.addItemListener(this); // события генерируемые флажками обрабатываются одним методом itemStateChanged(), реализованным в классе CBDemo
		jcbBeta.addItemListener(this);  // this - объект этого класса
		jcbGamma.addItemListener(this);

		jfrm.add(jcbAlpha); // добавляем все компоненты в панель содержимого контейнера
		jfrm.add(jcbBeta);
		jfrm.add(jcbGamma);
		jfrm.add(jlabChanged);
		jfrm.add(jlabSelected);

		jfrm.setVisible(true);
	}

	public void itemStateChanged(ItemEvent ie) { // обработчик событий для флажков
		String str = "";
		JCheckBox cb = (JCheckBox) ie.getItem();
		if(cb.isSelected()) jlabChanged.setText(cb.getText() + " was just selected.");
		else jlabChanged.setText(cb.getText() + " was just cleared.");
		if(jcbAlpha.isSelected()) {
			str += "Alpha ";
		}
		if(jcbBeta.isSelected()) {
			str += "Beta ";
		}
		if(jcbGamma.isSelected()) {
			str += "Gamma";
		}

		jlabSelected.setText("Selected check boxes: " + str);
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() { public void run() { new CBDemo(); } } );
	}
}


