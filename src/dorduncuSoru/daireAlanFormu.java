package dorduncuSoru;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class daireAlanFormu {

	private JFrame frame;
	private final JLabel lblYarıcap = new JLabel("Yarıcap");
	private final JTextField txtYarıcap = new JTextField();
	private final JButton btnSonuc = new JButton("Sonuc");
	private final JLabel lblSonuc = new JLabel("Sonuc:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					daireAlanFormu window = new daireAlanFormu();
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
	public daireAlanFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtYarıcap.setBounds(171, 26, 86, 20);
		txtYarıcap.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblYarıcap.setBounds(37, 29, 73, 14);
		
		frame.getContentPane().add(lblYarıcap);
		
		frame.getContentPane().add(txtYarıcap);
		btnSonuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				daireAlan daire = new daireAlan();
				

				
				int yarıCap=Integer.valueOf(txtYarıcap.getText());
				
				double daireAlanı=daire.HesapYap(yarıCap);
							
				
				lblSonuc.setText("Dairenin alanı:"+daireAlanı);
			}
		});
		btnSonuc.setBounds(213, 119, 89, 23);
		
		frame.getContentPane().add(btnSonuc);
		lblSonuc.setBounds(37, 199, 263, 14);
		
		frame.getContentPane().add(lblSonuc);
	}

}
