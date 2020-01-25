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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;

public class View extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel clock;
	private JButton create;
    public JButton calen;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close() {
		
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSED);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	
	public void clock1()
	{
		Thread clock1=new Thread()
				{
			public void run ()
			{
				try {
					for(;;) {
					java.util.Calendar cal= new GregorianCalendar();
					int day = cal .get(java.util.Calendar.DAY_OF_MONTH);
					int month = cal .get(java.util.Calendar.MONTH);
					int year = cal .get(java.util.Calendar.YEAR);
					
					int second = cal .get(java.util.Calendar.SECOND);
					int minute= cal .get(java.util.Calendar.MINUTE);
					int hour = cal .get(java.util.Calendar.HOUR);
					//clock=new JLabel();
					clock.setText("Time :"+hour+":"+minute+":"+second+"   "+"Date :"+year+"/"+month+"/"+day);
					
					sleep(1000);
					}
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				};
	
				clock1.start();
		
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 300, 463, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel = new JLabel("Events Manager");
		lblNewLabel.setForeground(new Color(176, 224, 230));
		lblNewLabel.setBackground(new Color(47, 79, 79));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblNewLabel.setBounds(0, 0, 445, 61);
		contentPane.add(lblNewLabel);
		
		create = new JButton("New Event");
		create.setOpaque(false);
		JFrame f=this;
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Create c=new Create();
				c.parent=f;
				c.setVisible(true);
				f.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		create.setFont(new Font("Serif", Font.PLAIN, 26));
		create.setBackground(new Color(30, 144, 255));
		create.setBounds(27, 126, 165, 61);
		contentPane.add(create);
		
		JButton view = new JButton("View All");
		view.setOpaque(false);
		view.setFont(new Font("Serif", Font.PLAIN, 26));
		view.setBackground(new Color(30, 144, 255));
		view.setBounds(27, 216, 165, 61);
		contentPane.add(view);
		
		JButton today = new JButton("Today");
		today.setOpaque(false);
		today.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		today.setBackground(new Color(30, 144, 255));
		today.setFont(new Font("Serif", Font.PLAIN, 26));
		today.setForeground(new Color(0, 0, 0));
		today.setBounds(240, 126, 165, 61);
		contentPane.add(today);
		
		JButton remove = new JButton("Remove");
		JFrame m=this;
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Remove r=new Remove();
				r.parent1=m;
				r.setVisible(true);
				m.setVisible(false);

			}
			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		remove.setOpaque(false);
		remove.setFont(new Font("Serif", Font.PLAIN, 26));
		remove.setBackground(new Color(30, 144, 255));
		remove.setBounds(240, 216, 165, 61);
		contentPane.add(remove);
		
		JButton share = new JButton("Share");
		share.setOpaque(false);
		share.setFont(new Font("Serif", Font.PLAIN, 26));
		share.setBackground(new Color(30, 144, 255));
		share.setBounds(27, 302, 165, 57);
		contentPane.add(share);
		View fr=this;
		calen = new JButton("Calendar");
		calen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calendar cal=new Calendar();
				cal.parent=fr;
				cal.setVisible(true);
				calen.setEnabled(false);
				
			}

			
		});
		calen.setOpaque(false);
		calen.setFont(new Font("Serif", Font.PLAIN, 26));
		calen.setBackground(new Color(30, 144, 255));
		calen.setBounds(240, 302, 165, 57);
		contentPane.add(calen);
		
		clock = new JLabel("New Time");
		clock.setFont(new Font("Tahoma", Font.BOLD, 22));
		clock1();
		clock.setBounds(12, 386, 378, 42);
		contentPane.add(clock);
	}
}
