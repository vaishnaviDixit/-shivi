import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.GregorianCalendar;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JCalendar;
import java.awt.Font;

public class Calendar extends JFrame {

	private JPanel contentPane;
	public View parent;
    private JCalendar calendar;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Calendar() {
		
		setBounds(1000, 300, 600, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		calendar = new JCalendar();
		calendar.getMonthChooser().getComboBox().setFont(new Font("Tahoma", Font.PLAIN, 16));
		calendar.getYearChooser().getSpinner().setFont(new Font("Tahoma", Font.PLAIN, 19));
		calendar.setBounds(0, 0, 587, 387);
		contentPane.add(calendar);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				parent.calen.setEnabled(true);
				setVisible(false);
			}
		});
		loadEvents();
		
	}

	private void loadEvents() {
		String url = "jdbc:mysql://127.0.0.1:3306/mydb";
		String uName ="root";
		String pwd = "";
		Connection conn=null;
		Component comp[]=contentPane.getComponents();
	     java.util.Calendar cal= new GregorianCalendar();
			int day = cal .get(java.util.Calendar.DAY_OF_MONTH);
			int month = cal .get(java.util.Calendar.MONTH);
			int year = cal .get(java.util.Calendar.YEAR);
			//int offset = cal.get(Calendar.DAY_OF_WEEK);
			/*int second = cal .get(java.util.Calendar.SECOND);
			int minute= cal .get(java.util.Calendar.MINUTE);
			int hour = cal .get(java.util.Calendar.HOUR);
			*/

	    String sql2 = "SELECT date,year,month FROM reminder";
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, uName, pwd);
			Statement s;
			    s = conn.createStatement();
	        ResultSet rs = s.executeQuery(sql2);

	        while (rs.next()) {
	            String yr = rs.getString("year");
	            String mn = rs.getString("month");
	            String dy = rs.getString("date");
	            String mon[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
	            
	            int da=Integer.parseInt(dy);
                  //System.out.println(da);
                  // System.out.println(yr+" "+year);
                  // System.out.println(mn +" "+mon[month]);
                   
	            if(mn.equalsIgnoreCase(mon[month]) && yr.equalsIgnoreCase(String.valueOf(year))){
	              //  component[dayOfMonth + offset].setBackground(Color.green);
	            	//comp[da].setBackground(Color.green);
	            	//System.out.println(da+" "+comp[da].getName());
		               
	            }
	           
	        	 /* if(yr.equals(String.valueOf(year)) && mon[month].equals(mn))
	            {
                   comp[da].setBackground(Color.green);
	                System.out.println("Convert to green");
	            }*/
	        
	            }
	    }catch (Exception e) {
		System.out.println(e.getMessage());
		}
	
		
	}
	
}
