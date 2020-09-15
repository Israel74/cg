import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class SurfacePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private void doDrawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setPaint(new Color(150, 150, 150));
		g2d.fillRect(0, 100, 80, 50);
		g2d.fillOval(100, 100, 30, 30);
		// super.paintComponent(g2d); // resetar o componente Pannel
		g2d.translate(150, 50);
		g2d.setPaint(new Color(150, 150, 150));
		g2d.fillRect(20, 20, 80, 50);
		g2d.dispose();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
	}
}

public class TranslationEx extends JFrame {
	private static final long serialVersionUID = 1L;

	public TranslationEx() {
		initUI();
	}

	private void initUI() {
		add(new SurfacePanel());
		setTitle("Translation");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				TranslationEx ex = new TranslationEx();
				ex.setVisible(true);
			}
		});
	}
}