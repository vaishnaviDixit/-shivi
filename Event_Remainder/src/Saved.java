import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

public class Saved extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JLabel evename;
	public JLabel eveloc;
	public JLabel evedes;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			Saved dialog = new Saved();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	public void close() {
		
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	/**
	 * Create the dialog.
	 */
	public Saved(String event,String location,String desc) {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(1000, 300, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblEventSavedSuccessfully = new JLabel("Reminder Set");
			lblEventSavedSuccessfully.setForeground(Color.WHITE);
			lblEventSavedSuccessfully.setOpaque(true);
			lblEventSavedSuccessfully.setBackground(Color.BLUE);
			lblEventSavedSuccessfully.setHorizontalAlignment(SwingConstants.CENTER);
			lblEventSavedSuccessfully.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 28));
			lblEventSavedSuccessfully.setBounds(0, 0, 432, 47);
			contentPanel.add(lblEventSavedSuccessfully);
		}
		
		JLabel lblNewLabel = new JLabel("Event Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(0, 60, 96, 29);
		contentPanel.add(lblNewLabel);
		
		evename = new JLabel(event);
		evename.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		evename.setBounds(103, 60, 317, 29);
		contentPanel.add(evename);
		{
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setBounds(95, 60, 325, 29);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblEventLocation = new JLabel("Event Location :");
			lblEventLocation.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblEventLocation.setBounds(0, 95, 114, 29);
			contentPanel.add(lblEventLocation);
		}
		{
			JLabel lblEventDescription = new JLabel("Event Description :");
			lblEventDescription.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblEventDescription.setBounds(0, 137, 134, 29);
			contentPanel.add(lblEventDescription);
		}
		
		eveloc = new JLabel(location);
		eveloc.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		eveloc.setBounds(121, 95, 299, 29);
		contentPanel.add(eveloc);
		{
			evedes = new JLabel(desc);
			evedes.setFont(new Font("Lucida Handwriting", Font.PLAIN, 16));
			evedes.setVerticalAlignment(SwingConstants.TOP);
			evedes.setBounds(146, 144, 274, 61);
			contentPanel.add(evedes);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					close();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
