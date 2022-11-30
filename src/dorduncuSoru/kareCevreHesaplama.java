package dorduncuSoru;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kareCevreHesaplama {

	private JFrame frame;
	private final JLabel lblKareCevre = new JLabel("KareCevre");
	private final JTextField txtKenarUzunlugu = new JTextField();
	private final JButton btnSonuc = new JButton("Sonuc");
	private final JLabel lblSonuc = new JLabel("Sonuc:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kareCevreHesaplama window = new kareCevreHesaplama();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kareCevreHesaplama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtKenarUzunlugu.setBounds(176, 26, 86, 20);
		txtKenarUzunlugu.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblKareCevre.setBounds(28, 29, 95, 14);
		
		frame.getContentPane().add(lblKareCevre);
		
		frame.getContentPane().add(txtKenarUzunlugu);
		btnSonuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				kareCevre kare = new kareCevre();
				

				
				int kenar=Integer.valueOf(txtKenarUzunlugu.getText());
				
				double kareCevresi=kare.HesapYap(kenar);
							
				
				lblSonuc.setText("Kare Cevresi:"+kareCevresi);
			}
		});
		btnSonuc.setBounds(201, 94, 89, 23);
		
		frame.getContentPane().add(btnSonuc);
		lblSonuc.setBounds(28, 215, 262, 20);
		
		frame.getContentPane().add(lblSonuc);
	}

}
