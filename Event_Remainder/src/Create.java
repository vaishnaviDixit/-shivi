import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import java.awt.Choice;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Checkbox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class Create extends JFrame {

	private JPanel contentPane;
	private JTextField eventname;
	private JTextField locname;
	public JFrame parent;
	private JTextArea desc;
	private JRadioButton r1,r2,r3,r4;
	private JComboBox date;
	private JComboBox sec ;
	private JComboBox hr;
	private JComboBox mi;
	private JComboBox year;
	 private JComboBox mon;
	private final ButtonGroup buttonGroup = new ButtonGroup();
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create frame = new Create();
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
	public Create() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(280, 300, 731, 511);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Your New Event");
		lblNewLabel.setForeground(new Color(135, 206, 250));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(25, 25, 112));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblNewLabel.setBounds(5, 5, 698, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblEvent = new JLabel("Event");
		lblEvent.setBackground(new Color(192, 192, 192));
		lblEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvent.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblEvent.setBounds(5, 72, 72, 26);
		contentPane.add(lblEvent);
		
		eventname = new JTextField();
		eventname.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		eventname.setBounds(77, 72, 242, 24);
		contentPane.add(eventname);
		eventname.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblLocation.setBounds(331, 72, 83, 26);
		contentPane.add(lblLocation);
		
		locname = new JTextField();
		locname.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		locname.setBounds(420, 72, 276, 26);
		contentPane.add(locname);
		locname.setColumns(10);
		
		JLabel start = new JLabel("Start");
		start.setHorizontalAlignment(SwingConstants.CENTER);
		start.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		start.setBackground(Color.LIGHT_GRAY);
		start.setBounds(102, 109, 72, 26);
		contentPane.add(start);
		
		JLabel lblMonth = new JLabel("Month :");
		lblMonth.setFont(new Font("Sitka Small", Font.PLAIN, 20));
		lblMonth.setBounds(15, 142, 83, 24);
		contentPane.add(lblMonth);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setFont(new Font("Sitka Small", Font.PLAIN, 20));
		lblDate.setBounds(15, 179, 83, 24);
		contentPane.add(lblDate);
		
		JLabel lblHour = new JLabel("Hour :");
		lblHour.setFont(new Font("Sitka Small", Font.PLAIN, 20));
		lblHour.setBounds(15, 256, 83, 24);
		contentPane.add(lblHour);
		
		JLabel label = new JLabel("Minute :");
		label.setFont(new Font("Sitka Small", Font.PLAIN, 20));
		label.setBounds(15, 293, 96, 24);
		contentPane.add(label);
		
		JLabel lblYear = new JLabel("Year :");
		lblYear.setFont(new Font("Sitka Small", Font.PLAIN, 20));
		lblYear.setBounds(15, 216, 83, 24);
		contentPane.add(lblYear);
		
		JButton btnSave = new JButton("Save");
		Create f=this;
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!eventname.getText().equals("") && !desc.getText().equals("") )
				{
				saveDataInDB();
				
				this.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(f, "Incomplete Entry","Alert",JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnSave.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 17));
		btnSave.setBounds(599, 409, 97, 42);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 17));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new View().setVisible(true);
				this.setVisible(false);
				close();
				
			}
			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnCancel.setBounds(465, 409, 97, 42);
		contentPane.add(btnCancel);
		
		JLabel lblDescripition = new JLabel("Description :");
		lblDescripition.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripition.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblDescripition.setBackground(Color.LIGHT_GRAY);
		lblDescripition.setBounds(331, 111, 153, 26);
		contentPane.add(lblDescripition);
		
		desc = new JTextArea();
		desc.setFont(new Font("Lucida Handwriting", Font.PLAIN, 16));
		desc.setBackground(new Color(255, 255, 255));
		desc.setBounds(331, 154, 352, 204);
		contentPane.add(desc);
		
		JLabel lblCategory = new JLabel("Category :");
		lblCategory.setFont(new Font("Sitka Small", Font.PLAIN, 20));
		lblCategory.setBounds(15, 377, 115, 24);
		contentPane.add(lblCategory);
		
		r1 = new JRadioButton("Meeting");
		r1.setSelected(true);
		buttonGroup.add(r1);
		r1.setBounds(138, 377, 127, 25);
		contentPane.add(r1);
		
		r2 = new JRadioButton("Work");
		buttonGroup.add(r2);
		r2.setBounds(300, 377, 127, 25);
		contentPane.add(r2);
		
		r3 = new JRadioButton("Birthday/Anniversary");
		buttonGroup.add(r3);
		r3.setBounds(138, 420, 147, 25);
		contentPane.add(r3);
		
		 r4 = new JRadioButton("Others");
		buttonGroup.add(r4);
		r4.setBounds(300, 420, 127, 25);
		contentPane.add(r4);
		
		mon = new JComboBox();
		mon.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		mon.setBounds(112, 143, 173, 22);
		contentPane.add(mon);
		
		date = new JComboBox();
		date.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		date.setBounds(112, 180, 173, 22);
		contentPane.add(date);
		
		year = new JComboBox();
		year.setModel(new DefaultComboBoxModel(new String[] {"2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060"}));
		year.setBounds(112, 217, 173, 22);
		contentPane.add(year);
		
		hr = new JComboBox();
		hr.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		hr.setBounds(112, 257, 173, 22);
		contentPane.add(hr);
		
		mi = new JComboBox();
		mi.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		mi.setBounds(112, 294, 173, 22);
		contentPane.add(mi);
		
		JLabel lblSecond = new JLabel("Second :");
		lblSecond.setFont(new Font("Sitka Small", Font.PLAIN, 20));
		lblSecond.setBounds(15, 330, 96, 24);
		contentPane.add(lblSecond);
		
	    sec = new JComboBox();
		sec.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		sec.setBounds(112, 330, 173, 22);
		contentPane.add(sec);
	}

	protected void saveDataInDB() {
		String url = "jdbc:mysql://127.0.0.1:3306/mydb";
		String uName ="root";
		String pwd = "";
		Connection conn=null;
		String event="",location="",description="",da="",ye="",hour="",minute="",second="",category="",month="";
		try
		{
			event=eventname.getText();
			description=desc.getText();
			location=locname.getText();
			
			da=String.valueOf(date.getSelectedItem().toString());
			month=String.valueOf(mon.getSelectedItem().toString());
		    ye=String.valueOf(year.getSelectedItem().toString());
			hour=String.valueOf(hr.getSelectedItem().toString());
			minute=String.valueOf(mi.getSelectedItem().toString());
			second=String.valueOf(sec.getSelectedItem().toString());
			if(r1.isSelected())
				category=r1.getText();
			else if (r2.isSelected())
				category=r2.getText();
			else if (r3.isSelected())
				category=r3.getText();
			
			else if (r4.isSelected())
				category=r4.getText();
					
			//System.out.println("Before CON");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, uName, pwd);
			Statement s;
			    s = conn.createStatement();
			    //System.out.println("Before SQL");
			    s.executeUpdate("insert into reminder(event,location,description,date,year,hour,minute,second,category,month) values('"+event+"','"+location+"','"+description+"',"+da+","+ye+","+hour+","+minute+","+second+",'"+category+"','"+month+"')");
			    //conn.commit();
			    
			    
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				conn.close();
			Saved sa=new Saved(event,location,description);
		    sa.setVisible(true);
		    
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
