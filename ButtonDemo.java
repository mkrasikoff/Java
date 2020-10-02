import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo implements ActionListener {
	JLabel jlab;
	ButtonDemo() {
		JFrame jfrm = new JFrame("A Button Example");
		jfrm.setLayout(new FlowLayout()); // благодаря установке менеджера мы размещаем компоненты в необходимом порядке - тут слева направо и сверху вниз
		jfrm.setSize(220, 90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");

		jbtnUp.setActionCommand("Middle");

		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);

		jfrm.add(jbtnUp);
		jfrm.add(jbtnDown);

		jlab = new JLabel("Press a button.");

		jfrm.add(jlab);

		jfrm.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) { // метод обработки событий кнопки
		if(ae.getActionCommand().equals("Middle")) {
			jlab.setText("You set Middle");
		}
		else jlab.setText("You pressed down. ");
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() { public void run() { new ButtonDemo(); } } );
	}
}