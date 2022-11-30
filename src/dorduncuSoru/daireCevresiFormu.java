package dorduncuSoru;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class daireCevresiFormu {

	private JFrame frame;
	private final JLabel lblYaricap = new JLabel("Yarıcap");
	private final JTextField txtYaricap = new JTextField();
	private final JButton btnSonuc = new JButton("Sonuc");
	private final JLabel lblSonuc = new JLabel("Sonuc");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					daireCevresiFormu window = new daireCevresiFormu();
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
	public daireCevresiFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtYaricap.setBounds(176, 21, 86, 20);
		txtYaricap.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblYaricap.setBounds(23, 24, 86, 14);
		
		frame.getContentPane().add(lblYaricap);
		
		frame.getContentPane().add(txtYaricap);
		btnSonuc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	daireCevresi daire = new daireCevresi();
				

				
				int yarıCap=Integer.valueOf(txtYaricap.getText());
				
				double daireCevresi=daire.HesapYap(yarıCap);
							
				
				lblSonuc.setText("Dairenin cevresi:"+daireCevresi);
			}
			
		});
		btnSonuc.setBounds(205, 84, 89, 23);
		
		frame.getContentPane().add(btnSonuc);
		lblSonuc.setBounds(33, 189, 261, 23);
		
		frame.getContentPane().add(lblSonuc);
	}

}
