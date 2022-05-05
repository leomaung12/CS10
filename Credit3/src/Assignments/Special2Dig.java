package Assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Special2Dig {

	private JFrame frame;
	private JTextField td;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Special2Dig window = new Special2Dig();
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
	public Special2Dig() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 168);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel L1 = new JLabel("Enter two digits");
		L1.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		L1.setBounds(10, 39, 135, 19);
		panel.add(L1);
		
		td = new JTextField();
		td.setBounds(155, 33, 45, 29);
		panel.add(td);
		td.setColumns(10);
		
		JLabel L2 = new JLabel("");
		L2.setBounds(0, 105, 434, 63);
		panel.add(L2);
		
		JButton Enter = new JButton("Reset");
		Enter.setForeground(SystemColor.activeCaption);
		Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Enter.setBounds(241, 57, 89, 23);
		panel.add(Enter);
		
		JButton Enter_1 = new JButton("Enter");
		Enter_1.setForeground(SystemColor.activeCaption);
		Enter_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String TwoDigit = td.getText();//record the two digits
				int twoD = Integer.parseInt(TwoDigit);//get the integer part 
				int firstD = twoD / 10; // get the first digit
				int secondD = twoD % 10;//record second digit]
				
				int sum  = (firstD + secondD);//record the sum
				
				int prdc = firstD*secondD;//record the product

				
				L2.setText("" + firstD);
				System.out.println();
			}
		});
		Enter_1.setBounds(241, 11, 89, 23);
		panel.add(Enter_1);
	}
}
