package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class LibraryManagementSystem extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;//auto generated default
	
	JLabel l1,l2;
        JButton b1;
        JComboBox jComboBox1;
        private String timeZone;
        public LibraryManagementSystem() {
        	setTitle("Library Management System");
                setSize(864, 486);
                setLayout(null);
               
                Font font = new Font("Times New Roman", Font.BOLD,12);
                Font font1 = new Font("Times New Roman", Font.BOLD,25);
                l1 = new JLabel("");
                b1 = new JButton("Welcome To Digital Library");
                
                b1.setBackground(Color.WHITE);
                b1.setFont(font);
                b1.setForeground(Color.BLACK);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/lib.jpg"));
                Image i3 = i1.getImage().getScaledInstance(864, 486,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                l2=new JLabel("");
                
                b1.setBounds(640,350,200,60);
                l2.setBounds(350,150,30,40);
		l1.setBounds(0, 0, 864, 486);
                l2.setFont(font1);
                l2.setText("Welcome to Libaary Management System");
                
                JLabel label=new JLabel("Select Time Zone:");
                label.setFont(new Font("Times New Roman",Font.BOLD,20));
                label.setBounds(50,50,200,30);
                label.setForeground(Color.red);
                
                jComboBox1 = new JComboBox();
                jComboBox1.setFont(font);
                String[] ids = TimeZone.getAvailableIDs();
                for(String id:ids)
                    jComboBox1.addItem(id);
                jComboBox1.setBounds(250,50,270,30);
        
                l1.add(b1);
                l1.add(l2);
                l1.add(label);
                l1.add(jComboBox1);
                add(l1);
                
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ImageIcon iconLogoMain  = new ImageIcon(ClassLoader.getSystemResource("icons/logoMain.png"));
                Image imageLogoMain = iconLogoMain.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT);
                setIconImage(imageLogoMain);
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                timeZone=(String) jComboBox1.getSelectedItem();
                new Admin_Student(timeZone).setVisible(true);
                this.setVisible(false);
                
        }
        private static String displayTimeZone(TimeZone tz) {

        long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
        long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) 
                                  - TimeUnit.HOURS.toMinutes(hours);
        // avoid -4:-30 issue
        minutes = Math.abs(minutes);

        String result = "";
        if (hours > 0) {
            result = String.format("(GMT+%d:%02d) %s", hours, minutes, tz.getID());
        } else {
            result = String.format("(GMT%d:%02d) %s", hours, minutes, tz.getID());
        }

        return result;

    }
        
        public static void main(String[] args) {
                LibraryManagementSystem window = new LibraryManagementSystem();
                window.setVisible(true);
                
                
	}
}

