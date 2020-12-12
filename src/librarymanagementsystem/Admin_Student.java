package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Admin_Student extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;//auto generated default
	
	JLabel l1,l2,l3;
        JButton b1,b2;
        private String timeZone;
        public Admin_Student() {
        	setTitle("Library Management System");
                setSize(864, 486);
                setLayout(null);
               
                Font font = new Font("Monospaced", Font.BOLD,18);
                Font font1 = new Font("Times New Roman", Font.BOLD,25);
                l1 = new JLabel("");
                b1 = new JButton("Login as Admin");
                b2 = new JButton("Login as Student");
                
                b1.setBackground(Color.WHITE);
                b1.setFont(font);
                b1.setForeground(Color.BLACK);
                
                b2.setBackground(Color.WHITE);
                b2.setFont(font);
                b2.setForeground(Color.BLACK);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/lib.jpg"));
                Image i3 = i1.getImage().getScaledInstance(864, 486,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                l2=new JLabel("");
                
                b1.setBounds(300,90,240,60);
                b2.setBounds(300,190,240,60);
                l2.setBounds(350,150,30,40);
		l1.setBounds(0, 0, 864, 486);
                
                l2.setFont(font1);
                l2.setText("Welcome to Libaary Management System");
                
                l1.add(b1);
                l1.add(b2);
                l1.add(l2);
                add(l1);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ImageIcon iconLogoMain  = new ImageIcon(ClassLoader.getSystemResource("icons/logoMain.png"));
                Image imageLogoMain = iconLogoMain.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT);
                setIconImage(imageLogoMain);
                b1.addActionListener(this);
                b2.addActionListener(this);
	}
        
        public Admin_Student(String timeZone)
        {
                this.timeZone=timeZone;
                setTitle("Library Management System");
                setSize(864, 486);
                setLayout(null);
               
                Font font = new Font("Monospaced", Font.BOLD,18);
                Font font1 = new Font("Times New Roman", Font.BOLD,25);
                l1 = new JLabel("");
                b1 = new JButton("Login as Admin");
                b2 = new JButton("Login as Student");
                
                b1.setBackground(Color.WHITE);
                b1.setFont(font);
                b1.setForeground(Color.BLACK);
                
                b2.setBackground(Color.WHITE);
                b2.setFont(font);
                b2.setForeground(Color.BLACK);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/lib.jpg"));
                Image i3 = i1.getImage().getScaledInstance(864, 486,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                l2=new JLabel();
                
                this.timeZone=timeZone;
                Date today = new Date();
                DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
                df.setTimeZone(TimeZone.getTimeZone(timeZone));
                String dateTime = df.format(today);
                l3=new JLabel(dateTime);
                l3.setBounds(0,0,300,50);
                l1.add(l3);
                
                b1.setBounds(300,90,240,60);
                b2.setBounds(300,190,240,60);
                l2.setBounds(350,150,30,40);
		l1.setBounds(0, 0, 864, 486);
                                
                l2.setFont(font1);
                l2.setText("Welcome to Libaary Management System");
                
                l1.add(b1);
                l1.add(b2);
                l1.add(l2);
                
                add(l1);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ImageIcon iconLogoMain  = new ImageIcon(ClassLoader.getSystemResource("icons/logoMain.png"));
                Image imageLogoMain = iconLogoMain.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT);
                setIconImage(imageLogoMain);
                b1.addActionListener(this);
                b2.addActionListener(this);
        }
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==b1)
            {
                new Login_user(timeZone).setVisible(true);
                this.setVisible(false);
            }
            else if(ae.getSource()==b2)
            {
                new StudentPanel(timeZone).setVisible(true);
                this.setVisible(false);
            }       
        }
        public static void main(String[] args) {
                Admin_Student admin_student = new Admin_Student();
                admin_student.setVisible(true);			
	}
}

