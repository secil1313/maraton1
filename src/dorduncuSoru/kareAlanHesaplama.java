package dorduncuSoru;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kareAlanHesaplama {

	private JFrame frame;
	private final JLabel lblKenarUzunlugu = new JLabel("KenarUzunlugu");
	private final JTextField txtKenarUzunlugu = new JTextField();
	private final JButton btnSonuc = new JButton("Sonuc");
	private final JLabel lblSonuc = new JLabel("Sonuc:");

	private kareAlan kare;
	protected double kenar;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kareAlanHesaplama window = new kareAlanHesaplama();
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
	public kareAlanHesaplama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtKenarUzunlugu.setBounds(170, 20, 86, 20);
		txtKenarUzunlugu.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblKenarUzunlugu.setBounds(30, 23, 98, 14);
		
		frame.getContentPane().add(lblKenarUzunlugu);
		
		frame.getContentPane().add(txtKenarUzunlugu);
		btnSonuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				kare=new kareAlan();
				
//				lblSonuc.setText(kare.HesapYap(Double.valueOf(txtKenarUzunlugu.getText())));
				
				int kenar=Integer.valueOf(txtKenarUzunlugu.getText());
				//kullanıcıdan aldıgımız txtdogumYilina erişiyoruz sonra integera ceviriyoruz
				double kareAlani=kare.HesapYap(kenar);
							
				
				lblSonuc.setText("Kare Alani:"+kareAlani);
				
			}
		});
		btnSonuc.setBounds(179, 85, 89, 23);
		
		frame.getContentPane().add(btnSonuc);
		lblSonuc.setBounds(30, 185, 274, 20);
		
		frame.getContentPane().add(lblSonuc);
	}
}
