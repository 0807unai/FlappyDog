import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;


public class FlappyBird extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private AreaJuego areaJuego;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlappyBird frame = new FlappyBird();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FlappyBird() {
		setResizable(false);
		setTitle("FlappyBird");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		areaJuego = new AreaJuego();
		contentPane.add(areaJuego, BorderLayout.CENTER);
		
		JPanel areaJuegos = new JPanel();
		contentPane.add(areaJuegos, BorderLayout.NORTH);
		areaJuego.setFocusable(true);
		areaJuego.requestFocus();

	}

}
