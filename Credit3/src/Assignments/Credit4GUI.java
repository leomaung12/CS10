package Assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Credit4GUI {

	private JFrame frame;
	private final JPanel tfn = new JPanel();
	private JTextField ftn;
	private JTextField tln;
	private JLabel age;
	private JButton rs;
	
	ImageIcon img1 = new ImageIcon("C:\\Users\\1100049812\\git\\CS10\\Credit3\\src\\Assignments\\images.png");
	ImageIcon img2 =  new ImageIcon("C:\\Users\\1100049812\\git\\CS10\\Credit3\\src\\Assignments\\cola.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit4GUI window = new Credit4GUI();
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
	public Credit4GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 776, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		tfn.setBounds(29, 11, 687, 524);
		tfn.setBackground(SystemColor.activeCaption);
		
		frame.getContentPane().add(tfn);
		tfn.setLayout(null);
		
		JLabel fn = new JLabel("First Name?");
		fn.setBounds(10, 11, 97, 23);
		tfn.add(fn);
		
		ftn = new JTextField();
		ftn.setBounds(92, 12, 147, 20);
		tfn.add(ftn);
		ftn.setColumns(10);
		
		JLabel ln1 = new JLabel("Last Name?");
		ln1.setBounds(10, 98, 97, 23);
		tfn.add(ln1);
		
		tln = new JTextField();
		tln.setBounds(92, 99, 147, 20);
		tln.setColumns(10);
		tfn.add(tln);
		
		age = new JLabel("Grade?");
		age.setBounds(8, 173, 97, 23);
		tfn.add(age);
		
		JLabel pic = new JLabel("");
		pic.setBounds(264, 264, 243, 188);
		tfn.add(pic);
		
		
		JComboBox g2 = new JComboBox();
		g2.setBounds(92, 173, 147, 22);
		g2.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		tfn.add(g2);
		JButton sb = new JButton("Submit");
		sb.setBounds(324, 52, 128, 61);
		sb.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) 
			{
				
				String fn = ftn.getText();
				String ln = tln.getText();
				int grade;
				
				
				if(g2.getSelectedItem().equals("10"))
				{
					grade = 10;
					pic.setIcon(img1);
				}
				else if (g2.getSelectedItem().equals("11"))
				{
					grade = 11;
					CREDI K 

				}
				else 
				{
					grade = 12;
				}
				
				//dis.setText("Your First name is: " + fn + "Your Last name is: " + ln + "Your grade is  : " + grade);
			} 
		}
			
				
			
		
		);
		tfn.add(sb);
		
		rs = new JButton("Reset");
		rs.setBounds(324, 154, 128, 61);
		tfn.add(rs);
		
		
		
		
	}
}
