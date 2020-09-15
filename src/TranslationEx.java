import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

class SurfaceTest extends JPanel {
	private static final long serialVersionUID = 1L;
	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g.create();

		g2d.setPaint(new Color(150, 150, 150));
		g2d.fillRect(20, 20, 80, 50);
		g2d.translate(150, 50);
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

		add(new SurfaceTest());

		setTitle("Translation");
		setSize(300, 200);
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