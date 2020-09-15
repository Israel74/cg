import java.awt.EventQueue;

import javax.swing.JFrame;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	
	
	public void initUI() {
		setTitle("Janela Teste Felipe");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Janela ex = new Janela();
				ex.initUI();
				ex.setVisible(true);
			}
		});
	}
}
