import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Remove extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public JFrame parent1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remove frame = new Remove();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public void close() {
		
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	/**
	 * Create the frame.
	 */
	public Remove() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(520, 300, 494, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Remove Your Events");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(128, 128, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setBounds(5, 5, 466, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Event Date :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(25, 87, 134, 61);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setBounds(181, 102, 233, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnConfirm = new JRadioButton("Confirm Delete");
		rdbtnConfirm.setBounds(303, 214, 127, 25);
		contentPane.add(rdbtnConfirm);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new View().setVisible(true);
				this.setVisible(false);
				close();
			}
			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(185, 267, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnView = new JButton("View");
		btnView.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnView.setBounds(178, 214, 85, 25);
		contentPane.add(btnView);
		
		JLabel lblEventType = new JLabel("Event Type :");
		lblEventType.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblEventType.setBounds(25, 149, 134, 61);
		contentPane.add(lblEventType);
		
		JButton btnRemove = new JButton("Delete");
		btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRemove.setBounds(334, 269, 97, 25);
		contentPane.add(btnRemove);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Meeting", "Work", "Birthday/Anniversary", "Others"}));
		comboBox.setBounds(181, 169, 233, 25);
		contentPane.add(comboBox);
	}
}
