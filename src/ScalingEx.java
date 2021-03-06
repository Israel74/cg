import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JFrame;
import javax.swing.JPanel;

class SurfaceScale extends JPanel {

	private static final long serialVersionUID = 1L;

	private void doDrawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();

		g2d.setColor(new Color(255, 0, 0));
		g2d.fillRect(20, 20, 80, 50);

		AffineTransform tx1 = new AffineTransform();
		tx1.translate(110, 22);
		tx1.scale(0.5, 0.5);

		g2d.setTransform(tx1);
		g2d.setColor(new Color(0, 255, 0));
		g2d.fillRect(0, 0, 80, 50);

		AffineTransform tx2 = new AffineTransform();
		tx2.translate(170, 20);
		tx2.scale(1.5, 1.5);
		//tx2.shear(1, 2);
		tx2.rotate(Math.toRadians(-45));

		g2d.setTransform(tx2);
		g2d.setColor(new Color(0, 0, 255));
		g2d.fillRect(0, 0, 80, 50);

		g2d.dispose();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
	}
}

public class ScalingEx extends JFrame {

	private static final long serialVersionUID = 1L;

	public ScalingEx() {
		initUI();
	}

	private void initUI() {
		add(new SurfaceScale());
		setTitle("Scaling");
		setSize(330, 160);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				ScalingEx ex = new ScalingEx();
				ex.setVisible(true);
			}
		});
	}
}